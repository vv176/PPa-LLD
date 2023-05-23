package inmemoryMySQL.data;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Row {

    private final Map<Column, String> data;

    public Row(Set<Column> columns) {
        this.data = new HashMap<>();
        for (Column col : columns) {
            this.data.put(col, null);
        }
    }

    public void put(Column col, String val) {
        if (!data.containsKey(col))
            throw new RuntimeException("Invalid column");
        this.data.put(col, val);
    }

    public String get(Column col) {
        if (!data.containsKey(col))
            throw new RuntimeException("Invalid column");
        return this.data.get(col);
    }

    public void print() {
        for (Map.Entry<Column, String> entry :
        data.entrySet()) {
            System.out.print(entry.getKey().getName()
              + ":" + entry.getValue());
            System.out.println();
        }
    }
}
