package C80EE_UseProperClassLoader;

public class UseProperClassLoader_BAD {
    public class Foo {
        ClassLoader cl = Bar.class.getClassLoader();
    }
    private class Bar{}
}

