package C9072_INFLOOP__InfiniteLoop;

public class C9072_INFLOOP_InfiniteLoop_good {

    public void goodMethod() {
        int val1 = 0;
        int val2 = 1;

        while (true) {
            val1 += val2;
            if(val1 > 1000) { // @fixed
                break;
            }
        }
    }
}
