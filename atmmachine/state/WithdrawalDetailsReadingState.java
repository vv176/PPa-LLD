package atmmachine.state;

import atmmachine.atm.ATM;
import atmmachine.card.CardDetails;
import atmmachine.card.CardManagerFactory;
import atmmachine.card.TransactionStatus;
import atmmachine.db.DBAccessor;

public class WithdrawalDetailsReadingState implements State{

    private final ATM atm;

    public WithdrawalDetailsReadingState(ATM atm) {
        this.atm = atm;
    }

    @Override
    public int init() {
        throw new IllegalStateException();
    }

    @Override
    public boolean readCard(CardDetails cardDetails) {
        throw new IllegalStateException();
    }

    @Override
    public boolean cancelTransaction(int transId) {
        DBAccessor.cancelTransaction(transId);
        this.atm.changeState(new CardEjectingState(this.atm));
        return true;
    }

    @Override
    public boolean readWithdrawalDetails(CardDetails cardDetails,
                                         int transId, float amount) {
           boolean res = CardManagerFactory.getCardManager(cardDetails.getCardType())
                    .validateWithdrawal(amount, transId);
           if (res) {
               this.atm.changeState(new CashDispensingState(this.atm));
               DBAccessor
                       .persistWithDetails(transId, amount, TransactionStatus.APPROVED);
           } else {
               this.atm.changeState(new CardEjectingState(this.atm));
               DBAccessor
                       .persistWithDetails(transId,
                               amount, TransactionStatus.NOT_APPROVED);
           }
           return res;

    }

    @Override
    public float dispenseCash(int transId) {
        throw new IllegalStateException();
    }

    @Override
    public void ejectCard() {
        throw new IllegalStateException();
    }

    @Override
    public ATMState getStateName() {
        return ATMState.WITHDRAWAL_DETAILS_READING;
    }

}
