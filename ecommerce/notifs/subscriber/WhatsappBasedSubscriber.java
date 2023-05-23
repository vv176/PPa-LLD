package ecommerce.notifs.subscriber;

public class WhatsappBasedSubscriber implements Subscriber{

    private final String whatsappNum;

    public WhatsappBasedSubscriber(String whatsappNum) {
        this.whatsappNum = whatsappNum;
    }

    @Override
    public void notify(String message) {

    }
}
