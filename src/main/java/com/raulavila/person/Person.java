package com.raulavila.person;

public class Person {
    private final boolean male;
    private final char code;

    private Person(boolean male, char code) {
        this.male = male;
        this.code = code;
    }
    
    public static Person createMale() {
        return new Person(true, 'M');
    }
    
    public static Person createFemale() {
        return new Person(false, 'F');
    }

    public boolean isMale() {
        return male;
    }

    public char getCode() {
        return code;
    }
}
