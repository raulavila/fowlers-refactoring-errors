package com.raulavila.factories.improved;

import com.raulavila.factories.types.EmployeeType;

class Manager implements Employee {
    @Override
    public EmployeeType getType() {
        return EmployeeType.MANAGER;
    }
}
