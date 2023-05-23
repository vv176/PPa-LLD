package inmemoryMySQL.data;

public class Column {
    private final String name;

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    private final String description;

    public Column(String name, String description) {
        this.name = name;
        this.description = description;
    }
}
