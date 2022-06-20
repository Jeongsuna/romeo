package C80D0_MissingBreakInSwitch;

import junit.framework.TestCase;

public class MissingBreakInSwitch_GOOD {
    public void bar(String status) {
        switch(status) {
            case "CANCELLED":
                doCancelled();
                break;
            case "ERROR":
                doErrorHandling();
                break;
            default:
                doAnything();
                break;
        }
    }

    private void doAnything() {
    }

    private void doErrorHandling() {
    }

    private void doCancelled() {
    }
}
