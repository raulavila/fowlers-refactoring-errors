package com.raulavila.employee;

import com.raulavila.employee.types.EmployeeType;

class Engineer extends Employee {
    @Override
    public EmployeeType getType() {
        return EmployeeType.ENGINEER;
    }
}
