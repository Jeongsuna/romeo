package C9013_SYNCINSTANC;

import java.util.Arrays;
import java.util.List;

public class SYNCINSTANC_BAD {
    private static final Boolean bool = Boolean.FALSE;
    private static final Integer integer = Integer.valueOf(0);
    private static final String str = "LOCK";
    private static final List<String> lists = Arrays.asList("l", "i", "s", "t");

    public void foo() {

        synchronized (bool){  // Noncompliant
            // ...
        }
        synchronized (integer) {  // Noncompliant
            // ...
        }
        synchronized (str) {  // Noncompliant
            // ...
        }
        synchronized (lists) {  // Noncompliant
            // ...
        }
    }

}
