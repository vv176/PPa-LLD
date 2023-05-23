package ecommerce.data;

public class Address {

    private final String addressLine1;
    private final String addressLine2;
    private final String addressLine3;

    public String getAddressLine1() {
        return addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public String getAddressLine3() {
        return addressLine3;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getCountry() {
        return country;
    }

    public String getZip() {
        return zip;
    }

    private final String city;
    private final String state;
    private final String country;
    private final String zip;

    public Address(String addressLine1, String addressLine2,
                   String addressLine3, String city, String state, String country, String zip) {
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.addressLine3 = addressLine3;
        this.city = city;
        this.state = state;
        this.country = country;
        this.zip = zip;
    }
}
