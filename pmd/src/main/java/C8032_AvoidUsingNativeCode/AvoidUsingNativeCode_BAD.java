package C8032_AvoidUsingNativeCode;

public class AvoidUsingNativeCode_BAD {
    public class SomeJNIClass {
        public void invalidCallsInMethod() throws SecurityException, NoSuchMethodException {
            System.loadLibrary("nativelib");
        }
    }
}
