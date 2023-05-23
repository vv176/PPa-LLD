package logframework;

import java.util.ArrayList;
import java.util.List;

public class LogPublisher implements Publisher{

    private final List<Subscriber> subscribers;

    public LogPublisher() {
        this.subscribers = new ArrayList<>();
    }

    @Override
    public void subscribe(Subscriber subscriber) {
        this.subscribers.add(subscriber);
    }

    @Override
    public void unsubscribe(Subscriber subscriber) {
        this.subscribers.remove(subscriber);
    }

    @Override
    public void notify(String message) {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(message);
        }
    }
}
