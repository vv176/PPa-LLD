package fooddelsys.managers;

import fooddelsys.data.PaymentResponse;

public class NetBankingPaymentManager implements PaymentManager{

    private final String bankName;
    private final String userName;
    private final String passWord;
    private final String pin;
    private final double amount;

    public NetBankingPaymentManager(String bankName, String userName, String passWord, String pin, double amount) {
        this.bankName = bankName;
        this.userName = userName;
        this.passWord = passWord;
        this.pin = pin;
        this.amount = amount;
    }

    @Override
    public PaymentResponse executePayment() {
        return null;
    }
}
