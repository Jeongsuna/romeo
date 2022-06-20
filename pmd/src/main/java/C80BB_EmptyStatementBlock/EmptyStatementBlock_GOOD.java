package C80BB_EmptyStatementBlock;

public class EmptyStatementBlock_GOOD {
    public class Foo {
        private int _bar;
        public void setBar(int bar) {
            { _bar = bar; }
        }
    }
}
