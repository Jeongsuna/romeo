package C80AE_DataflowAnomalyAnalysis;

public class DataflowAnomalyAnalysis_GOOD {
    public void foo(int param) {
        int buz = 5;
        buz = 6;
        foo(buz);
    }
}
