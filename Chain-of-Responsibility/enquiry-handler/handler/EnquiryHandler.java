package enq.handler;

import enq.EnquiryType;

public interface EnquiryHandler {

    EnquiryType handle(String enquiry);

}
