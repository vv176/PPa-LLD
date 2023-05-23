package inmemoryMySQL.operator;

public interface Operator {
    boolean operate(String currVal, String expectedVal);
}
