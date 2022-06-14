package C901B_USEDATE;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class USEDATE_BAD {
    public static void main(String[] args) {

        Date d = new Date();
        d.setDate(25);
        d.setYear(2014);
        d.setMonth(12);  // Noncompliant; rolls d into the next year
        d.setDate(32);  // Noncompliant; rolls d into the next month
        d.setHours(24);  // Noncompliant; rolls d into the next date
        d.setMinutes(61);  // Noncompliant; rolls d into the next hour
        d.setSeconds(62);  // Noncompliant; rolls d into the next minute

        Calendar c = new GregorianCalendar(2022, 12, 25, 24, 60, 62); // Noncompliant

        if (c.get(Calendar.MONTH) == 12 && (24 == c.get(Calendar.HOUR_OF_DAY)) && (24 == c.get(Calendar.HOUR_OF_DAY))) {  // Noncompliant; invalid comparison
            // ...
        }

        if (12 == c.get(Calendar.MONTH)) {  // Noncompliant; invalid comparison
            // ...
        }
    }
}
