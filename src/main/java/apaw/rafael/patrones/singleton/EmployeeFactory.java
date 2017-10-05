package apaw.rafael.patrones.singleton;

import java.util.HashMap;
import java.util.Map;

import apaw.rafael.patrones.Employee;

public class EmployeeFactory {
    private static final EmployeeFactory employeeFactory = new EmployeeFactory();

    private Map<Long, Employee> employees;

    public EmployeeFactory() {
        this.employees = new HashMap<>();
    }

    public static EmployeeFactory getAuthenticationFactory() {
        return employeeFactory;
    }

    public void setAuthenticationFactory(Employee employee) {

        this.employees.put(employee.getId(), employee);
    }

    public Employee getAuthenticationFactory(long key) {
        return this.employees.get(key);
    }

}
