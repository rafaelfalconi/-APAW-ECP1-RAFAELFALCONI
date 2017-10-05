package apaw.rafael.patrones.composite;

import apaw.rafael.patrones.Employee;

public class EmployeeLeaf extends EmployeeComponent {
    private Employee employee;

    public EmployeeLeaf(Employee employee) {

        this.employee = employee;
    }

    public long view() {
        return employee.getId();
    }

    @Override
    public void add(EmployeeComponent employeeComponent) {
        // Do nothing because is leaf

    }

    @Override
    public void remove(EmployeeComponent employeeComponent) {
        // Do nothing because is leaf

    }

}
