package C8073_ExcessivePublicCount;

public class ExcessivePublicCount_GOOD {
    public class Foo {
        public String value;
        public boolean something;

        public void doWork() {}
        public void doMoreWork() {}
    }
    public class Foo2{
        public float var;
        // [... more more public attributes ...]

        public void doWorkAgain() {}
        // [... more more public methods ...]
    }
}
