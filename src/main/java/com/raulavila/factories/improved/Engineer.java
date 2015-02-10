package com.raulavila.factories.improved;

import com.raulavila.factories.types.EmployeeType;

class Engineer implements Employee {
    @Override
    public EmployeeType getType() {
        return EmployeeType.ENGINEER;
    }
}
