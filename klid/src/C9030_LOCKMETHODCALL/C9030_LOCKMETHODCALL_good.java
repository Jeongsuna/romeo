package C9030_LOCKMETHODCALL;

public class C9030_LOCKMETHODCALL_good {

    private static Object obj;

    private void good1() {
        synchronized (obj) {
            while (!suitableCondition()) {
                obj.wait();
            }
            // Perform removal
        }
    }


    private synchronized void good2() {
        while (!suitableCondition()){
            wait();
        }
        // Perform removal
    }
}

    private boolean suitableCondition() {
        return true;
    }
}
