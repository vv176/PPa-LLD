package inmemoryMySQL.constraint;

import inmemoryMySQL.data.Column;
import inmemoryMySQL.data.Row;
import inmemoryMySQL.data.Table;

import java.util.Set;

public class PrimaryKeyConstraint implements Constraint{

    private final Table table;
    private final Set<Column> primaryKeys;

    public PrimaryKeyConstraint(Table table, Set<Column> primaryKeys) {
        this.table = table;
        this.primaryKeys = primaryKeys;
    }

    @Override
    public void applyOnInsertRow(Row rowToBeInserted) {
        for (Row row : table.getRows()) {
            boolean allMatch = true;
            for (Column col : primaryKeys) {
                if (!row.get(col).equals(rowToBeInserted.get(col)))
                    allMatch = false;
            }
            if (allMatch)
                throw new RuntimeException("Primary key const violated");
        }
    }

    @Override
    public void applyOnUpdateRow(Row rowToBeUpdated) {
        // needs action
    }

    @Override
    public void applyOnDeleteRow(Row rowToBeDeleted) {
        // no action
    }

    @Override
    public ConstraintType getConstraintType() {
        return ConstraintType.PRIMARY_KEY;
    }

    @Override
    public boolean isRelated(Table relatedTable) {
        return false;
    }
}
