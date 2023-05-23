package singletonpattern;

import java.util.HashMap;
import java.util.Map;

public class EmployeeIdStore {

    private final Map<String, String> employees;
    private static EmployeeIdStore INSTANCE = null;

    private EmployeeIdStore() {
        this.employees = new HashMap<>();
        // read DB
        this.employees.put("101", "Bharat");
        this.employees.put("102", "Vivek");
        this.employees.put("112", "Anoop");
    }

    public static EmployeeIdStore getInstance() {
        if (INSTANCE == null)
            INSTANCE = new EmployeeIdStore();
        return INSTANCE;
    }

    public String getName(String id) {
        if (!this.employees.containsKey(id))
            throw new IllegalArgumentException("Invalid Id");
        return this.employees.get(id);
    }
}
