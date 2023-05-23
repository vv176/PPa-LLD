package parking.payments;

public class PaymentProcessorFactory {

    private PaymentProcessorFactory() {}

    public  static PaymentProcessor
    getCardBasedPaymentProcessor(double amount, CardDetails cardDetails)
    {
        return new CardPaymentProcessor(amount, cardDetails);
    }

    public  static PaymentProcessor
            getCashBasedPaymentProcessor(double amount)
    {
        return new CashPaymentProcessor(amount);
    }
}
