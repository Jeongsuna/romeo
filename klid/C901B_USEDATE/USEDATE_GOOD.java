package C901B_USEDATE;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class USEDATE_GOOD {
    public static void main(String[] args) {
        Calendar c = new GregorianCalendar(2022, 11, 25);
        if (c.get(Calendar.MONTH) == 11) {
            // ...
        }
    }
}
