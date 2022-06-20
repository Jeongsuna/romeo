package C80F4_DoubleCheckedLocking;

public class DoubleCheckedLocking_BAD {
    public class Foo {
        Object baz = null;
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
