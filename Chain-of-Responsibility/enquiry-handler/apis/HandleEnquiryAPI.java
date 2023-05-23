package enq.apis;

import enq.handler.EnquiryHandlerFactory;
import enq.handler.Response;

public class HandleEnquiryAPI {

     public Response handleEnquiry(String enquiry) {
          EnquiryHandlerFactory.getEnquiryHandler()
                 .handle(enquiry);
          return null;
     }

}
