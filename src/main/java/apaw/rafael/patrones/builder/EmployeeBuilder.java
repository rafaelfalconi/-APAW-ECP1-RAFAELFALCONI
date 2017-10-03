package apaw.rafael.patrones.builder;

import java.util.Calendar;

import apaw.rafael.patrones.Category;

import apaw.rafael.patrones.Employee;

public class EmployeeBuilder {
    private Employee employee;

    private long id;

    private String surname;

    private static Category category;

    public EmployeeBuilder(long id, String surname, Category category) {

        EmployeeBuilder.category = category;
        this.id = id;
        this.surname = surname;
    }

    public EmployeeBuilder() {
        this(0, "", category);
    }

    public EmployeeBuilder id(long id) {
        this.id = id;
        this.employee = new Employee(id, surname, category);
        this.employee.setCategory(category);
        return this;
    }

    public EmployeeBuilder surname(String surname) {
        this.surname = surname;
        this.employee = new Employee(id, surname, category);
        this.employee.setCategory(category);
        return this;
    }

    public EmployeeBuilder calendar(Calendar entry) {
        employee.setEntry(entry);
        return this;
    }

    public EmployeeBuilder active(Boolean active) {
        this.employee.setActive(active);
        return this;
    }

    public EmployeeBuilder category(Category category) {
        employee.setCategory(category);
        return this;
    }

    public Employee build() {
        return this.employee;
    }
}
