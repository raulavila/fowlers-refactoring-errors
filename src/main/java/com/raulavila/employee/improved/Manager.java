package com.raulavila.employee.improved;

import com.raulavila.employee.types.EmployeeType;

class Manager implements Employee {
    @Override
    public EmployeeType getType() {
        return EmployeeType.MANAGER;
    }
}
