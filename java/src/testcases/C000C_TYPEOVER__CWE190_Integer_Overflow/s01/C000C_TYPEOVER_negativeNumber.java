package testcases.C000C_TYPEOVER__CWE190_Integer_Overflow.s01;

public class C000C_TYPEOVER_negativeNumber {

        public void bad() {
            int arraySize = 10;
            int[] buffer = new int[-1]; // FLAW : 배열의 사이즈는 음수가 될 수 없습니다.


            for (int i = 0; i < arraySize + 1; i++) {
                buffer[i] = i * 2;
            }
        }

    public void good() {
        int arraySize = 10;
        int[] buffer = new int[10]; // FIX


        for (int i = 0; i < arraySize + 1; i++) {
            buffer[i] = i * 2;
        }
    }

}
