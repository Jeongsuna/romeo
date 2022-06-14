package C80EF_AvoidSynchronizedAtMethodLe;

public class AvoidSynchronizedAtMethodLevel_GOOD {
    public class Bar {
        void bar() {
            synchronized (this){
            }
        }
    }
}
