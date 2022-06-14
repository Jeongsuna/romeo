package C80FB_AvoidArrayLoops;

public class AvoidArrayLoops_GOOD {
    public class Foo {
        public void testMethod() {
            int[] x = new int[10];
            int[] y = new int[10];
            int[] z = new int[10];

            for (int i=0;i<10;i++) {
                y[i]=x[z[i]];
            }
        }
    }
}
