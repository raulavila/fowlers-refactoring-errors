package com.raulavila.inmutable;

import org.junit.Test;

import java.util.Date;

import static org.fest.assertions.api.Assertions.assertThat;
import static org.fest.util.Dates.parse;

public class DateRangeTest {

    @Test
    public void testInmutableClass() throws Exception {
        Date start = parse("2001-01-01");
        Date end = parse("2001-01-02");

        DateRange range = new DateRange(start, end);

        Date dateAux = range.getEnd();

        //Modifies end date!
        dateAux.setTime(123123);

        assertThat(range.getStart()).isEqualTo(parse("2001-01-01")) ;

        //End date of the range modified!
        assertThat(range.getEnd()).isNotEqualTo(parse("2001-01-02"));
    }
}
