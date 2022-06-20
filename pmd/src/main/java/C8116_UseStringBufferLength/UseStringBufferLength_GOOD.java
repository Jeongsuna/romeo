package C8116_UseStringBufferLength;

public class UseStringBufferLength_GOOD {
    public class Foo{
        public void main(String[] args) {
            StringBuffer sb = new StringBuffer();
            if (sb.length() == 0) {}
        }
    }
}
