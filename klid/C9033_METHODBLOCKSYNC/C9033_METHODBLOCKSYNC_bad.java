package C9033_METHODBLOCKSYNC;

public class C9033_METHODBLOCKSYNC_bad {
    private String color = "blue";

    private void bad_foo() {
        synchronized(color) {  // Noncompliant; lock is actually on object instance "blue" referred to by the color variable
            //...
            color = "yellow"; // other threads now allowed into this block
            // ...
        }
        synchronized(new Object()) { // Noncompliant this is a no-op.
            // ...
        }
    }
}
