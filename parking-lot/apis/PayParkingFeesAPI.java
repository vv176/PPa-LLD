package parking.apis;

import parking.data.Ticket;
import parking.payments.*;

import java.util.Map;

public class PayParkingFeesAPI {

    public boolean payParkingFee(Ticket ticket, PaymentMode paymentMode,
                                 Map<String, String> paymentDetails) {
        PaymentProcessor paymentProcessor = null;
        if (paymentMode.equals(PaymentMode.CARD)) {
            double amount = Double.parseDouble(paymentDetails.get("AMOUNT"));
            CardDetails cardDetails = null;
            // logic to create above object
            paymentProcessor = PaymentProcessorFactory.getCardBasedPaymentProcessor(
                    amount, cardDetails
            );
        } else if (paymentMode.equals(PaymentMode.CASH)) {
            double amount = Double.parseDouble(paymentDetails.get("AMOUNT"));
            paymentProcessor = PaymentProcessorFactory
                    .getCashBasedPaymentProcessor(amount);
        } else {
            throw new IllegalArgumentException();
        }
        return new ParkingFeeProcessor().processParkingFees(ticket, paymentProcessor);

    }

}
