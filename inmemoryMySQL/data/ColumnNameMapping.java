package inmemoryMySQL.data;

public class ColumnNameMapping {

    private final String parentColumn;

    public String getParentColumn() {
        return parentColumn;
    }

    public String getChildColumn() {
        return childColumn;
    }

    private final String childColumn;


    public ColumnNameMapping(String parentColumn, String childColumn) {
        this.parentColumn = parentColumn;
        this.childColumn = childColumn;
    }
}
