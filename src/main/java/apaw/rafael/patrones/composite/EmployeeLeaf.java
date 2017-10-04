package apaw.rafael.patrones.composite;

import apaw.rafael.patrones.Employee;

public class EmployeeLeaf extends EmployeeComponent {
    private Employee employee;

    public EmployeeLeaf(String name,Employee employee) {
        super(name);
        this.employee=employee;
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
