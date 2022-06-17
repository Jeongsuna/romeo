package C807D_SimplifiedTernary;

public class SimplifiedTernary_BAD {
    public class Foo {
        private boolean condition;
        public boolean test() {
            return condition ? true : something();
        }
        public void test2() {
            final boolean value = condition ? false : something(); ;
        }
        public boolean test3() {
            return condition ? something() : true;
        }
        public void test4() {
            final boolean otherValue = condition ? something() : false;
        }
        public boolean test5() {
            return condition ? true : false;
        }
    }

    private boolean something() {
        return false;
    }
}
