package atmmachine.card;

public class CardDetails {

    private final CardType cardType;
    private final long cardNumber;
    private final int pin;
    private final String name;

    public CardDetails(CardType cardType, long cardNumber, int pin, String name) {
        this.cardType = cardType;
        this.cardNumber = cardNumber;
        this.pin = pin;
        this.name = name;
    }

    public CardType getCardType() {
        return cardType;
    }

    public long getCardNumber() { return cardNumber; }

    public int getPin() {
        return pin;
    }

    public String getName() {
        return name;
    }

}
