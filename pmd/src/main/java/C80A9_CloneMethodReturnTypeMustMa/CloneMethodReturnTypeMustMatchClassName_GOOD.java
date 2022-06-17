package C80A9_CloneMethodReturnTypeMustMa;

public class CloneMethodReturnTypeMustMatchClassName_GOOD {
    public class Foo implements Cloneable {
        @Override
        protected Foo clone() {
            return null;
        }
    }
}
