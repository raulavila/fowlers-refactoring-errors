package com.raulavila.factories;

import com.raulavila.factories.types.EmployeeType;

class Engineer extends Employee {
    @Override
    public EmployeeType getType() {
        return EmployeeType.ENGINEER;
    }
}
