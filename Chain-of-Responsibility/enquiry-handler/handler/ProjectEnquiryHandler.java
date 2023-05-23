package enq.handler;

import enq.EnquiryType;

public class ProjectEnquiryHandler implements EnquiryHandler{

    private final EnquiryHandler nextHandler;

    public ProjectEnquiryHandler(EnquiryHandler nextHandler) {
        this.nextHandler = nextHandler;
    }
    @Override
    public EnquiryType handle(String enquiry) {
        System.out.println("Inside ProjectEnquiryHandler");
        if (enquiry.contains("Project")) {
            // actions
            return EnquiryType.PROJECTS;
        }
        return this.nextHandler.handle(enquiry);
    }
}
