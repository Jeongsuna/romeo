package C80AD_ConstructorCallsOverridable;

public class ConstructorCallsOverridableMethod_GOOD {
    public class SeniorClass {
        public SeniorClass(){
            toString(); //may throw NullPointerException if overridden
        }
        public String toString(){
            return "IAmSeniorClass";
        }
    }
    public class JuniorClass extends SeniorClass {
        private String name;
        public JuniorClass(){
            super(); //Automatic call leads to NullPointerException
            name = "JuniorClass";
        }
        public String toStringJounior(){
            return name.toUpperCase();
        }
    }
}
