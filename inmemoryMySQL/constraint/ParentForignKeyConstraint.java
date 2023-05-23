package inmemoryMySQL.constraint;

import inmemoryMySQL.data.Row;
import inmemoryMySQL.data.Table;

import java.util.List;

public class ParentForignKeyConstraint implements Constraint{

    private final Table parentTable;
    private final List<ColumnMapping> columnMappings;

    public ParentForignKeyConstraint(Table parentTable, List<ColumnMapping> columnMappings) {
        this.parentTable = parentTable;
        this.columnMappings = columnMappings;
    }

    @Override
    public void applyOnInsertRow(Row rowToBeInserted) {
        for (Row row : parentTable.getRows()) {
            boolean allMatch = true;
            for (ColumnMapping columnMapping : columnMappings) {
                if (row.get(columnMapping.getForeignTableCol()) !=
                        rowToBeInserted.get(columnMapping.getCurrentTableCol()))
                    allMatch = false;
            }
            if (allMatch)
                return;
        }
        throw new RuntimeException("Parent foreign key constraint violated");
    }

    @Override
    public void applyOnUpdateRow(Row rowToBeUpdated) {

    }

    @Override
    public void applyOnDeleteRow(Row rowToBeDeleted) {
        // no action
    }

    @Override
    public ConstraintType getConstraintType() {
        return ConstraintType.PARENT_FOREIGN_KEY;
    }

    @Override
    public boolean isRelated(Table relatedTable) {
        return relatedTable.getName().equals(parentTable.getName());
    }
}
