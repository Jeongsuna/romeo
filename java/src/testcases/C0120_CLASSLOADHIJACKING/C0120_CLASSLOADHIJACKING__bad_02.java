package C0120_CLASSLOADHIJACKING;

import android.content.Context;
import android.os.Environment;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.lang.reflect.Method;

public class C0120_CLASSLOADHIJACKING__bad_02 {
    public static void main(String[] args) {
        Context context = null; // 적절한 Context 객체를 가져와야 함

        File externalFilesDir = context.getExternalFilesDir(null); // 외부 저장소의 디렉토리 가져오기
        String absolutePath = externalFilesDir + "/mypath/mydexfile.dex"; // .dex 파일의 절대 경로

        DexClassLoader dexClassLoader = new DexClassLoader(absolutePath,
                externalFilesDir.getAbsolutePath(),
                null,
                C0120_CLASSLOADHIJACKING__bad_02.class.getClassLoader());
        // 외부저장소에서 클래스를 로드
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
