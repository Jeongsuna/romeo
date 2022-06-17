package C8095_AvoidCatchingThrowable;

public class AvoidCatchingThrowable_GOOD {
    public void bar() {
        try {
            // do something
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
