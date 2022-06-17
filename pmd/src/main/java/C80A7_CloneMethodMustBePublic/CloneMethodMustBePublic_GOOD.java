package C80A7_CloneMethodMustBePublic;

public class CloneMethodMustBePublic_GOOD {
    public class Foo implements Cloneable {
        @Override
        public Object clone(){
           return null;
        }
    }
}
