package CF00E_DECLAREGENEX__CWE396;

import org.apache.log4j.Category;

public class DECLAREGENEX_BAD {
    private static Category logger;

    public static void main(String[] args) {
        try {
            doAnything();
        }
        catch (Exception e) {
            logger.error("doAnything failed", e);
        }
    }

    private static void doAnything() {
    }
}
