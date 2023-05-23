package withoutcor.apis;
import withoutcor.data.Request;
import withoutcor.data.Response;
import withoutcor.handler.*;

public class PlayVideoAPI {

    public Response playVideo(Request request) {
        RequestHandlerFactory.getHandler("playVideo").handle(request);
        return null;
    }


}
