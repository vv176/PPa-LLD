package inmemoryMySQL.operator;

public class NotEqualsToOperator implements Operator{
    @Override
    public boolean operate(String currVal, String expectedVal) {
        return !currVal.equals(expectedVal);
    }
}
