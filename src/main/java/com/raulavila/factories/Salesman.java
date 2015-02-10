package com.raulavila.factories;

import com.raulavila.factories.types.EmployeeType;

class Salesman extends Employee {
    @Override
    public EmployeeType getType() {
        return EmployeeType.SALESMAN;
    }
}
