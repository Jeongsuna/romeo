package C80ED_UseLocaleWithCaseConversion;

import java.util.Locale;

public class UseLocaleWithCaseConversions_GOOD {
    public static void main(String[] args) {
        String x = "";
        if (x.toLowerCase(Locale.US).equals("list")) { }
        if (x.equalsIgnoreCase("list")) { }

    }
}
