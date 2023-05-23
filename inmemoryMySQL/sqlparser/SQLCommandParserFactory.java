package inmemoryMySQL.sqlparser;

public class SQLCommandParserFactory {
    private SQLCommandParserFactory(){}

    public static SQLCommandParser getParser(String query) {
        SQLCommandParser parser = null;
        if (query.contains("create"))
            parser = new CreateTableCommandParser();
        // more checks
        return parser;
    }
}
