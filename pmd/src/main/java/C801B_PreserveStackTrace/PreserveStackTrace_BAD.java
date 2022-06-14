package C801B_PreserveStackTrace;

public class PreserveStackTrace_BAD {
    public class Bar {
        void bad() throws Exception {
            try{
                Integer.parseInt("x");
            } catch (Exception ex) {
                throw new Exception(ex.getMessage());
            }
        }
    }
}
