package withoutcor.handler;

import withoutcor.data.Request;

public class IdleHandler implements RequestHandler{
    @Override
    public void handle(Request request) {
        System.out.println("All done");
    }
}
