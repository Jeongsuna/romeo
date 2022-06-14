package C8024_UnusedPrivateField;

public class UnusedPrivateField_GOOD {
    public static class Test {
        //Delete Unused Private Field
        private int y = 6;
        public int addOne() {
            return y++;
        }
    }
}
