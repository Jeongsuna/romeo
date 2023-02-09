package com.example.kotlin.C0004_CMDI.s01

import testcasesupport.IO
import java.io.BufferedReader
import java.io.InputStreamReader
import java.io.IOException
import java.io.InputStream
import java.util.ArrayList
import java.util.List
import java.util.logging.Level


class C0004_CMDI__simple_01 {
    @Throws(IOException::class)
    fun bad(args: Array<String?>) {
        if (args.size == 0) {
            System.err.println("실행할 프로그램 명을 입력하세요.")
            return
        }
        val cmd = args[0]
        var ps: Process? = null
        var is_: InputStream? = null
        var isr: InputStreamReader? = null
        var br: BufferedReader? = null
        try {
            /* FLAW : CWE-78 */
            ps = Runtime.getRuntime().exec(cmd)
            is_ = ps.getInputStream()
            isr = InputStreamReader(is_)
            br = BufferedReader(isr)
            var line: String? = null
            while (br.readLine().also { line = it } != null) {
                System.out.println(line)
            }
        } catch (e: IOException) {
            IO.logger.log(Level.WARNING, e.toString())
        } finally {
            if (br != null) br.close()
            if (isr != null) isr.close()
            if (is_ != null) is_.close()
        }
    }

    @Throws(IOException::class)
    fun good(args: Array<String?>) {

        // 해당 어플리케이션에서 실행할 수 있는 프로그램을 노트패드와 계산기로 제한하고 있다.
        val allowedCommands = ArrayList<String>()
        allowedCommands.add("notepad")
        allowedCommands.add("calc")
        if (args.size == 0) {
            System.err.println("실행할 프로그램 명을 입력하세요.")
            return
        }
        val cmd = args[0]
        if (!allowedCommands.contains(cmd)) {
            System.err.println("허용되지 않은 명령어입니다.")
            return
        }
        var ps: Process? = null
        var is_: InputStream? = null
        var isr: InputStreamReader? = null
        var br: BufferedReader? = null
        try {
            ps = Runtime.getRuntime().exec(cmd)
            is_ = ps.getInputStream()
            isr = InputStreamReader(is_)
            br = BufferedReader(isr)
            var line: String? = null
            while (br.readLine().also { line = it } != null) {
                System.out.println(line)
            }
        } catch (e: IOException) {
            IO.logger.log(Level.WARNING, e.toString())
        } finally {
            if (br != null) br.close()
            if (isr != null) isr.close()
            if (is_ != null) is_.close()
        }
    }
}