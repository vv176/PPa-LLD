package stocktrading;

import java.util.ArrayList;
import java.util.List;

public class StockUpdatesPublisher implements StockPublisher{

    private final String name;
    private List<StockSubscriber> subscribers;

    public StockUpdatesPublisher(String name) {
        this.name = name;
        subscribers = new ArrayList<>();
    }

    @Override
    public void subscribe(StockSubscriber subscriber) {
        this.subscribers.add(subscriber);
    }

    @Override
    public void unsubscribe(StockSubscriber subscriber) {
        this.subscribers.remove(subscriber);
    }

    @Override
    public void notifySubscribers(StockName stockName, StockValue stockValue) {
            for (StockSubscriber subscriber : this.subscribers) {
                subscriber.updateStock(stockName, stockValue);
            }
    }
}
