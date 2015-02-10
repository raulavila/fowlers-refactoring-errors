package com.raulavila.factories;

import com.raulavila.factories.types.EmployeeType;

class Manager extends Employee {
    @Override
    public EmployeeType getType() {
        return EmployeeType.MANAGER;
    }
}
