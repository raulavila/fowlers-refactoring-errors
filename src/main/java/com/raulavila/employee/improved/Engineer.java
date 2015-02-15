package com.raulavila.employee.improved;

import com.raulavila.employee.types.EmployeeType;

class Engineer implements Employee {
    @Override
    public EmployeeType getType() {
        return EmployeeType.ENGINEER;
    }
}
