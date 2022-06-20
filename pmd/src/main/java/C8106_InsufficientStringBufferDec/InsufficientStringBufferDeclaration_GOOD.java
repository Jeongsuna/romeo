package C8106_InsufficientStringBufferDec;

public class InsufficientStringBufferDeclaration_GOOD {
    public class TestBar{
        public void main(String[] args) {
            StringBuilder good = new StringBuilder(41);
            good.append("This is a long string, which is pre-sized");
        }
    }
}
