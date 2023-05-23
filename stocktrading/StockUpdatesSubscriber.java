package stocktrading;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StockUpdatesSubscriber implements StockSubscriber{

    private final String name;
    private Map<StockName, StockValue> stockValues;
    private List<StockPublisher> publishers;

    public StockUpdatesSubscriber(String name) {
        this.name = name;
        this.stockValues = new HashMap<>();
        this.publishers = new ArrayList<>();
    }

    @Override
    public void updateStock(StockName stockName, StockValue stockValue) {
        System.out.println(name + " " + stockName + " " +
                stockValue.getAmount() + stockValue.getCurrency() +
                stockValue.getVersionNumber());
        if (!stockValues.containsKey(stockName) ||
                stockValues.get(stockName).getVersionNumber() <
                        stockValue.getVersionNumber()) {
            stockValues.put(stockName, stockValue);
        }

    }
}
