package C8077_LawOfDemeter;

public class LawOfDemeter_GOOD {
    public class Foo{
        public void example(Bar b) {
            C c = b.getC();
            b.doItOnC();

            D d = new D();
            d.doSomethingElse();
        }
    }
    public class Bar{
        public C getC() {
            return null;
        }

        public void doItOnC() {
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
