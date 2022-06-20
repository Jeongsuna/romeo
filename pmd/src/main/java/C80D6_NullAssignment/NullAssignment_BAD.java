package C80D6_NullAssignment;

public class NullAssignment_BAD {
    public void bar() {
        Object x = null;
        x = new Object();
        x = null;
    }
}
