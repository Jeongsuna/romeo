package C80D4_NonCaseLabelInSwitchStateme;

public class NonCaseLabelInSwitchStatement_GOOD {
    public class Foo {
        void bar(String a) {
            switch (a) {
                case "1":
                    break;
                case "mylabel":
                    break;
                default:
                    break;
            }
        }
    }
}
