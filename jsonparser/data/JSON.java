package jsonparser.data;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class JSON {
    private final Map<String, JSON> keyToValues;

    public JSON(Map<String, JSON> keyToValues) {
        this.keyToValues = keyToValues;
    }

    public JSON get(String key) {
        return this.keyToValues.get(key);
    }

    public List<String> getAllKeys() {
        List<String> keys = new ArrayList<>();
        for (Map.Entry<String, JSON> jsonEntry : keyToValues.entrySet()) {
            keys.add(jsonEntry.getKey());
        }
        return keys;
    }

    public boolean isLeaf() {
        return (this.keyToValues.entrySet().size() == 1) &&
                (this.keyToValues.entrySet().iterator().next().getValue() == null);
    }


}
