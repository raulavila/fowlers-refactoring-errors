package com.raulavila.employee;

import com.raulavila.employee.types.EmployeeType;

public abstract class Employee {

    protected Employee() {}

    public static Employee create(EmployeeType type) {
        switch (type) {
            case ENGINEER:
                return new Engineer();
            case SALESMAN:
                return new Salesman();
            case MANAGER:
                return new Manager();
            default:
                throw new AssertionError();
        }
    }

    public abstract EmployeeType getType();
}
