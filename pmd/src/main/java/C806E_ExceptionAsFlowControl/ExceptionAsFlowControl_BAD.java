package C806E_ExceptionAsFlowControl;

public class ExceptionAsFlowControl_BAD {
    public void bar() {
        try {
            try {
            } catch (NullPointerException e) {
                throw new NullPointerException("error");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
