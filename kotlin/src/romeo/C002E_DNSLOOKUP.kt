package romeo

import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader
import java.net.InetAddress
import java.net.Socket
import java.util.logging.Logger
import javax.servlet.annotation.WebServlet
import javax.servlet.http.HttpServlet
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

@WebServlet(name = "Hello", value = ["/hello"])
class C002E_DNSLOOKUP : HttpServlet() {
    override fun doGet(req: HttpServletRequest, res: HttpServletResponse) {
        var data: String = "adtest.com"
        val log_bad: Logger = Logger.getLogger("local-logger")
        val giriAddress = InetAddress.getByName(data)
        data = giriAddress.hostAddress
        var sock: Socket? = null
        var buffread: BufferedReader? = null
        var instrread: InputStreamReader? = null
        try {
            /* Read data using an outbound tcp connection */
            /* FLAW */
            sock = Socket(data, 9000)

            /* read input from socket */
            instrread = InputStreamReader(sock.getInputStream())
            buffread = BufferedReader(instrread)
            data = buffread.readLine()
        } catch (ioe: IOException) {
            log_bad.warning("Error with stream reading")
        } finally {
            /* clean up stream reading objects */
            try {
                buffread?.close()
            } catch (ioe: IOException) {
                log_bad.warning("Error closing buffread")
            } finally {
                try {
                    instrread?.close()
                } catch (ioe: IOException) {
                    log_bad.warning("Error closing instrread")
                }
            }

            /* clean up socket objects */
            try {
                sock?.close()
            } catch (e: IOException) {
                log_bad.warning("Error closing sock")
            }
        }
    }
}