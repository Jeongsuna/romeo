package C80CF_MisplacedNullCheck;

public class MisplacedNullCheck_GOOD {
    public class Test {
        private Object x;

        void foo() {
            Object bar = null;
            if (x.equals(bar) && x != null) {}
            if (x.equals(bar) || x == null) {}
        }
    }
}
