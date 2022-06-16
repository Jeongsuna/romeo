package C805F_UselessQualifiedThis;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UselessQualifiedThis_GOOD {
    public class Foo {
        private ActionListener returnListener() {
            return new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    doSomethingWithQualifiedThis(Foo.this);
                }
            };
        }
        private class Foo3 {
            final Foo myFoo = Foo.this;
        }
    }

    private void doSomethingWithQualifiedThis(Foo foo) {
    }
}
