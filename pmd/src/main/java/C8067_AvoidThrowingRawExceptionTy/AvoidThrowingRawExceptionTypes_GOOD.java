package C8067_AvoidThrowingRawExceptionTy;

public class AvoidThrowingRawExceptionTypes_GOOD {
    public class Test {
        public void foo() throws Exception {
            try{
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
