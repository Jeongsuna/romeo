package C80D8_ProperCloneImplementation;

public class ProperCloneImplementation_BAD {
    class Foo{
        public Object clone(){
            return new Foo();
        }
    }
}
