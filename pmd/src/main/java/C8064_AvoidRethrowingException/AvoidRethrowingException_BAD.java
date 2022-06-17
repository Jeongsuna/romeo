package C8064_AvoidRethrowingException;

public class AvoidRethrowingException_BAD {
    public void bar() {
        try {
        }  catch (Exception e) {
            throw e;
        }
    }
}
