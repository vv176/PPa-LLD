package ecommerce.notifs.subscriber;

public class EmailSubscriber implements Subscriber{

    private final String email;

    public EmailSubscriber(String email) {
        this.email = email;
    }

    @Override
    public void notify(String message) {

    }
}
