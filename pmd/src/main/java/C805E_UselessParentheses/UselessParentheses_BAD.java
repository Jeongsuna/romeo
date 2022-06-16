package C805E_UselessParentheses;

public class UselessParentheses_BAD {
    public class Foo {
        private int _bar1;
        private Integer _bar2;
        public void setBar(int n) {
            _bar1 = Integer.valueOf((n));
            _bar2 = (n);
        }
    }
}
