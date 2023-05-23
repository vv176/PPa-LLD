package atmmachine.state;

import atmmachine.card.CardDetails;

public interface State {

    int init();

    boolean readCard(CardDetails cardDetails);

    boolean cancelTransaction(int transId);

    boolean readWithdrawalDetails(CardDetails cardDetails,
                                  int transId, float amount);

    float dispenseCash(int transId);

    void ejectCard();

    ATMState getStateName();

}
