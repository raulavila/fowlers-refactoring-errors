package com.raulavila.person.improved;

public class Person {
    private Gender gender;

    public Person(Gender gender) {
        this.gender = gender;
    }
    
    public boolean isMale() {
        return gender == Gender.MALE;
    }
    
    public char getCode() {
        return gender.getCode();
    }
}
