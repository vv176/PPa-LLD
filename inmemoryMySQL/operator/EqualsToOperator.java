package inmemoryMySQL.operator;

public class EqualsToOperator implements Operator{
    @Override
    public boolean operate(String currVal, String expectedVal) {
        return currVal.equals(expectedVal);
    }
}
