package C8009_ConstantsInInterface;

public class ConstantsInInterface_BAD {
    public interface ConstantsInterface {
        final int CONST1 = 1;
        static final int CONST2 = 1;
        int CONST3 = 1;
    }
}
