package fooddelsys.managers;

import fooddelsys.data.PaymentResponse;

public class CardBasedPaymentManager implements PaymentManager{


    private final String bankName;
    private final String cardNumber;
    private final String pin;
    private final double amount;

    public CardBasedPaymentManager(String bankName, String cardNumber, String pin, double amount) {
        this.bankName = bankName;
        this.cardNumber = cardNumber;
        this.pin = pin;
        this.amount = amount;
    }


    @Override
    public PaymentResponse executePayment() {
        return null;
    }
}
