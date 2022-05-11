package C901B_USEDATE;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class USEDATE_BAD {
    public static void main(String[] args) {
        Calendar c = new GregorianCalendar(2022, 12, 25);
        if (c.get(Calendar.MONTH) == 12) {
            // ...
        }
    }
}
