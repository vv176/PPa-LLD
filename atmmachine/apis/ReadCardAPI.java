package atmmachine.apis;

import atmmachine.atm.ATM;
import atmmachine.card.CardDetails;
import atmmachine.card.CardType;

public class ReadCardAPI {

    public boolean readCard(CardType cardType, long cardNumber, int pin, String name, String machineId) {
        CardDetails cardDetails = new CardDetails(cardType, cardNumber, pin, name);
        ATM atm = new ATM(machineId);
        return atm.readCard(cardDetails);
    }

}
