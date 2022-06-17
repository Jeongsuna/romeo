package C80A7_CloneMethodMustBePublic;

public class CloneMethodMustBePublic_BAD {
    public class Foo1 implements Cloneable {
        @Override
        protected Object clone() throws CloneNotSupportedException {
            return null;
        }
    }

    public class Foo2 implements Cloneable {
        @Override
        protected Foo2 clone() {
            return null;
        }
    }

}
