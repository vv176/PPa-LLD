package singletonpattern;

public class Main {

    public static void main(String[] args) {
        System.out.println(EmployeeIdStore.getInstance()
                .getName("101"));
        EmployeeIdStore o1, o2;
        o1 = EmployeeIdStore.getInstance();
        o2 = EmployeeIdStore.getInstance();
        System.out.println(o1 == o2);
    }

}
