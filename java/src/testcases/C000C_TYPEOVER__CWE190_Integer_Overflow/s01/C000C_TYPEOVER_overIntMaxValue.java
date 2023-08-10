package testcases.C000C_TYPEOVER__CWE190_Integer_Overflow.s01;

public class C000C_TYPEOVER_overIntMaxValue {

    private void bad(){
        String[] strArray = new String[2147483648]; // FLAW : Int의 MAX값보다 큰 값으로 선언하고 있습니다.
        String element2 = strArray[5];

    }

    private void good(){

        String[] strArray = new String[21450156]; // FIX : Int의 MAX값보다 작은 값으로 선언하고 있습니다.
        String element2 = strArray[5];

    }



}
