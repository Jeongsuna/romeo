package C80D4_NonCaseLabelInSwitchStateme;

public class NonCaseLabelInSwitchStatement_GOOD {
    public class Foo {
        private final String MYLABEL = "";
        String condition;
        void bar(String condition) {
            switch (condition) {
                case "1":
                    break;
                case MYLABEL:
                    break;
                default:
                    break;
            }
        }
    }
}
