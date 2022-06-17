package C8073_ExcessivePublicCount;

import java.util.ArrayList;

public class ExcessivePublicCount_BAD {
    public class Foo {
        public String value;
        public boolean something;
        public float var;
        // [... more more public attributes ...]

        public void doWork() {}
        public void doMoreWork() {}
        public void doWorkAgain() {}
        // [... more more public methods ...]
    }
}
