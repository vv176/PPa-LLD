package parking.payments;

public class CardDetails {

    private final  String nameOnCard;
    private final  int pin;
    private final String cardNumber;

    public CardDetails(String nameOnCard, int pin, String cardNumber) {
        this.nameOnCard = nameOnCard;
        this.pin = pin;
        this.cardNumber = cardNumber;
    }
}
