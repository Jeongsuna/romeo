package com.example.kotlin.C0120_CLASSLOADHIJACKING

import dalvik.system.DexClassLoader
import java.io.File

object C0120_CLASSLOADHIJACKING__good_01 {
    @JvmStatic
    fun main(args: Array<String>) {
        val dexFilePath = "/path/to/your/dex/file.dex" // 로드할 .dex 파일의 경로
        val optDexFolderPath = "/path/to/your/optdex/folder/" // 옵티마이즈된 .dex 파일을 저장할 폴더 경로
        val tmpDir = File(optDexFolderPath)
        val dexDir = File(dexFilePath)
        tmpDir.mkdir()
        val classLoader = DexClassLoader(
                dexDir.absolutePath, tmpDir.absolutePath,
                null, ClassLoader.getSystemClassLoader())
        try {
            val classToLoad: Class<*> = classLoader.loadClass("com.registry.Registry")
            val classesField = classToLoad.getDeclaredField("_classes")
            val classes = classesField[null] as ArrayList<Class<*>>

            // classes 리스트에서 로드한 클래스들에 대한 작업 수행
            for (clazz in classes) {
                // 로드한 클래스에 대한 필드나 메소드 접근 등의 작업 수행
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }
}