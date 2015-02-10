package com.raulavila.factories.improved;

import com.google.common.collect.ImmutableMap;
import com.raulavila.factories.types.EmployeeType;
import org.apache.commons.lang3.Validate;

import java.util.Map;

public enum EmployeeFactory {
    INSTANCE;
    
    private Map<EmployeeType, Class<? extends Employee>> typeClassMap =
                new ImmutableMap.Builder<EmployeeType, Class<? extends Employee>>()
                    .put(EmployeeType.ENGINEER, Engineer.class)
                    .put(EmployeeType.SALESMAN, Salesman.class)
                    .put(EmployeeType.MANAGER, Manager.class)
                    .build();

    public Employee create(EmployeeType type) {
        validateType(type);
        try {
            Class<? extends Employee> clazz = typeClassMap.get(type);
            return clazz.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            throw new RuntimeException("Unexpected error instantiating employee!", e);
        }
    }

    private void validateType(EmployeeType type) {
        Validate.notNull(type, "Parameter type can't be null");

        if (!typeClassMap.containsKey(type)) {
            throw new RuntimeException("Type is not associated to a concrete class");
        }
    }

}
