package singletonpattern;

public class EmployeeIdStoreTester {

    public static void main(String[] args) {
        testGetNameForValidId();
        testGetNameForInvalidId();
    }

    private static void testGetNameForValidId() {
        String actualName = EmployeeIdStore.getInstance().getName("101");
        String expectedName = "Bharat";
        if (!actualName.equals(expectedName))
            throw new RuntimeException("testGetNameForValidId failed");
        System.out.println("testGetNameForValidId passed");
    }

    private static void testGetNameForInvalidId() {
        try {
            String actualName =  EmployeeIdStore.getInstance().getName("1001");
        } catch (Exception e) {
            if (!(e instanceof IllegalArgumentException))
                throw new RuntimeException("testGetNameForInvalidId failed, wrong exception type");
            if (!e.getMessage().equals("Invalid Id"))
                throw new RuntimeException("testGetNameForInvalidId failed, wrong exception msg");
            System.out.println("testGetNameForInvalidId passed");
            return;
        }
        throw new RuntimeException("testGetNameForInvalidId failed, no exception thrown");
    }

}
