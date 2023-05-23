package jsonparser.parser;

import jsonparser.data.JSON;
import jsonparser.data.KeyValuePair;
import jsonparser.data.StringConstants;
import jsonparser.tokenizer.Tokenizer;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NaiveJsonParser implements JsonParser{

    private final Tokenizer tokenizer;

    public NaiveJsonParser(Tokenizer tokenizer) {
        this.tokenizer = tokenizer;
    }

    @Override
    public JSON parse(String jsonText) {
        if(jsonText == null)
            throw new RuntimeException("Invalid jsonText");
        if (!jsonText.contains(StringConstants.STARTING_PARAN_STRING)) {
            jsonText = jsonText.trim().replaceAll(StringConstants.DOUBLE_QUOTES_STRING,
                    StringConstants.EMPTY_STRING);
            Map<String, JSON> keyToValues = new HashMap<>();
            keyToValues.put(jsonText, null);
            return new JSON(keyToValues);
        }
        List<KeyValuePair> keyValuePairs = this.tokenizer.tokenize(jsonText);
        Map<String, JSON> keyToValues = new HashMap<>();
        for (KeyValuePair keyValuePair : keyValuePairs) {
            keyToValues.put(keyValuePair.getKey(),
                    parse(keyValuePair.getVal()));
        }
        return new JSON(keyToValues);
    }

    @Override
    public String toString(JSON json) {
        if (json.isLeaf()) {
            return StringConstants.DOUBLE_QUOTES_STRING +
                    json.getAllKeys().get(0).trim() + StringConstants.DOUBLE_QUOTES_STRING;
        }
        String jsonText = StringConstants.STARTING_PARAN_STRING;
        List<String> keys = json.getAllKeys();
        for (String key : keys) {
            jsonText += StringConstants.DOUBLE_QUOTES + key + StringConstants.DOUBLE_QUOTES;
            jsonText += StringConstants.COLON;
            jsonText += toString(json.get(key));
            jsonText += StringConstants.COMMA;
        }
        if (jsonText.endsWith(StringConstants.COMMA_STRING)) {
            jsonText = jsonText.substring(0, jsonText.length()-1);
        }
        jsonText += StringConstants.CLOSING_PARAN_STRING;
        return jsonText;
    }
}
