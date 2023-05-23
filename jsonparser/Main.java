package jsonparser;

import jsonparser.data.JSON;
import jsonparser.parser.JsonParser;
import jsonparser.parser.NaiveJsonParser;
import jsonparser.tokenizer.NaiveTokenizer;

public class Main {
    public static void main(String[] args) {
        JsonParser parser = new NaiveJsonParser(new NaiveTokenizer());
        String jsonText = "{\"sem-2\":{\"Theory\":{\"Computer Arch\":\"A+\",\"Numerical Methods\":\"A+\"},\"cgpa\":\"9.9\",\"Lab\":{\"Parallel Computing\":\"A+\",\"Computer Arch\":\"A+\"}},\"sem-1\":{\"Theory\":{\"Computer Graphics\":\"B\",\"DSA\":\"A\",\"Discrete Maths\":\"A-\"},\"cgpa\":\"9.7\",\"Lab\":{\"Computer Graphics\":\"B\",\"DSA\":\"A+\",\"Microprocessors\":\"B-\"}}}";
        JSON json = parser.parse(jsonText);
        System.out.println(parser.toString(json
                .get("sem-2").get("Lab").get("Parallel Computing")));
    }
}
