package C901A_USEREFLECTION;

import java.lang.reflect.Method;

public class USEREFLECTION_BAD {
    public static void main(String[] args) throws NoSuchMethodException {
        Method m = String.class.getMethod("getBytes", new Class[]{
                int.class,int.class, byte[].class, int.class });
        if (m.isAnnotationPresent(Override.class)) {int i = 1 + 2;}   // Noncompliant; test will always return false, even when @Override is present in the code
    }
}
