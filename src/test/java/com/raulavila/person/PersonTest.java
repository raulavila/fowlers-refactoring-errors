package com.raulavila.person;

import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;

public class PersonTest {

    @Test
    public void testCreateMale() throws Exception {
        Person person = Person.createMale();
        assertThat(person.getCode()).isEqualTo('M');
        assertThat(person.isMale()).isTrue();
    }
    
    @Test
    public void testCreateFemale() throws Exception {
        Person person = Person.createFemale();
        assertThat(person.getCode()).isEqualTo('F');
        assertThat(person.isMale()).isFalse();
    }
}
