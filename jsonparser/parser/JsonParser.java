package jsonparser.parser;

import jsonparser.data.JSON;

public interface JsonParser {

    JSON parse(String jsonText);

    String toString(JSON json);

}
