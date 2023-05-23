package stocktrading;

public class StockValue {

    private final int versionNumber;

    private final double amount;
    private final Currency currency;


    public StockValue(int versionNumber, double amount, Currency currency) {
        this.versionNumber = versionNumber;
        this.amount = amount;
        this.currency = currency;
    }

    public int getVersionNumber() {
        return versionNumber;
    }

    public double getAmount() {
        return amount;
    }

    public Currency getCurrency() {
        return currency;
    }

}
