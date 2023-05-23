package inmemoryMySQL.sqlcommand;

import inmemoryMySQL.constraint.Constraint;
import inmemoryMySQL.constraint.ConstraintType;
import inmemoryMySQL.constraint.PrimaryKeyConstraint;
import inmemoryMySQL.data.Column;
import inmemoryMySQL.data.Database;
import inmemoryMySQL.data.Table;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AddPrimaryKeyConstraintCommand implements SQLCommand{

    private final String tableName;
    private final List<String> colNames;

    public AddPrimaryKeyConstraintCommand(String tableName, List<String> colNames) {
        this.tableName = tableName;
        this.colNames = colNames;
    }

    @Override
    public void execute() {
        Table table = Database.getInstance().getTable(tableName);
        Set<Column> columns = new HashSet<>();
        for (String col : colNames) {
            columns.add(table.getColumn(col));
        }
        List<Constraint> constraints = table.getConstraintsByType(ConstraintType.PRIMARY_KEY);
        if (!constraints.isEmpty())
            throw new RuntimeException("prim key constraint exists");
        // iterate on rows and verify uniqueness
        table.addConstraint(new PrimaryKeyConstraint(table, columns));
        System.out.println("Added prim key const successfully");
    }
}
