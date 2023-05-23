package atmmachine.state;

import atmmachine.atm.ATM;
import atmmachine.card.CardDetails;
import atmmachine.card.CardManagerFactory;
import atmmachine.card.CardType;
import atmmachine.db.DBAccessor;

public class CashDispensingState implements State{

    private final ATM atm;

    public CashDispensingState(ATM atm) {
        this.atm = atm;
    }

    @Override
    public int init() {
        throw new IllegalStateException();
    }

    @Override
    public boolean readCard(CardDetails cardDetails)
    {
        throw new IllegalStateException();
    }

    @Override
    public boolean cancelTransaction(int transId) {
        DBAccessor.cancelTransaction(transId);
        this.atm.changeState(new CardEjectingState(this.atm));
        return true;
    }

    @Override
    public boolean readWithdrawalDetails
            (CardDetails cardDetails, int transId, float amount) {
        throw new IllegalStateException();
    }

    @Override
    public float dispenseCash(int transId) {
        //
        CardType cardType = null;
        //
        CardManagerFactory.getCardManager(cardType)
                .executeWithdrawal(transId);
        this.atm.changeState(new CardEjectingState(this.atm));
         return DBAccessor.markAsExec(transId);
    }

    @Override
    public void ejectCard() {
        throw new IllegalStateException();
    }

    @Override
    public ATMState getStateName() {
        return ATMState.CASH_DISPENSING;
    }


}
