package C80EE_UseProperClassLoader;

public class UseProperClassLoader_GOOD {
    public class Foo {
        ClassLoader th = Thread.currentThread().getContextClassLoader();
    }
    private class Bar{}
}

