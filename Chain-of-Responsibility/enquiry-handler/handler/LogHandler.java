package enq.handler;

import enq.EnquiryType;

public class LogHandler implements EnquiryHandler{
    private final EnquiryHandler nextHandler;

    public LogHandler(EnquiryHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public EnquiryType handle(String enquiry) {
        System.out.println(enquiry);
        EnquiryType enquiryType = this.nextHandler.handle(enquiry);
        // actions
        System.out.println("Inside log handler");
        System.out.println(enquiryType);
        return enquiryType;
    }
}
