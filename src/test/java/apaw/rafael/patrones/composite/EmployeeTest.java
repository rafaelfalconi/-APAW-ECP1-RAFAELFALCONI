package apaw.rafael.patrones.composite;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import apaw.rafael.patrones.Employee;

import apaw.rafael.patrones.builder.EmployeeBuilder;

import org.junit.Before;

public class EmployeeTest {
    private Employee employee1;

    private EmployeeLeaf employeeLeaf1;

    private EmployeeCompisite employeeComposite;

    @Before
    public void before() {
        this.employee1 = new EmployeeBuilder().id(56756).surname("Rafael").build();

        this.employeeLeaf1 = new EmployeeLeaf("Empleado1", employee1);

        this.employeeComposite = new EmployeeCompisite("empleados");
    }

    @Test
    public void testView() {
        assertEquals(56756, this.employeeLeaf1.view());
    }

    @Test
    public void testName() {
        assertEquals("empleados", this.employeeComposite.name());
    }

}
