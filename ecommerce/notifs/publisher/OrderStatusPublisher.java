package ecommerce.notifs.publisher;

import ecommerce.notifs.subscriber.Subscriber;

import java.util.ArrayList;
import java.util.List;

public class OrderStatusPublisher implements Publisher{

    private final List<Subscriber> subscribers;

    public OrderStatusPublisher() {
        this.subscribers = new ArrayList<>();
    }

    @Override
    public void addSubscriber(Subscriber subscriber) {
        this.subscribers.add(subscriber);
    }

    @Override
    public void removeSubscriber(Subscriber subscriber) {
        this.subscribers.remove(subscriber);
    }

    @Override
    public void notifyAll(String message) {
        for (Subscriber subscriber : subscribers) {
            subscriber.notify(message);
        }
    }
}
