package inmemoryMySQL.constraint;

import inmemoryMySQL.data.Column;

public class ColumnMapping {

    private final Column foreignTableCol;

    public Column getForeignTableCol() {
        return foreignTableCol;
    }

    public Column getCurrentTableCol() {
        return currentTableCol;
    }

    private final Column currentTableCol;


    public ColumnMapping(Column forignTableCol, Column currentTableCol) {
        this.foreignTableCol = forignTableCol;
        this.currentTableCol = currentTableCol;
    }
}
