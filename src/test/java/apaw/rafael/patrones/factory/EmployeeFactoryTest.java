package apaw.rafael.patrones.factory;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import apaw.rafael.patrones.Employee;
import apaw.rafael.patrones.builder.EmployeeBuilder;
import apaw.rafael.patrones.singleton.EmployeeFactory;

public class EmployeeFactoryTest {
    private Employee employee1, employee2;

    private EmployeeFactory employeeFactory;

    @Before
    public void before() {
        employee1 = new EmployeeBuilder().id(1234).surname("Rafael").build();
        employee2 = new EmployeeBuilder().id(46767).surname("Eduardo").build();
        employeeFactory = new EmployeeFactory();
    }

    @Test
    public void testSetAuthenticationFactory() {
       employeeFactory.setAuthenticationFactory(employee1);
   
      assertEquals(employee1, employeeFactory.getAuthenticationFactory(1234));
    }

   

}
