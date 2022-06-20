package C80B5_DontUseFloatTypeForLoopIndi;

public class DontUseFloatTypeForLoopIndices_BAD {
    public static class Count {
        public static void main(String[] args) {
            final int START = 2000000000;
            int count = 0;
            for (float f = START; f < START + 50; f++){
                count++;
            }
            System.out.println(count);
        }
    }
}
