package C80B5_DontUseFloatTypeForLoopIndi;

public class DontUseFloatTypeForLoopIndices_GOOD {
    public static class Count {
        public static void main(String[] args) {
            final int START = 2000000000;
            int count = 0;
            for (int i = START; i < START + 50; i++){
                count++;
            }
            System.out.println(count);
        }
    }
}
