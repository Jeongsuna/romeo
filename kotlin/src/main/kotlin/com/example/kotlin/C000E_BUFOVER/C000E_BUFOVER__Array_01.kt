package romeo

import javax.servlet.http.HttpServletRequest

class C000E_BUFOVER__Array_01 {
    @Throws(Throwable::class)
    fun bad(request: HttpServletRequest, data: Array<String?>): String {
        val indexString: String = request.getParameter("index")
        val index: Int = Integer.parseInt(indexString)
        /* FLAW */
        return data[index]
    }

    @Throws(Throwable::class)
    fun good(request: HttpServletRequest, data: Array<String?>): String {
        val indexString: String = request.getParameter("index")
        val index: Int = Integer.parseInt(indexString)
        if (index < data.size) {
            return data[index]
        }
        else {
            return null
        }
    }
}