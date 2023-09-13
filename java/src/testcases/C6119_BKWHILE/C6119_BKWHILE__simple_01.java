package testcases.C6119_BKWHILE;

public class C6119_BKWHILE__simple_01 {
    public void bad(){
        int i = 0;

        /* Non-compliant */
        while(i<10){
            i++;
            if (i % 2 == 0)
                continue;
            System.out.println(i);
        }
    }

    public void good(){
        int i = 0;

        /* Compliant */
        while (i<10){
            i++;
            if (i % 2 == 0)
                continue;
            System.out.println(i);
        }
    }
}
