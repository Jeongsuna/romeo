package testcases.C0003_XSS__CWE80.s01

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody
import testcasesupport.AbstractTestCaseServletReturnString
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

class CWE80_XSS_Spring1 : AbstractTestCaseServletReturnString() {
    @RequestMapping(value = ["/test/xss_test.do"])
    @ResponseBody
    @Throws(Throwable::class)
    override fun bad(request: HttpServletRequest, response: HttpServletResponse?): String {
        val buffer = StringBuffer()
        val data: String = request.getParameter("data")
        /* FLAW  */
        buffer.append(data)
        return buffer.toString()
    }

    @Throws(Throwable::class)
    override fun good(request: HttpServletRequest?, response: HttpServletResponse?): String? {
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
        @JvmStatic
        fun main(args: Array<String>) {
            mainFromParent(args)
        }
    }
}