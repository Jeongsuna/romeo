package com.example.kotlin.C0012_WRONGPERM

import testcasesupport.AbstractTestCase2
import java.io.File

/*
Filename : CWE732_Incorrect_Permission_Assignment_for_Critical_Resource__basic_File_01_bad.java
*/   class C0012_CWE732_Incorrect_Permission_Assignment_for_Critical_Resource__basic_File_02 : AbstractTestCase2() {
    @Throws(Throwable::class)
    override fun bad() {
        val file = File("/home/setup/system.ini")
        /* FLAW : CWE-732 */
        file.setExecutable(true, false)
        file.setReadable(true, false)
        file.setWritable(true, false)
    }

    @Throws(Throwable::class)
    override fun good() {
        val file = File("/home/setup/system.ini")
        file.setExecutable(false)
        file.setReadable(true)
        file.setWritable(false)
    }

    companion object {
        /* Below is the main(). It is only used when building this testcase on
       its own for testing or for building a binary to use in testing binary
       analysis tools. It is not used when compiling all the testcases as one
       application, which is how source code analysis tools are tested. */
        @Throws(ClassNotFoundException::class, InstantiationException::class, IllegalAccessException::class)
        @JvmStatic
        fun main(args: Array<String>) {
            mainFromParent(args)
        }
    }
}