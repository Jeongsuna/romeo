package C9008_UNUSEDPARAM;

public class UNUSEDPARAM_BAD {
    void TestMethod(int x, int y) {
        compute(x);
    }

    private void compute(int x) {
    }
}
