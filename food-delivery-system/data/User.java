package fooddelsys.data;

public class User {

    private final int id;
    private final String name;
    private final Address address;
    private final String phoneNumber;
    private final String emailId;

    public User(int id, String name, Address address, String phoneNumber, String emailId) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.emailId = emailId;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmailId() {
        return emailId;
    }
}
