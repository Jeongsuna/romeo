package C80FD_AvoidInstantiatingObjectsIn;

public class AvoidInstantiatingObjectsInLoops_GOOD {
    public static class Something {
        public static void main( String as[] ) {
            Foo f = new Foo();
            for (int i = 0; i < 10; i++) {
                System.out.println(i + f.getName());
            }
        }
        private static class Foo {
            public String getName() {
                return "";
            }
        }
    }
}
