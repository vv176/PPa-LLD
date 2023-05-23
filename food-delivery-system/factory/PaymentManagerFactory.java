package fooddelsys.factory;

import fooddelsys.managers.CardBasedPaymentManager;
import fooddelsys.managers.NetBankingPaymentManager;
import fooddelsys.managers.PaymentManager;

import java.util.Map;

public class PaymentManagerFactory {

    private PaymentManagerFactory() {}

    public static PaymentManager getPaymentManager(String paymentMode,
                                                   Map<String, String> paymentInfo) {
        PaymentManager paymentManager = null;
        if (paymentMode.equals("NetBanking"))
            paymentManager = getNetBankingPaymentManager(paymentInfo);
        else if (paymentMode.equals("CardBased"))
            paymentManager = getCardBasedPaymentManager(paymentInfo);
        else
            throw new RuntimeException("Invalid paymentMode");
        return paymentManager;
    }

    private static PaymentManager getNetBankingPaymentManager(Map<String, String> paymentInfo) {
        return new NetBankingPaymentManager(paymentInfo.get("bankName"), paymentInfo.get("userName"),
                paymentInfo.get("passWord"), paymentInfo.get("pin"), Double.parseDouble(paymentInfo.get("amount")));
    }

    private static PaymentManager getCardBasedPaymentManager(Map<String, String> paymentInfo) {
        return new CardBasedPaymentManager(paymentInfo.get("bankName"), paymentInfo.get("cardNumber"),
                paymentInfo.get("pin"), Double.parseDouble(paymentInfo.get("amount")));
    }


}
