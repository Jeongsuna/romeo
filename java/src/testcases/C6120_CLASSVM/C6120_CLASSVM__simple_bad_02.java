package testcases.C6120_CLASSVM;

public class C6120_CLASSVM__simple_bad_02 {
    public class foo {
        String name;

        public void foo_good() {
            System.out.println(name);
        }

        public void main(String[] args) {
            foo objc = new foo();

            /* Compliant */
            objc.name = "foo_good";
            /* Compliant */
            objc.foo_good();
        }
    }
}
