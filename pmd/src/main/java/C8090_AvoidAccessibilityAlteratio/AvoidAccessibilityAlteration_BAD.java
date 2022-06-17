package C8090_AvoidAccessibilityAlteratio;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class AvoidAccessibilityAlteration_BAD {
    public class Violation {
        private void invalidSetAccessCalls() throws NoSuchMethodException, SecurityException {
            Constructor<?> constructor = this.getClass().getDeclaredConstructor(String.class);
            constructor.setAccessible(true);

            Method privateMethod = this.getClass().getDeclaredMethod("aPrivateMethod");
            privateMethod.setAccessible(true);
        }
    }
}
