package C80A8_CloneMethodMustImplementClo;

public class CloneMethodMustImplementCloneable_BAD {
    public class MyClass {
        Object foo = null;
        public Object clone() throws CloneNotSupportedException {
            return foo;
        }
    }
}
