package C9039_STATICFIELDINTHREAD;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class STATICFIELDINTHREAD_Bad {
    private static SimpleDateFormat simpleFormat = new SimpleDateFormat("HH-mm-ss");  // Noncompliant
    private static Calendar c = Calendar.getInstance();  // Noncompliant
}
