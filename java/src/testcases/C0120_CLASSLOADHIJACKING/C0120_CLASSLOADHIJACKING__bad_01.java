package testcases.C0120_CLASSLOADHIJACKING;

import dalvik.system.DexClassLoader;
import java.io.File;
import java.lang.reflect.Method;

public class C0120_CLASSLOADHIJACKING__bad_01 {
    public static void main(String[] args) {
        String mypath = "mypath/mydexfile.dex"; // .dex 파일의 상대 경로
        File optimizeDexOutputPath = new File("optimized_dex/"); // 최적화된 .dex 파일의 저장 경로

        DexClassLoader dexClassLoader = new DexClassLoader(mypath,
                optimizeDexOutputPath.getAbsolutePath(),
                null,
                C0120_CLASSLOADHIJACKING__bad_01.class.getClassLoader());
        // 상대경로로 로드할 클래스를 확인
        try {
            // 로드한 클래스의 패키지, 클래스명, 메소드명
            String className = "com.example.mydexfile.MyClass";
            String methodName = "myMethod";

            // 로드한 클래스의 인스턴스 생성
            Class<?> loadedClass = dexClassLoader.loadClass(className);
            Object instance = loadedClass.newInstance();

            // 로드한 클래스의 메소드 호출
            Method method = loadedClass.getDeclaredMethod(methodName);
            method.invoke(instance);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
