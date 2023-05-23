package enq.handler;

import enq.EnquiryType;

public class SubscriptionEnquiryHandler implements  EnquiryHandler{

    private final EnquiryHandler nextHandler;

    public SubscriptionEnquiryHandler(EnquiryHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public EnquiryType handle(String enquiry) {
        System.out.println("Inside SubscriptionEnquiryHandler");
        if (enquiry.contains("Upgrade") || enquiry.contains("payment")) {
            // actions
            return EnquiryType.SUBSCRIPTIONS;
        }
        return this.nextHandler.handle(enquiry);
    }
}
