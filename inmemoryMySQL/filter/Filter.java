package inmemoryMySQL.filter;

import inmemoryMySQL.data.Table;

public interface Filter {
    Table filter(Table table);
}
