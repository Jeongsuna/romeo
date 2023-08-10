package testcases.C000C_TYPEOVER__CWE190_Integer_Overflow.s01;

public class C000C_TYPEOVER_arrayAccessIntLit {

    private void bad1(){
        String[] strArray = {"1string","2string","3string","4string","5string"};
        String array = strArray[9]; // FLAW : 선언된 사이즈보다 큰 수에 접근합니다.
    }

    private void bad2(){
        String[] strArray = {"1string","2string","3string","4string","5string"};
        int idx = 7;
        String array = strArray[idx]; // FLAW : 선언된 사이즈보다 큰 수에 접근합니다.
    }

    private void bad3(int size){
        int accessIdx = 10;
        String[] strArray = new String[2000];
        String array = strArray[25100]; // FLAW : 선언된 사이즈보다 큰 수에 접근합니다.
    }

    private void good(int size){
        String[] strArray = {"1string","2string","3string","4string","5string"};
        int idx = 2;

        String array1 = strArray[2];    // FIX : 선언된 사이즈보다 작은 수에 접근합니다.
        String array2 = strArray[idx];  // FIX : 선언된 사이즈보다 작은 수에 접근합니다.
    }
}
