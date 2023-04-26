package com.example.kotlin.C0120_CLASSLOADHIJACKING

import java.io.File
import dalvik.system.DexClassLoader


class C0120_CLASSLOADHIJACKING__bad_01 {
    fun main() {
        val mypath = "mypath/mydexfile.dex" // .dex 파일의 상대 경로
        val optimizeDexOutputPath = File("optimized_dex/") // 최적화된 .dex 파일의 저장 경로
        val dexClassLoader = DexClassLoader(mypath,
                optimizeDexOutputPath.absolutePath,
                null,
                C0120_CLASSLOADHIJACKING__bad_01::class.java.classLoader)
        // 상대경로로 로드할 클래스를 확인
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