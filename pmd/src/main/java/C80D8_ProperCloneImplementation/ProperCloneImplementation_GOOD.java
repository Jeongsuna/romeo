package C80D8_ProperCloneImplementation;

public class ProperCloneImplementation_GOOD {
    class Foo{
        public Object clone() throws CloneNotSupportedException {
            Foo clone = (Foo)super.clone();
            return clone;
        }
    }
}
