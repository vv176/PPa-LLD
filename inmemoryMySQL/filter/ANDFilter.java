package inmemoryMySQL.filter;

import inmemoryMySQL.data.Table;

public class ANDFilter implements Filter{

    private final Filter filter1;
    private final Filter filter2;

    public ANDFilter(Filter filter1, Filter filter2) {
        this.filter1 = filter1;
        this.filter2 = filter2;
    }

    @Override
    public Table filter(Table table) {
        return null;
    }
}
