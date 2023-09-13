package testcases.C6113_BKACCESS;

public class C6113_BKACCESS__simple_01 {
    public void bad(){
        /* Non-compliant */
        String [] weeks = {"월", "화", "수", "목", "금", "토", "일"};

        // 자바에는 구조체, 포인터 존재하지 않음
    }
    public void good(){
        /* Compliant */
        String[] weeks = {"월", "화", "수", "목", "금", "토", "일"};

        // 자바에는 구조체, 포인터 존재하지 않음
    }
}
