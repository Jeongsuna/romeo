package C80A8_CloneMethodMustImplementClo;

public class CloneMethodMustImplementCloneable_GOOD {
    public class MyClass implements Cloneable{
        Object foo = null;
        @Override
        public Object clone() throws CloneNotSupportedException {
            return foo;
        }
    }
}
