package parking.payments;

public interface PaymentProcessor {

    boolean executePayment();

    double getAmount();
}
