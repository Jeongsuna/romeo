package C9030_LOCKMETHODCALL;

public class C9030_LOCKMETHODCALL_bad {

    private static Object obj;

    private void bad1() {
        while (!suitableCondition()){
            obj.wait();
        }
   // Perform removal
    }

    private boolean suitableCondition() {
        return true;
    }

    private void bad2() {
        while (!suitableCondition()){
            wait();
        }
   // Perform removal
    }
}
