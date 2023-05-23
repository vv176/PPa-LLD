package inmemoryMySQL.filter;

import inmemoryMySQL.data.Column;
import inmemoryMySQL.data.Row;
import inmemoryMySQL.data.Table;
import inmemoryMySQL.operator.Operator;

public class BaseFilter implements Filter{

    private final Column column;
    private final Operator operator;
    private final String expectedVal;

    public BaseFilter(Column column, Operator operator, String expectedVal) {
        this.column = column;
        this.operator = operator;
        this.expectedVal = expectedVal;
    }

    @Override
    public Table filter(Table table) {
        Table filteredTable = new Table("Temp", table.getColumns());
        for (Row row : table.getRows()) {
            if (operator.operate(row.get(column), expectedVal))
                filteredTable.addRow(row);
        }
        return filteredTable;
    }
}
