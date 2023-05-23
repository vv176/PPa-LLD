package atmmachine.state;

public enum ATMState {

    READY,
    CARD_READING,
    WITHDRAWAL_DETAILS_READING,
    CASH_DISPENSING,
    CARD_EJECTING

}
