package C80DB_ReturnFromFinallyBlock;

public class ReturnFromFinallyBlock__BAD {
    public class Test {
        public String bar() {
            try {
                throw new Exception( "My Exception" );
            } catch (Exception e) {
                throw e;
            } finally {
                return "F. I. N.";
            }
        }
    }
}
