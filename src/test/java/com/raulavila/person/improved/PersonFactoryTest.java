package com.raulavila.person.improved;

import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;

public class PersonFactoryTest {

    @Test
    public void testCreateMale() throws Exception {
        Person person = PersonFactory.createMale();
        assertThat(person.getCode()).isEqualTo('M');
        assertThat(person.isMale()).isTrue();

    }
    
    @Test
    public void testCreateFemale() throws Exception {
        Person person = PersonFactory.createFemale();
        assertThat(person.getCode()).isEqualTo('F');
        assertThat(person.isMale()).isFalse();

    }
}
