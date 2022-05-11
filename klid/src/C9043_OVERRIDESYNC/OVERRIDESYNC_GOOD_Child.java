package C9043_OVERRIDESYNC;

public class OVERRIDESYNC_GOOD_Child extends OVERRIDESYNC_GOOD_Parent {
    @Override
    synchronized public void execute() {
        // ...
        super.execute();
    }
}
