package C901B_USEDATE;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class USEDATE_BAD {
    public static void main(String[] args) {

        Date d = new Date();
        d.setDate(25);
        d.setYear(2014);
        d.setMonth(12);  // Noncompliant; rolls d into the next year

        Calendar c = new GregorianCalendar(2022, 12, 25); // Noncompliant
        if (c.get(Calendar.MONTH) == 12) {  // Noncompliant; invalid comparison
            // ...
        }
    }
}
