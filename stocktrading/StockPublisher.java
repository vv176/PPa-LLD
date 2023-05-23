package stocktrading;

public interface StockPublisher {

    void subscribe(StockSubscriber subscriber);

    void unsubscribe(StockSubscriber subscriber);

    void notifySubscribers(StockName stockName, StockValue stockValue);

}
