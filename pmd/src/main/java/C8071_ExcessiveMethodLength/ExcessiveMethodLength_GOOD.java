package C8071_ExcessiveMethodLength;

public class ExcessiveMethodLength_GOOD {
    public void doSomething() {
        for (int i = 0; i < 100; i++) {
            doPrint("Hello world!");
        }
    }
    public void doPrint(String str){
        System.out.println(str);
    }
}
