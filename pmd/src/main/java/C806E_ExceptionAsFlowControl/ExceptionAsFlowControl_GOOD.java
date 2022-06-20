package C806E_ExceptionAsFlowControl;

public class ExceptionAsFlowControl_GOOD {
    public void bar() {
        try {
        } catch (NullPointerException e) {
            e.printStackTrace();
        } catch (Exception e) {
            throw new NullPointerException("error");
        }
    }
}
