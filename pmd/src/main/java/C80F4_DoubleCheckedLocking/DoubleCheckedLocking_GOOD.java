package C80F4_DoubleCheckedLocking;

public class DoubleCheckedLocking_GOOD {
    public class Foo {
        volatile Object baz = null;
        Object bar() {
            if (baz == null) {
                synchronized(this) {
                    if (baz == null) {
                        baz = new Object();
                    }
                }
            }
            return baz;
        }
    }
}
