package C9033_METHODBLOCKSYNC;

public class C9033_METHODBLOCKSYNC_good {
    private String color = "blue";
    private final Object obj = new Object();

    private void good_foo() {
        synchronized(obj) {
            //...
            color = "yellow";
            // ...
        }
    }
}
