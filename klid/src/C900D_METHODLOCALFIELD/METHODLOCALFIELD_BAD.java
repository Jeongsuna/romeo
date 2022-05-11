package C900D_METHODLOCALFIELD;

public class METHODLOCALFIELD_BAD {
    public class Foo {
        private int a;
        private int b;

        public void boo1(int y) {
            a = y + 5;
            //...
            if(a == 0) {
                //...
            }
            //...
        }

        public void boo2(int y) {
            b = y + 3;
            //...
        }
    }
}
