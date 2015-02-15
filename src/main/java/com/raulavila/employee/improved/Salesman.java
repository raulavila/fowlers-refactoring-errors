package com.raulavila.employee.improved;

import com.raulavila.employee.types.EmployeeType;

class Salesman implements Employee {
    @Override
    public EmployeeType getType() {
        return EmployeeType.SALESMAN;
    }
}
