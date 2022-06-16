package C8055_ShortVariable;

public class ShortVariable_BAD {
    public static class Something {
        private static int q = 15;
        public static void main(String as[]) {
            int r = 20 + q;
            for (int i = 0; i < 10; i++) {
                r += q;
            }
            Integer[] numbers = new Integer[10];
            for (Integer i : numbers) {
                r += q;
            }
        }
    }
}
