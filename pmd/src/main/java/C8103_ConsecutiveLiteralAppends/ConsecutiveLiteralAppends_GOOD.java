package C8103_ConsecutiveLiteralAppends;

public class ConsecutiveLiteralAppends_GOOD {
    public class TestFoo{
        public void main(String[] args) {
            StringBuilder buf = new StringBuilder();
            buf.append("Hello World");
            buf.append("hello");
            buf.append("1m");
        }
    }
}
