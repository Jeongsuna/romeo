package C9022_RUNOVERRIDE;

public class RUNOVERRIDE_GOOD {
    class myClass extends Thread { // Compliant - calling super constructor with a Runnable
        myClass(Runnable target) {
            super(target); // calling super constructor with a Runnable, which will be used for when Thread.run() is executed
            // ...
        }
    }
}

