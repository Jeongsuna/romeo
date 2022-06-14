package C80FB_AvoidArrayLoops;

public class AvoidArrayLoops_BAD {
    public class Foo {
        public void testMethod() {
            int[] x = new int[10];
            int[] y = new int[10];
            for (int i=0;i<10;i++) {
                y[i]=x[i];
            }
        }
    }
}
