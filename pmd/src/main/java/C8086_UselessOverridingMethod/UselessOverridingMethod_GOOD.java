package C8086_UselessOverridingMethod;

import javax.swing.*;


public class UselessOverridingMethod_GOOD {
    class FooA {
        protected void fooMethod(Action action) {
        }
    }

    class FooB extends FooA {
        @Override
        public void fooMethod(Action action) {
            Action actionfoo = action;
            super.fooMethod(actionfoo);
        }
    }
    class FooC extends FooA {
        @Id
        @Override
        public void fooMethod(Action action) {
            super.fooMethod(action);
        }
    }
}
