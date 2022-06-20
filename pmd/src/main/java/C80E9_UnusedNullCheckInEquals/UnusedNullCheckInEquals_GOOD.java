package C80E9_UnusedNullCheckInEquals;

public class UnusedNullCheckInEquals_GOOD {
    public class Test {
        public String method1() { return "ok";}
        public void method(String a) {
            String b;
            if (a.equals(method1())) {
            }
        }
    }
}
