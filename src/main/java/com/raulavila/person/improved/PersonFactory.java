package com.raulavila.person.improved;

public class PersonFactory {
    
    public static Person createMale() {
        return new Person(Gender.MALE);
    }
    
    public static Person createFemale() {
        return new Person(Gender.FEMALE);
    }
}
