package C801B_PreserveStackTrace;

public class PreserveStackTrace_GOOD {
    public class Bar {
        void good() throws Exception {
            try{
                Integer.parseInt("x");
            } catch (Exception ex) {
                throw new Exception(ex);
            }
            try {
                Integer.parseInt("x");
            } catch (Exception ex) {
                throw (IllegalStateException)new IllegalStateException().initCause(ex);
            }
        }
    }
}
