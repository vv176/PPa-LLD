package fooddelsys.data;

public class PaymentResponse {

    private final  double amount;
    private final int id;
    private final PaymentStatus status;

    public PaymentResponse(double amount, int id, PaymentStatus status) {
        this.amount = amount;
        this.id = id;
        this.status = status;
    }

    public double getAmount() {
        return amount;
    }

    public int getId() {
        return id;
    }

    public PaymentStatus getStatus() {
        return status;
    }
}
