package C8077_LawOfDemeter;

import android.location.Address;

public class LawOfDemeter_BAD {
    public class Foo{
        public void example(Bar b) {
            C c = b.getC();
            c.doIt();
            b.getC().doIt();
        }
    }
    public class Bar{
        public C getC() {
            return null;
        }
    }
    public class C{
        public void doIt() {
        }
    }
    private class D {
        public void doSomethingElse() {
        }
    }
}
