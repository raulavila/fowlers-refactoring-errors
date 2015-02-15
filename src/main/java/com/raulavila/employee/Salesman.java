package com.raulavila.employee;

import com.raulavila.employee.types.EmployeeType;

class Salesman extends Employee {
    @Override
    public EmployeeType getType() {
        return EmployeeType.SALESMAN;
    }
}
