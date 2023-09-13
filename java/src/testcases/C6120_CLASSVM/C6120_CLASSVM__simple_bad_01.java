package testcases.C6120_CLASSVM;

public class C6120_CLASSVM__simple_bad_01 {
    interface test {
        String name = "foo_bad";
    }

    public class foo {
        public void foo_bad(test t) {
            System.out.println(t.name);
        }

        public void main(String[] args) {
            foo objc = new foo();
            test obj1 = new test() {};

            /* Non-compliant */
            objc.foo_bad(obj1);
        }
    }
}
