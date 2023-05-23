package inmemoryMySQL.sqlparser;

import inmemoryMySQL.sqlcommand.SQLCommand;

public interface SQLCommandParser {
    SQLCommand parse(String query);
}
