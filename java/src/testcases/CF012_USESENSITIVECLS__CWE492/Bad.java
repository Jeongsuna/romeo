package testcases.CF012_USESENSITIVECLS__CWE492;

public final class Bad {
    private String badFiled;

    public Bad(String bad){
        badFiled = bad;
    }

    public class InnerClass{

        private String innerMethod(){

            return Bad.this.badFiled;
        }
    }

}
