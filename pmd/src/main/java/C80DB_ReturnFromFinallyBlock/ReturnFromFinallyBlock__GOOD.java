package C80DB_ReturnFromFinallyBlock;

public class ReturnFromFinallyBlock__GOOD {
    public class Test {
        public String bar() throws Exception {
            try {
                throw new Exception( "My Exception" );
            } catch (Exception e) {
                throw e;
            } finally {
                // finally 블록에서 return을 하지 않아야 합니다.
            }
        }
    }
}
