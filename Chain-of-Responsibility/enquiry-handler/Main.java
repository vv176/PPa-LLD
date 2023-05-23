package enq;

import enq.handler.EnquiryHandlerFactory;

public class Main {

    public static void main(String[] args) {
        EnquiryHandlerFactory.getEnquiryHandler().handle(
                "I want to take  1 month Upgrade"
        );
    }

}
