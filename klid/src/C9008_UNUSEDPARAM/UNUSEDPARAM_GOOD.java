package C9008_UNUSEDPARAM;

public class UNUSEDPARAM_GOOD {
    void TestMethod(int x) {
        compute(x);
    }

    private void compute(int x) {
        int val = x;
    }
}
