package C8090_AvoidAccessibilityAlteratio;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedAction;


public class AvoidAccessibilityAlteration_GOOD {
    public class Violation {
        private void invalidSetAccessCalls() throws NoSuchMethodException, SecurityException {
            String privateField = AccessController.doPrivileged(new PrivilegedAction<String>() {
                @Override
                public String run() {
                    try {
                        Field field = Violation.class.getDeclaredField("aPrivateField");
                        field.setAccessible(true);
                        return (String) field.get(null);
                    } catch (ReflectiveOperationException | SecurityException e) {
                        throw new RuntimeException(e);
                    }
                }
            });
        }
    }
}
