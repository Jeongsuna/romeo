package C80FD_AvoidInstantiatingObjectsIn;

public class AvoidInstantiatingObjectsInLoops_BAD {
    public static class Something {
        public static void main( String as[] ) {
            for (int i = 0; i < 10; i++) {
                Foo f = new Foo();
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
