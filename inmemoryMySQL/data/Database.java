package inmemoryMySQL.data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Database {
    // singleton
    private final Map<String, Table> tables;
    private static Database INSTANCE;

    private Database() {this.tables = new HashMap<>();
    }

    public static Database getInstance() {
        if (INSTANCE == null)
            INSTANCE = new Database();
        return INSTANCE;
    }

    public Table getTable(String tableName) {
        if(!tables.containsKey(tableName))
            throw new RuntimeException("Invalid table name");
        return  tables.get(tableName);
    }

    public void putTable(String tableName, Table table) {
        if (tables.containsKey(tableName))
            throw new RuntimeException("Table exists");
        tables.put(tableName, table);
    }

    public void deleteTable(String tableName) {
        if(!tables.containsKey(tableName))
            throw new RuntimeException("Invalid table name");
        tables.remove(tableName);
    }

    public List<Table> getAllTables() {
        List<Table> tables = new ArrayList<>();
        for (Map.Entry<String, Table> entry :
             this.tables.entrySet()) {
            tables.add(entry.getValue());
        }
        return tables;
    }

}
