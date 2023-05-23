package ecommerce.notifs.subscriber;

public class SMSBasedSubscriber implements Subscriber{
    private final String phoneNum;

    public SMSBasedSubscriber(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    @Override
    public void notify(String message) {

    }
}
