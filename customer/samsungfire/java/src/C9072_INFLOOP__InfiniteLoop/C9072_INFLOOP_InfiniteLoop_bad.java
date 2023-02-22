package C9072_INFLOOP__InfiniteLoop;

public class C9072_INFLOOP_InfiniteLoop_bad {

    public void badMethod() {
        int val1 = 0;
        int val2 = 1;

        while (true) { // @violation
            val1 += val2;
        }
    }
}
