package C8102_ConsecutiveAppendsShouldReu;

public class ConsecutiveAppendsShouldReuse_GOOD {
    public class TestFoo{
        public void main(String[] args) {
            String foo = " ";
            StringBuffer buf = new StringBuffer();
            buf.append("Hello").append(foo).append("World");
        }
    }
}
