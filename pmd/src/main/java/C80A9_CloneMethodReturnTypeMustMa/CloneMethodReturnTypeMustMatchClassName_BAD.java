package C80A9_CloneMethodReturnTypeMustMa;

public class CloneMethodReturnTypeMustMatchClassName_BAD {
    public class Foo implements Cloneable {
        @Override
        protected Object clone() {
            return null;
        }
    }

}
