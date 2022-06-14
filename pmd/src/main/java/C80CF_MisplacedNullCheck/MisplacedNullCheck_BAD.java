package C80CF_MisplacedNullCheck;

public class MisplacedNullCheck_BAD {
    public class Test {
        private Object x;
        void foo() {
            Object bar = null;
            if (x != null && x.equals(bar)) {}
            if (x == null || x.equals(bar)) {}
        }
    }
}
