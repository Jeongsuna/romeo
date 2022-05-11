package C9024_NOTCALLRUNFINALIZERSONEXIT;

public class NOTCALLRUNFINALIZERSONEXIT_BAD {
    public static void main(String [] args) {
        //...
        System.runFinalizersOnExit(true);  // Noncompliant
        //...
    }

    protected void finalize(){
        doSomething();
    }

    private void doSomething() {
    }
}
