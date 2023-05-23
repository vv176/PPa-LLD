package enq.handler;

import enq.EnquiryType;

public class IdleHandler implements EnquiryHandler{
    @Override
    public EnquiryType handle(String enquiry) {
        System.out.println("Inside IdleHandler");
        return EnquiryType.UNKNOWN;
    }
}
