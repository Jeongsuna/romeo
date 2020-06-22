package romeo

import javax.servlet.annotation.WebServlet
import javax.servlet.http.Cookie
import javax.servlet.http.HttpServlet
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

@WebServlet(name = "World", value = ["/world"])
class C001B_PERSCOOKIE : HttpServlet() {
    override fun doGet(req: HttpServletRequest?, resp: HttpServletResponse?) {
        bad(req, resp)
        good(req, resp)
    }
    fun bad(req: HttpServletRequest?, resp: HttpServletResponse?) {
        val cookie = Cookie("SecretMessage", "test")

        /* FLAW: Make the cookie persistent, by setting the expiration to 5 years */
        cookie.setMaxAge(60 * 60 * 24 * 365 * 5)
    }
    fun good(req: HttpServletRequest?, resp: HttpServletResponse?) {
        val cookie = Cookie("SecretMessage", "test")

        /* FIX: Set the max age to a negative value, so that it will only persist until the browser is shutdown */
        cookie.setMaxAge(-1)
    }
}