package com.raulavila.employee;

import com.raulavila.employee.types.EmployeeType;
import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;

public class EmployeeTest {

    @Test
    public void testCreateEmployees() throws Exception {

        Employee manager = Employee.create(EmployeeType.MANAGER);
        assertThat(manager.getType()).isEqualTo(EmployeeType.MANAGER);
        
        Employee engineer = Employee.create(EmployeeType.ENGINEER);
        assertThat(engineer.getType()).isEqualTo(EmployeeType.ENGINEER);
        
        Employee salesman = Employee.create(EmployeeType.SALESMAN);
        assertThat(salesman.getType()).isEqualTo(EmployeeType.SALESMAN);
    }

    @Test(expected = NullPointerException.class)
    public void testCreateIncorrectEmployee() throws Exception {
        Employee.create(null);

    }
}
