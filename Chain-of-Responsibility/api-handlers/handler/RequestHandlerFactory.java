package withoutcor.handler;

import withoutcor.managers.TokenManager;
import withoutcor.managers.UserManager;

public class RequestHandlerFactory {

    private RequestHandlerFactory() {}

    public static RequestHandler getHandler(String apiName) {
        return new ValidationHandler(new AuthenticationHandler(new AuthorisationHandler(
                new IdleHandler(), new UserManager()),
                new TokenManager()));
    }

}
