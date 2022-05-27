package C9027_USESHORTCIRCUIT;

public class USESHORTCIRCUIT_Good {

    public void exMethod(){
        if(getTrue() || getFalse()) {
            // ...
        } // true short-circuit logic
    }

    public boolean getTrue() {
        return true;
    }

    public boolean getFalse() {
        return false;
    }

}
