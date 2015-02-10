package com.raulavila.factories.improved;

import com.google.common.collect.ImmutableMap;
import com.raulavila.factories.types.EmployeeType;
import org.apache.commons.lang3.Validate;

import java.util.Map;

public class EmployeeFactoryConfigurable {

    private final Map<EmployeeType, Class<? extends Employee>> typeClassMap;

    public EmployeeFactoryConfigurable(Map<EmployeeType, Class<? extends Employee>> typeClassMap) {
        this.typeClassMap = typeClassMap;
    }

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
