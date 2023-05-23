package inmemoryMySQL.filter;

import inmemoryMySQL.data.Row;
import inmemoryMySQL.data.Table;

import java.util.HashSet;
import java.util.Set;

public class ORFilter implements Filter{

    private final Filter filter1;
    private final Filter filter2;

    public ORFilter(Filter filter1, Filter filter2) {
        this.filter1 = filter1;
        this.filter2 = filter2;
    }

    @Override
    public Table filter(Table table) {
        Table table1 = filter1.filter(table);
        Table table2 = filter2.filter(table);
        Set<Row> rows = new HashSet<>();
        rows.addAll(table1.getRows());
        rows.addAll(table2.getRows());
        Table filteredTable = new Table("Temp", table.getColumns());
        for (Row row : rows)
            filteredTable.addRow(row);
        return filteredTable;
    }
}
