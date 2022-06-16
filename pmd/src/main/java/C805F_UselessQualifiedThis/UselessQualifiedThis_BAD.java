package C805F_UselessQualifiedThis;

public class UselessQualifiedThis_BAD {
    public class Foo {
        final Foo otherFoo = Foo.this;

        public void doSomething() {
            final Foo anotherFoo = Foo.this;
        }
        private class Foo2 {
            final Foo2 myFoo2 = Foo2.this;
        }
    }
}
