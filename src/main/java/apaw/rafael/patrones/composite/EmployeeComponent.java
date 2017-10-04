package apaw.rafael.patrones.composite;

public abstract class EmployeeComponent {

    private String name;

    public EmployeeComponent(String name) {
        super();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void add(EmployeeComponent employeeComponent);

    public abstract void remove(EmployeeComponent employeeComponent);
}
