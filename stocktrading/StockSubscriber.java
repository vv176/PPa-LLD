package stocktrading;

public interface StockSubscriber {

    void updateStock(StockName stockName, StockValue stockValue);

}
