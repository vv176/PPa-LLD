package inmemoryMySQL.sqlcommand;

import inmemoryMySQL.data.Database;
import inmemoryMySQL.data.Row;
import inmemoryMySQL.data.Table;
import inmemoryMySQL.filter.Filter;

public class DeleteRowsCommand implements SQLCommand{
    private final String tableName;
    private final Filter filter;

    public DeleteRowsCommand(String tableName, Filter filter) {
        this.tableName = tableName;
        this.filter = filter;
    }

    @Override
    public void execute() {
        Table table = Database.getInstance().getTable(tableName);
        Table filteredTable = filter.filter(table);
        for (Row row : filteredTable.getRows())
            table.deleteRow(row);
        System.out.println("Deleted" + filteredTable.getRows().size() + "rows");
    }
}
