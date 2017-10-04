package apaw.rafael.patrones.composite;

import java.util.ArrayList;
import java.util.List;

public class EmployeeCompisite extends EmployeeComponent {
    List<EmployeeComponent> employeeComponentList;

    public EmployeeCompisite(String name) {
        super(name);
        employeeComponentList = new ArrayList<>();
    }

    public String name() {
        return this.getName();
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
