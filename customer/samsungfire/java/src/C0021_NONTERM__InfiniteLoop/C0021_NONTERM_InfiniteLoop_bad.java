package C0021_NONTERM__InfiniteLoop;

public class C0021_NONTERM_InfiniteLoop_bad {

    public void badMethod() {
        int val1 = 0;
        int val2 = 1;

        while (true) { // @violation
            val1 += val2;
        }
    }
}
