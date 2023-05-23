package atmmachine.card;

public class CreditCardManager implements CardManager{
    @Override
    public boolean validateCard(CardDetails cardDetails) {
        return false;
    }

    @Override
    public boolean validateWithdrawal(float amount, int transId) {
        return false;
    }

    @Override
    public void executeWithdrawal(int transId) {

    }
}
