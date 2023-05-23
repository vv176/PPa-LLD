package stocktrading;

public class StockSimulator {

    public static void main(String[] args) {

        StockPublisher BsePublisher = new StockUpdatesPublisher("BSE");
        StockPublisher NsePublisher = new StockUpdatesPublisher("NSE");
        StockSubscriber subscriber1 = new StockUpdatesSubscriber("S1");
        StockSubscriber subscriber2 = new StockUpdatesSubscriber("S2");
        StockSubscriber subscriber3 = new StockUpdatesSubscriber("S3");
        NsePublisher.subscribe(subscriber1);
        NsePublisher.subscribe(subscriber2);
        BsePublisher.subscribe(subscriber3);
        BsePublisher.subscribe(subscriber2);
        NsePublisher.notifySubscribers(StockName.AMZN,
                new StockValue(1, 100, Currency.INR));
        NsePublisher.notifySubscribers(StockName.AMZN,
                new StockValue(2, 200, Currency.INR));
        BsePublisher.notifySubscribers(StockName.AMZN,
                new StockValue(1, 100, Currency.INR));
        BsePublisher.notifySubscribers(StockName.NETFLIX,
                new StockValue(1, 300, Currency.INR));
    }

}
