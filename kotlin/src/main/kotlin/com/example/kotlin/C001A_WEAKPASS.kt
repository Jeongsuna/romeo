package romeo

import java.util.regex.Matcher
import java.util.regex.Pattern
import javax.servlet.http.HttpServletRequest

class C001A_WEAKPASS {

    fun bad(req: HttpServletRequest) {
        val id: String = req.getParameter("id")
        val pass: String = req.getParameter("pass")
        val userVO = UserVo(id, pass)
        // 비밀번호의 자릿수, 특수문자 포함 여부 등 복잡도를 체크하지 않고 등록
        val registerDAO = RegisterDAO()
        val result: String = registerDAO.register(userVO)
    }

    fun good(req: HttpServletRequest): String{
        val id: String = req.getParameter("id")
        val pass: String = req.getParameter("pass")
        // 비밀번호에 자릿수, 특수문자 포함 여부 등의 복잡도를 체크하고 등록하게 한다.
        val pattern: Pattern = Pattern.compile("((?=.*[a-zA-Z])(?=.*[0-9@#$%]). {9, })")
        val matcher: Matcher = pattern.matcher(pass)
        if (!matcher.matches()) {
            return "비밀번호 조합규칙 오류"
        }
        val userVO = UserVo(id, pass)
        val registerDAO = RegisterDAO()
        val result: String = registerDAO.register(userVO)
        return result
    }
}

class UserVo(id: String, password: String) {
    var id: String = ""
    var password: String = ""

    init {
        this.id = id
        this.password = password
    }
}

class RegisterDAO {
    fun register(userVo: UserVo): String {
        return "result"
    }
}