package elevdesign.data;

public class Floor {

    private final int number;

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    private final String name;

    public Floor(int number, String name) {
        this.number = number;
        this.name = name;
    }
}
