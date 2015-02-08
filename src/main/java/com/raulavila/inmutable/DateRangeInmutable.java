package com.raulavila.inmutable;

import java.util.Date;

public class DateRangeInmutable {

    private final Date start;
    private final Date end;

    public DateRangeInmutable(Date start, Date end) {
        this.start = start;
        this.end = end;
    }

    public Date getStart() {
        return new Date(start.getTime());
    }

    public Date getEnd() {
        return new Date(end.getTime());
    }
}
