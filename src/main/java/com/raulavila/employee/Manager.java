package com.raulavila.employee;

import com.raulavila.employee.types.EmployeeType;

class Manager extends Employee {
    @Override
    public EmployeeType getType() {
        return EmployeeType.MANAGER;
    }
}
