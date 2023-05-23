package atmmachine.state;

import atmmachine.atm.ATM;
import atmmachine.card.CardDetails;

public class CardEjectingState implements State{

    private final ATM atm;

    public CardEjectingState(ATM atm) {
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
        throw new IllegalStateException();
    }

    @Override
    public boolean readWithdrawalDetails(CardDetails cardDetails, int transId, float amount) {
        throw new IllegalStateException();
    }

    @Override
    public float dispenseCash(int transId) {
        throw new IllegalStateException();
    }

    @Override
    public void ejectCard() {
        this.atm.changeState(new ReadyState(this.atm));
    }

    @Override
    public ATMState getStateName() {
        return ATMState.CARD_EJECTING;
    }


}
