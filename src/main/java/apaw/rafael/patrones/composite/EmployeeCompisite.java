package apaw.rafael.patrones.composite;

import java.util.ArrayList;
import java.util.List;

public class EmployeeCompisite extends EmployeeComponent {
    List<EmployeeComponent> employeeComponentList;

    private String name;

    public EmployeeCompisite(String name) {
        this.name = name;
        employeeComponentList = new ArrayList<>();
    }

    public String name() {
        return this.getName();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void add(EmployeeComponent employeeComponent) {
        assert employeeComponent != null;
        employeeComponentList.add(employeeComponent);
    }

    @Override
    public void remove(EmployeeComponent employeeComponent) {
        assert employeeComponent != null;
        employeeComponentList.remove(employeeComponent);

    }

}
