package inmemoryMySQL.sqlparser;

import inmemoryMySQL.sqlcommand.CreateTableCommand;
import inmemoryMySQL.sqlcommand.SQLCommand;

import java.util.HashSet;

public class CreateTableCommandParser implements SQLCommandParser{
    @Override
    public SQLCommand parse(String query) {
        return new CreateTableCommand("", new HashSet<>());
    }
}
