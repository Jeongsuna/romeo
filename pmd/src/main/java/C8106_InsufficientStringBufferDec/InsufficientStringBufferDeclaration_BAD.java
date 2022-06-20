package C8106_InsufficientStringBufferDec;

public class InsufficientStringBufferDeclaration_BAD {
    public class TestBar{
        public void main(String[] args) {
            StringBuilder bad = new StringBuilder();
            bad.append("This is a long string that will exceed the default 16 characters");
        }
    }
}
