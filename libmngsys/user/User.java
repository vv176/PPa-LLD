package libmngsys.user;

public abstract class User {

    private final int id;
    private final String name;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

}
