package com.raulavila.factories.improved;

import com.raulavila.factories.types.EmployeeType;

class Salesman implements Employee {
    @Override
    public EmployeeType getType() {
        return EmployeeType.SALESMAN;
    }
}
