package withoutcor.handler;

import withoutcor.data.Request;

public class ValidationHandler implements RequestHandler{

    private  final RequestHandler nextHandler;

    public ValidationHandler(RequestHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handle(Request request) {
        if (request.getHeader() == null || request.getHeader().isEmpty()) {
            throw new IllegalArgumentException("empty header");
        }
        if (request.getBody() == null || request.getBody().isEmpty()) {
            throw new IllegalArgumentException("empty body");
        }
        System.out.println("Validation Passed");
        this.nextHandler.handle(request);
    }
}
