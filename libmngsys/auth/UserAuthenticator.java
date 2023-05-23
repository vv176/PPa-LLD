package libmngsys.auth;

public class UserAuthenticator {

    private UserAuthenticator(){}

    public static boolean isAdmin(String token) {
        return true;
    }

    public static boolean isMember(String token) {
        return true;
    }

}
