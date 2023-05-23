package jsonparser.tokenizer;

import jsonparser.data.KeyValuePair;

import java.util.List;

public interface Tokenizer {
    List<KeyValuePair> tokenize(String text);
}
