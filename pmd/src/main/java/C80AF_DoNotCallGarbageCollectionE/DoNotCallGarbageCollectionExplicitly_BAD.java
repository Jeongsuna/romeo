package C80AF_DoNotCallGarbageCollectionE;

public class DoNotCallGarbageCollectionExplicitly_BAD {
    public class GCCall {
        public void doSomething() {
            Runtime.getRuntime().gc();
        }
        public void explicitGCcall() {
            System.gc();
        }
    }
}
