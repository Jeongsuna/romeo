package C80D0_MissingBreakInSwitch;

import junit.framework.*;

public class MissingBreakInSwitch_BAD {
    public void bar(String status) {
        switch(status) {
            case "CANCELLED":
                doCancelled();
            case "ERROR":
                doErrorHandling();
            default:
                doAnything();
        }
    }

    private void doAnything() {
    }

    private void doErrorHandling() {
    }

    private void doCancelled() {
    }
}
