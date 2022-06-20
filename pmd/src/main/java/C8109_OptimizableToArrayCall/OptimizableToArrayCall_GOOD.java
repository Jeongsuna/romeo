package C8109_OptimizableToArrayCall;

import java.util.List;

public class OptimizableToArrayCall_GOOD {
    public static class TestBar{
        public static void main(String[] args) {
            List<Foo> foos = getFoos();
            Foo[] fooArray = foos.toArray(new Foo[0]);
        }

        private static List<Foo> getFoos() {
            return null;
        }

        private static class Foo {
        }
    }
}
