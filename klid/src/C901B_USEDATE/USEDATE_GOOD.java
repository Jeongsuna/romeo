package C901B_USEDATE;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class USEDATE_GOOD {
    public static void main(String[] args) {
        
        Date d = new Date();
        d.setDate(25);
        d.setYear(2014);
        d.setMonth(11);

        Calendar c = new GregorianCalendar(2022, 11, 25);
        if (c.get(Calendar.MONTH) == 11) {
            // ...
        }
    }
}
