package C8055_ShortVariable;

public class ShortVariable_GOOD {
    public static class Something {
        private static int fieldvar = 15;
        public static void main(String args[]) {
            int localvar = 20 + fieldvar;
            for (int i = 0; i < 10; i++) {
                localvar += fieldvar;
            }
            Integer[] numbers = new Integer[10];
            for (Integer i : numbers) {
                localvar += fieldvar;
            }
        }
    }
}
