package C8103_ConsecutiveLiteralAppends;

public class ConsecutiveLiteralAppends_BAD {
    public class TestFoo{
        public void main(String[] args) {
            StringBuilder buf = new StringBuilder();
            buf.append("Hello").append(" ").append("World");
            buf.append('h').append('e').append('l').append('l').append('o');
            buf.append(1).append('m');
        }
    }
}
