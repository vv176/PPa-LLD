package enq.handler;

import enq.EnquiryType;

public class AcademicEnquiryHandler implements EnquiryHandler{

    private final EnquiryHandler nextHandler;

    public AcademicEnquiryHandler(EnquiryHandler nextHandler) {
        this.nextHandler = nextHandler;
    }
    @Override
    public EnquiryType handle(String enquiry) {
        System.out.println("Inside AcademicEnquiryHandler");
        if (enquiry.contains("DS Algo") ||
                enquiry.contains("Design")) {
            // actions
            return EnquiryType.ACADEMIC;
        }
        return this.nextHandler.handle(enquiry);
    }
}
