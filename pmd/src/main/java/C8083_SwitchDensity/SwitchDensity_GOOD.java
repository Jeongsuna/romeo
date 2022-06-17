package C8083_SwitchDensity;

public class SwitchDensity_GOOD {
    public class Foo {
        public void bar(int x) {
            switch (x) {
                case 1: {
                    case1(x);
                    break;
                } case 2: {
                    case2(x);
                    break;
                }
            }
        }
        public void case1(int x){
            // lots of statements
        }
        public void case2(int x){
            // lots of statements
        }
    }
}
