package ecommerce.notifs.publisher;

import ecommerce.notifs.subscriber.Subscriber;

public interface Publisher {
    void addSubscriber(Subscriber subscriber);
    void removeSubscriber(Subscriber subscriber);
    void notifyAll(String message);
}
