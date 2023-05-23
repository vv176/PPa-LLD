package inmemoryMySQL.sqlcommand;

import inmemoryMySQL.constraint.ChildForeignKeyConstraint;
import inmemoryMySQL.constraint.ColumnMapping;
import inmemoryMySQL.constraint.ParentForignKeyConstraint;
import inmemoryMySQL.data.ColumnNameMapping;
import inmemoryMySQL.data.Database;
import inmemoryMySQL.data.Table;


import java.util.ArrayList;
import java.util.List;

public class AddForeignKeyConstraintCommand implements SQLCommand {

    private final String parentTable;
    private final String childTable;
    private final List<ColumnNameMapping> colNameMappings;

    public AddForeignKeyConstraintCommand(String parentTable, String childTable,
                                          List<ColumnNameMapping> colNameMappings) {
        this.parentTable = parentTable;
        this.childTable = childTable;
        this.colNameMappings = colNameMappings;
    }

    @Override
    public void execute() {
        Database db = Database.getInstance();
        Table parent = db.getTable(parentTable);
        Table child = db.getTable(childTable);
        List<ColumnMapping> childColMapping = new ArrayList<>();
        List<ColumnMapping> parentColMapping = new ArrayList<>();
        for (ColumnNameMapping columnNameMapping : colNameMappings) {
            ColumnMapping colMappingForChild = new ColumnMapping(
                    child.getColumn(columnNameMapping.getChildColumn()),
                    parent.getColumn(columnNameMapping.getParentColumn())
            );
            childColMapping.add(colMappingForChild);
            ColumnMapping colMappingForParent = new ColumnMapping(
                    parent.getColumn(columnNameMapping.getParentColumn()),
                    child.getColumn(columnNameMapping.getChildColumn())
            );
            parentColMapping.add(colMappingForParent);
        }
        parent.addConstraint(new ChildForeignKeyConstraint(child, parentColMapping));
        child.addConstraint(new ParentForignKeyConstraint(parent, childColMapping));
    }
}
