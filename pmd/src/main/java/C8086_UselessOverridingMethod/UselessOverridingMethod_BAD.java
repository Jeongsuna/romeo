package C8086_UselessOverridingMethod;

import javax.swing.*;

public class UselessOverridingMethod_BAD {
    class FooA {
        protected void fooMethod(Action action) {
        }
    }

    class FooB extends FooA {
        @Override
        public void fooMethod(Action action) {
            super.fooMethod(action);
        }
    }
}
