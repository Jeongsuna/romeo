package C807D_SimplifiedTernary;

public class SimplifiedTernary_GOOD {
    public class Foo {
        private boolean condition;

        public boolean test() {
            return condition || something();
        }
        public void test2() {
            final boolean value = !condition && something();
        }
        public boolean test3() {
            return !condition || something();
        }
        public void test4() {
            final boolean otherValue = condition && something();
        }
        public boolean test5() {
            return condition;
        }
    }

    private boolean something() {
        return false;
    }
}
