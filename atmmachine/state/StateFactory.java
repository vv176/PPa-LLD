package atmmachine.state;

import atmmachine.atm.ATM;

public class StateFactory {

    private StateFactory() {}

    public static State getState(ATMState atmState, ATM atm) {
        State state = null;
        if (atmState.equals(ATMState.READY))
            state = new ReadyState(atm);
        else if (atmState.equals(ATMState.CARD_READING))
            state = new CardReadingState(atm);
        else if (atmState.equals(ATMState.WITHDRAWAL_DETAILS_READING))
            state = new WithdrawalDetailsReadingState(atm);
        else if (atmState.equals(ATMState.CASH_DISPENSING))
            state = new CashDispensingState(atm);
        else if (atmState.equals(ATMState.CARD_EJECTING))
            state = new CardEjectingState(atm);
        else
            throw new IllegalArgumentException("Invalid state");
        return state;
    }

}
