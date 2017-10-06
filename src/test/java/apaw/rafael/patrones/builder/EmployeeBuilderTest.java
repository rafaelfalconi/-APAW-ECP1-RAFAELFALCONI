package apaw.rafael.patrones.builder;

import static org.junit.Assert.assertEquals;

import java.util.Calendar;
import java.util.GregorianCalendar;

import org.junit.Test;

import apaw.rafael.patrones.Category;
import apaw.rafael.patrones.Employee;

public class EmployeeBuilderTest {
    @Test
    public void testEmployeeBuilderLongStringCalendarBoolean() {
        Category category = new Category(123, 3, "Ventas");
        Employee employee = new EmployeeBuilder().id(123).surname("Rafael").category(category).build();
        Calendar entry = GregorianCalendar.getInstance();
        Boolean active = false;
        employee = new EmployeeBuilder().id(123).surname("Rafael").category(category).calendar(entry).active(active).build();
        assertEquals(123, employee.getId());
        assertEquals("Rafael", employee.getSurname());
        assertEquals(category, employee.getCategory());
        String date = String.valueOf(employee.getEntry().get(Calendar.DAY_OF_MONTH)) + "/"
                + String.valueOf(employee.getEntry().get(Calendar.MONTH) + 1) + "/"
                + String.valueOf(employee.getEntry().get(Calendar.YEAR));
        Calendar fecha = GregorianCalendar.getInstance();
        String dateTest = String.valueOf(fecha.get(Calendar.DAY_OF_MONTH)) + "/"
                + String.valueOf(fecha.get(Calendar.MONTH )+1) + "/"
                + String.valueOf(fecha.get(Calendar.YEAR));
        assertEquals(dateTest, date);
        assertEquals(false, employee.getActive());
    }

    @Test
    public void testCategoryContatinsFalse() {
        Employee employee = new EmployeeBuilder().id(123).surname("Rafael").build();
        assertEquals(null, employee.getCategory());
    }

    @Test
    public void testCategoryContaintsTrue() {
        Category category = new Category(123, 3, "Ventas");
        Employee employee = new EmployeeBuilder().id(123).surname("Rafael").category(category).build();
        assertEquals(category, employee.getCategory());
    }
}
