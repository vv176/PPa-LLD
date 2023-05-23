package ecommerce.payments;

public interface PaymentProcessor {

    boolean processPayment();
    double getPayableAmount();
}
