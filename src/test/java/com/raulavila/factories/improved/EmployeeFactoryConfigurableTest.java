package com.raulavila.factories.improved;

import com.google.common.collect.ImmutableMap;
import com.raulavila.factories.types.EmployeeType;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.Map;

import static org.fest.assertions.api.Assertions.assertThat;

public class EmployeeFactoryConfigurableTest {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    private EmployeeFactoryConfigurable employeeFactory;

    @Before
    public void setUp() throws Exception {
        Map<EmployeeType, Class<? extends Employee>> typeClassMap =
                new ImmutableMap.Builder<EmployeeType, Class<? extends Employee>>()
                        .put(EmployeeType.ENGINEER, Engineer.class)
                        .put(EmployeeType.SALESMAN, Salesman.class)
                        .put(EmployeeType.MANAGER, Manager.class)
                        .build();
        
        employeeFactory = new EmployeeFactoryConfigurable(typeClassMap);
    }

    @Test
    public void testCreateEmployees() throws Exception {

        Employee manager = employeeFactory.create(EmployeeType.MANAGER);
        assertThat(manager.getType()).isEqualTo(EmployeeType.MANAGER);

        Employee engineer = employeeFactory.create(EmployeeType.ENGINEER);
        assertThat(engineer.getType()).isEqualTo(EmployeeType.ENGINEER);

        Employee salesman = employeeFactory.create(EmployeeType.SALESMAN);
        assertThat(salesman.getType()).isEqualTo(EmployeeType.SALESMAN);
    }

    @Test
    public void testCreateEmployeeWithNullType() throws Exception {
        expectedException.expect(NullPointerException.class);
        expectedException.expectMessage("Parameter type can't be null");

        employeeFactory.create(null);
    }
}
