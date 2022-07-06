package C80DC_SimpleDateFormatNeedsLocale;

import java.text.SimpleDateFormat;
import java.util.Locale;

public class SimpleDateFormatNeedsLocale_GOOD {
    public class Test {
        private SimpleDateFormat sdformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.KOREA);
    }
}
