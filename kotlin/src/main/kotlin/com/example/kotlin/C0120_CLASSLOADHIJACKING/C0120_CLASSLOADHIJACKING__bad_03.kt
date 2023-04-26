package com.example.kotlin.C0120_CLASSLOADHIJACKING

import android.content.Context
import android.os.Environment
import java.io.File
import dalvik.system.DexClassLoader

object C0120_CLASSLOADHIJACKING__bad_03 {
    @JvmStatic
    fun main(args: Array<String>) {
        val context: Context? = null // 적절한 Context 객체를 가져와야 함
        val externalFilesDir: File? = context?.getExternalFilesDir(null) // 외부 저장소의 디렉토리 가져오기
        val absolutePath = "$externalFilesDir/mypath/mydexfile.dex" // .dex 파일의 절대 경로
        val dexClassLoader = DexClassLoader(absolutePath,
                Environment.getExternalStorageDirectory().getAbsolutePath(),
                null,
                C0120_CLASSLOADHIJACKING__bad_03::class.java.classLoader)
        // 외부저장소에서 클래스를 로드
        try {
            // 로드한 클래스의 패키지, 클래스명, 메소드명
            val className = "com.example.mydexfile.MyClass"
            val methodName = "myMethod"

            // 로드한 클래스의 인스턴스 생성
            val loadedClass: Class<*> = dexClassLoader.loadClass(className)
            val instance = loadedClass.newInstance()

            // 로드한 클래스의 메소드 호출
            val method = loadedClass.getDeclaredMethod(methodName)
            method.invoke(instance)
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }
}