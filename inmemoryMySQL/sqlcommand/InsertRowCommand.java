package inmemoryMySQL.sqlcommand;

import inmemoryMySQL.data.Database;
import inmemoryMySQL.data.KeyValPair;
import inmemoryMySQL.data.Row;
import inmemoryMySQL.data.Table;

import java.util.List;

public class InsertRowCommand implements SQLCommand{

    private final String tableName;
    private final List<KeyValPair> keyValPairs;

    public InsertRowCommand(String tableName, List<KeyValPair> keyValPairs) {
        this.tableName = tableName;
        this.keyValPairs = keyValPairs;
    }

    @Override
    public void execute() {
        Table table = Database.getInstance().getTable(tableName);
        Row row = new Row(table.getColumns());
        for (KeyValPair keyValPair : keyValPairs) {
            row.put(table.getColumn(keyValPair.getKey()), keyValPair.getVal());
        }
        table.addRow(row);
        System.out.println("Row inserted successfully");
    }
}
