package inmemoryMySQL.sqlcommand;

import inmemoryMySQL.constraint.ConstraintType;
import inmemoryMySQL.data.Database;
import inmemoryMySQL.data.Table;

public class DropTableCommand implements SQLCommand{
    private final String tableName;

    public DropTableCommand(String tableName) {
        this.tableName = tableName;
    }

    @Override
    public void execute() {
        Database db = Database.getInstance();
        Table tableToBeDeleted = db.getTable(tableName);
        if (!tableToBeDeleted.getConstraintsByType(ConstraintType.CHILD_FOREIGN_KEY)
                .isEmpty()) {
            throw new RuntimeException("first delete its children");
        }
        for (Table table : db.getAllTables()) {
            table.removeConstraint(ConstraintType.CHILD_FOREIGN_KEY, tableToBeDeleted);
        }
        db.deleteTable(tableName);
        System.out.println("Dropped table successfully");
    }
}
