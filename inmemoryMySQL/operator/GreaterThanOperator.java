package inmemoryMySQL.operator;

public class GreaterThanOperator implements Operator{

    @Override
    public boolean operate(String currVal, String expectedVal) {
        try {
            Double val1 = Double.parseDouble(currVal);
            Double val2 = Double.parseDouble(expectedVal);
            return val1 > val2;
        } catch (Exception e) {
            System.out.println("Operands are not numbers");
        }
        return currVal.compareTo(expectedVal) > 0;
    }
}
