package atmmachine.card;

public class CardManagerFactory {

    private CardManagerFactory() {}

    public static CardManager getCardManager(CardType cardType) {
        CardManager cardManager = null;
        if (cardType.equals(CardType.DEBIT))
            cardManager = new DebitCardManager();
        else if(cardType.equals(CardType.CREDIT))
            cardManager = new CreditCardManager();
        else
            throw new IllegalArgumentException();
        return cardManager;
    }

}
