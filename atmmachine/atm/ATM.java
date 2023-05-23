package atmmachine.atm;

import atmmachine.card.CardDetails;
import atmmachine.db.DBAccessor;
import atmmachine.state.CardReadingState;
import atmmachine.state.State;
import atmmachine.state.StateFactory;

public class ATM {

    private State state;
    private final String machineId;

    public ATM(String machineId) {
        this.machineId = machineId;
        this.state = StateFactory
                .getState(DBAccessor.getATMState(this.machineId),
                this);
    }

    public int init() {
        int id = this.state.init();
        return id;
    }

    public boolean cancel(int transId) {
        return this.state.cancelTransaction(transId);
    }

    public boolean readCard(CardDetails cardDetails) {
        return this.state.readCard(cardDetails);
    }

    public boolean readWithdrawalDetails(CardDetails cardDetails, int transId, float amount) {
        return this.state.readWithdrawalDetails(cardDetails, transId, amount);
    }

    public float dispenseCash(int transId) {
        return this.state.dispenseCash(transId);
    }

    public void ejectCard() {
        this.state.ejectCard();
    }

    public State getState() {
        return state;
    }

    public String getMachineId() {
        return machineId;
    }

    public void changeState(State newState) {
        this.state = newState;
        DBAccessor.updateATMState(this.getMachineId(), newState.getStateName());
    }
}
