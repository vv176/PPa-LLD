package atmmachine.card;

public interface CardManager {

    boolean validateCard(CardDetails cardDetails);

    boolean validateWithdrawal(float amount,
                               int transId);

    void executeWithdrawal(int transId);
}
