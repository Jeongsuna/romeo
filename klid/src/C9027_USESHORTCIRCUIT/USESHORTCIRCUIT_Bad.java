package C9027_USESHORTCIRCUIT;

public class USESHORTCIRCUIT_Bad {

    public void exMethod(){
        if(getTrue() | getFalse()) {
            // ...
        } // Noncompliant; both sides evaluated
    }

    public boolean getTrue() {
        return true;
    }

    public boolean getFalse() {
        return false;
    }

}
