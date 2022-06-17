package C8095_AvoidCatchingThrowable;

public class AvoidCatchingThrowable_BAD {
    public void bar() {
        try {
            // do something
        } catch (Throwable th) {  // should not catch Throwable
            th.printStackTrace();
        }
    }
}
