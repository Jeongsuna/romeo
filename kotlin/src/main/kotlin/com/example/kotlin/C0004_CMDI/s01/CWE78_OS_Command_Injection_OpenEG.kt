/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE78_OS_Command_Injection__URLConnection_01.java
Label Definition File: CWE78_OS_Command_Injection.label.xml
Template File: sources-sink-01.tmpl.java
*/
/*
* @description
* CWE: 78 OS Command Injection
* BadSource: URLConnection Read data from a web server with URLConnection
* GoodSource: A hardcoded string
* BadSink: exec dynamic command execution with Runtime.getRuntime().exec()
* Flow Variant: 01 Baseline
*
* */
package com.example.kotlin.C0004_CMDI.s01

import org.springframework.web.bind.annotation.RequestMapping
import javax.servlet.http.*
import org.springframework.web.bind.annotation.ResponseBody
import testcasesupport.AbstractTestCaseBase.mainFromParent
import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader
import java.io.InputStream
import java.net.URL
import java.net.URLConnection
import java.sql.Connection
import java.sql.DriverManager
import java.sql.ResultSet
import java.sql.SQLException
import java.sql.Statement
import java.util.Properties
import java.util.Scanner

class CWE78_OS_Command_Injection_OpenEG : AbstractTestCaseServletReturnString() {
    @RequestMapping(value = arrayOf("/test/command_test.do"))
    @ResponseBody
    @Override
    @Throws(Throwable::class)
    fun bad(request: HttpServletRequest, response: HttpServletResponse?): String {
        val buffer = StringBuffer()
        var data: String = request.getParameter("data")
        if (data != null && data.equals("type")) {
            data = "$data " + request.getSession().getServletContext().getRealPath("/") + "file1.txt"
            System.out.println(data)
        }
        val process: Process
        val osName: String = System.getProperty("os.name")
        val cmd: Array<String?>
        if (osName.toLowerCase().startsWith("window")) {
            cmd = arrayOf("cmd.exe", "/c", data)
            for (s in cmd) System.out.print(s.toString() + " ")
        } else {
            cmd = arrayOf("/bin/sh", data)
        }
        try {
            /* FLAW */
            process = Runtime.getRuntime().exec(cmd)
            val in_: InputStream = process.getInputStream()
            val s = Scanner(in_, "EUC-KR")
            buffer.append("실행결과: <br/>")
            while (s.hasNextLine() === true) {
                buffer.append(s.nextLine() + "<br/>")
            }
        } catch (e: IOException) {
            buffer.append("실행오류발생")
            e.printStackTrace()
        }
        return buffer.toString()
    }

    @Override
    @Throws(Throwable::class)
    fun good(request: HttpServletRequest?, response: HttpServletResponse?): String? {
        // TODO Auto-generated method stub
        return null
    }

    companion object {
        /* Below is the main(). It is only used when building this testcase on
     * its own for testing or for building a binary to use in testing binary
     * analysis tools. It is not used when compiling all the testcases as one
     * application, which is how source code analysis tools are tested.
     */
        @Throws(ClassNotFoundException::class, InstantiationException::class, IllegalAccessException::class)
        fun main(args: Array<String?>?) {
            mainFromParent(args)
        }
    }
}
open class AbstractTestCaseServletReturnString {

}