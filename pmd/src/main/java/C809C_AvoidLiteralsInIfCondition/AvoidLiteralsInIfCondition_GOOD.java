package C809C_AvoidLiteralsInIfCondition;

public class AvoidLiteralsInIfCondition_GOOD {
    private static final int MAX_NUMBER_OF_REQUESTS = 10;

    public void checkRequests() {
        int i = 10;
        String aString = "a.b";
        Double aDouble = 0.0;
        int pos = 20;

        if (i == MAX_NUMBER_OF_REQUESTS) {
            doSomething();
        }
        if (aString.indexOf('.') >= 0) { }
        if (aDouble >= Double.MIN_VALUE) {}
    }
    private void doSomething() {
    }
}
