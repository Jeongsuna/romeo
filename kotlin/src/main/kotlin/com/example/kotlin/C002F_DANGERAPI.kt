package romeo

import java.io.IOException
import java.io.ObjectInputStream
import java.io.ObjectOutputStream
import java.lang.Exception
import java.net.Socket
import java.net.URL
import java.net.URLConnection
import javax.servlet.http.HttpServletRequest


class C002F_DANGERAPI: javax.servlet.http.HttpServlet() {

    fun bad(req: HttpServletRequest) {
        val socker = Socket("kisa.or.kr", 8080)
        try {
            do_something("logger")
        } catch (e: IOException) {
            System.exit(1)
        }
    }
    fun good() {
        val oos: ObjectOutputStream? = null
        val ois: ObjectInputStream? = null
        try {
            val url = URL("http://127.0.0.1:8080/DataServlet")
            // 보안기능을 제공하는 프레임워크의 메소드를 사용하여야한다.
            val urlConn: URLConnection = url.openConnection()
            urlConn.setDoOutput(true)
        } catch (e: Exception) {
            //
        }
    }

    fun do_something(str: String) {
        // do_something
    }
}