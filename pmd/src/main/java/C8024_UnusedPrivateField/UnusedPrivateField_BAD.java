package C8024_UnusedPrivateField;

public class UnusedPrivateField_BAD {
    public static class Test {
        private static int BAR = 2;
        private int x = 5;
        private int y = 6;

        public int addOne() {
            return y++;
        }
    }
}
