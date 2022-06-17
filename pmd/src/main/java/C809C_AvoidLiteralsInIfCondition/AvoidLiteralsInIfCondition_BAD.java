package C809C_AvoidLiteralsInIfCondition;

public class AvoidLiteralsInIfCondition_BAD {
    public void checkRequests() {
        int i = 10;
        String aString = "a.b";
        Double aDouble = 0.0;
        int pos = 20;

        if (i == 10) {
            doSomething();
        }
        if (aString.indexOf('.') != -1) {}
        if (aDouble > 0.0) {}
        if (i == pos + 5) {}
    }
    private void doSomething() {
    }
}
