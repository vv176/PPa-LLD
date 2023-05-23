package withoutcor.main;

import withoutcor.data.Request;
import withoutcor.handler.RequestHandlerFactory;

public class Main {

    public static void main(String[] args) {
        RequestHandlerFactory.getHandler("playVideo").handle(
                new Request("abc", "def", "ghi")
        );
    }

}
