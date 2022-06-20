package C8102_ConsecutiveAppendsShouldReu;

public class ConsecutiveAppendsShouldReuse_BAD {
    public class TestFoo{
        public void main(String[] args) {
            String foo = " ";
            StringBuffer buf = new StringBuffer();
            buf.append("Hello");
            buf.append(foo);
            buf.append("World");
        }
    }
}
