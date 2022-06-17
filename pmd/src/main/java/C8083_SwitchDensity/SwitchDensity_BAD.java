package C8083_SwitchDensity;

public class SwitchDensity_BAD {
    public class Foo {
        public void bar(int x) {
            switch (x) {
                case 1: {
                    // lots of statements
                    break;
                } case 2: {
                    // lots of statements
                    break;
                }
            }
        }
    }
}
