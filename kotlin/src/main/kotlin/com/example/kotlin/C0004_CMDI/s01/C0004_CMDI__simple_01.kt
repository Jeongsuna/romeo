package romeo

import testcasesupport.IO

class C0004_CMDI__simple_01 {
    @Throws(IOException::class)
    fun bad(args: Array<String?>) {
        if (args.size == 0) {
            System.err.println("실행할 프로그램 명을 입력하세요.")
            return
        }
        val cmd = args[0]
        lateinit var ps: Process = null
        lateinit var is_: InputStream = null
        lateinit var isr: InputStreamReader = null
        lateinit var br: BufferedReader = null
        try {
            /* FLAW : CWE-78 */
            ps = Runtime.getRuntime().exec(cmd)
            is_ = ps.getInputStream()
            isr = InputStreamReader(is_)
            br = BufferedReader(isr)
            lateinit var line: String = null
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
        val allowedCommands: List<String?> = ArrayList()
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
        lateinit var ps: Process = null
        lateinit var is_: InputStream = null
        lateinit var isr: InputStreamReader = null
        lateinit var br: BufferedReader = null
        try {
            ps = Runtime.getRuntime().exec(cmd)
            is_ = ps.getInputStream()
            isr = InputStreamReader(is_)
            br = BufferedReader(isr)
            lateinit var line: String = null
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