package C810A_RedundantFieldInitializer;

public class RedundantFieldInitializer_BAD {
    public class C {
        boolean b   = false;
        byte by     = 0;
        short s     = 0;
        char c      = 0;
        int i       = 0;
        long l      = 0;

        float f     = .0f;
        double d    = 0d;
        Object o    = null;

        MyClass mca[] = null;
        int i1 = 0, ia1[] = null;

        class Nested {
            boolean b = false;
        }
        private class MyClass {
        }
    }
}
