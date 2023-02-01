package com.example.kotlin.C000A_CSRF

import java.util.logging.Logger
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

/*
Filename : CWE352_Cross_Site_Request_Forgery__getCookiesServlet_write_01_bad.java
*/   class C000A_CWE352_Cross_Site_Request_Forgery__getCookiesServlet_write_01_bad {
    @Throws(Throwable::class)
    fun bad(request: HttpServletRequest, response: HttpServletResponse) {
        lateinit var data: String
        val log_bad = Logger.getLogger("local-logger")
        data = "" /* initialize data in case there are no cookies */

        /* Read data from cookies */
        run {
            val cookieSources = request.cookies
            if (cookieSources != null) {
                data = cookieSources[0].value
            }
        }

        /* FLAW: untrusted input with CSRF prevention mechanism */
        response.writer.write(data)
    }
}