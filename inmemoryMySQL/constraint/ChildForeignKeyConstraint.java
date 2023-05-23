package inmemoryMySQL.constraint;

import inmemoryMySQL.data.Row;
import inmemoryMySQL.data.Table;

import java.util.List;

public class ChildForeignKeyConstraint implements Constraint{

    private final Table childTable;
    private final List<ColumnMapping> columnMappings;

    public ChildForeignKeyConstraint(Table childTable, List<ColumnMapping> columnMappings) {
        this.childTable = childTable;
        this.columnMappings = columnMappings;
    }

    @Override
    public void applyOnInsertRow(Row rowToBeInserted) {
        // no action
    }

    @Override
    public void applyOnUpdateRow(Row rowToBeUpdated) {

    }

    @Override
    public void applyOnDeleteRow(Row rowToBeDeleted) {
        for (Row row : childTable.getRows()) {
            boolean allMatch = true;
            for (ColumnMapping columnMapping : columnMappings) {
                if (row.get(columnMapping.getForeignTableCol()) !=
                    rowToBeDeleted.get(columnMapping.getCurrentTableCol()))
                    allMatch = false;
            }
            if (allMatch)
                throw new RuntimeException("Child foreign key constraint violated");
        }
    }

    @Override
    public ConstraintType getConstraintType() {
        return ConstraintType.CHILD_FOREIGN_KEY;
    }

    @Override
    public boolean isRelated(Table relatedTable) {
        return relatedTable.getName().equals(childTable.getName());
    }
}
