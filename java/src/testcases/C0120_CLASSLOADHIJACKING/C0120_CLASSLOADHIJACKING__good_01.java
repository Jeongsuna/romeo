package C0120_CLASSLOADHIJACKING;

import dalvik.system.DexClassLoader;
import java.io.File;
import java.lang.reflect.Field;
import java.util.ArrayList;

public class C0120_CLASSLOADHIJACKING__good_01 {
    public static void main(String[] args) {
        String dexFilePath = "/path/to/your/dex/file.dex"; // 로드할 .dex 파일의 경로
        String optDexFolderPath = "/path/to/your/optdex/folder/"; // 옵티마이즈된 .dex 파일을 저장할 폴더 경로

        final File tmpDir = new File(optDexFolderPath);
        final File dexDir = new File(dexFilePath);
        tmpDir.mkdir();

        final DexClassLoader classLoader = new DexClassLoader(
                dexDir.getAbsolutePath(), tmpDir.getAbsolutePath(),
                null, ClassLoader.getSystemClassLoader());

        try {
            Class<?> classToLoad = classLoader.loadClass("com.registry.Registry");
            Field classesField = classToLoad.getDeclaredField("_classes");
            ArrayList<Class<?>> classes = (ArrayList<Class<?>>) classesField.get(null);

            // classes 리스트에서 로드한 클래스들에 대한 작업 수행
            for (Class<?> clazz : classes) {
                // 로드한 클래스에 대한 필드나 메소드 접근 등의 작업 수행
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
