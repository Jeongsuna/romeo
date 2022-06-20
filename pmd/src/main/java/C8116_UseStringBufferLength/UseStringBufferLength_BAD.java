package C8116_UseStringBufferLength;

public class UseStringBufferLength_BAD {
    public class Foo{
        public void main(String[] args) {
            StringBuffer sb = new StringBuffer();
            if (sb.toString().equals("")) {}
        }
    }
}
