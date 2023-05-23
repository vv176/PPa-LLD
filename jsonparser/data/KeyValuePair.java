package jsonparser.data;

public class KeyValuePair {

    private final String key;

    public String getKey() {
        return key;
    }

    public String getVal() {
        return val;
    }

    private final String val;


    public KeyValuePair(String key, String val) {
        this.key = key;
        this.val = val;
    }
}
