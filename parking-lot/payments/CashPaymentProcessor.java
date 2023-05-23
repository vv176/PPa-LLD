package parking.payments;

public class CashPaymentProcessor implements PaymentProcessor{

    private final double amount;

    public CashPaymentProcessor(double amount) {
        this.amount = amount;
    }

    @Override
    public boolean executePayment() {
        return false;
    }

    @Override
    public double getAmount() {
        return 0;
    }
}
