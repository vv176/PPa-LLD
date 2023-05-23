package inmemoryMySQL.data;

public class KeyValPair {
    public String getKey() {
        return key;
    }

    public String getVal() {
        return val;
    }

    private final String key;
    private final String val;

    public KeyValPair(String key, String val) {
        this.key = key;
        this.val = val;
    }
}
