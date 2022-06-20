package C80D4_NonCaseLabelInSwitchStateme;

public class NonCaseLabelInSwitchStatement_BAD {
    public class Foo {
        void bar(String a) {
            switch (a) {
                case "1":
                    break;
                /*mylabel:
                    break;*/
                default:
                    break;
            }
        }
    }
}
