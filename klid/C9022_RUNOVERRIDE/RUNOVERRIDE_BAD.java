package C9022_RUNOVERRIDE;

public class RUNOVERRIDE_BAD {
    public class MyRunner extends Thread { // Noncompliant; run method not overridden
        public void doSometing() {
            //...
        }
    }
}
