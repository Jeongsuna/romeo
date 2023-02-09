package romeo

import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpSession


class C0011_IMPRAUTH {
    fun bad(req: HttpServletRequest) {
        val boardDao = BoardDao()
        val action: String = req.getParameter("action")
        val contentId: String = req.getParameter("contentId")
//         요청을 하는 사용자의 delete 작원 권한 확인 없이 수행하고 있어 안전하지 않다.
        if (action != null && action.equals("delete")) {
            boardDao.delete(contentId)
        }
    }

    fun good(req: HttpServletRequest, session: HttpSession) {

        val boardDao = BoardDao()
        val action: String = req.getParameter("action")
        val contentId: String = req.getParameter("contentId")
        // 세션에 저장된 사용자 정보를 얻어온다.
        val user = session.getAttribute("user")
        // 사용자정보에서 해당 사용자가 delete작업의 권한이 있는지 확인한 뒤 삭제 작업을 수행한다.
        if (action != null && action.equals("delete") && checkAccessControlList(user, action)) {
            boardDao.delete(contentId)
        }
    }

    private fun checkAccessControlList(attribute: Any?, action: String): Boolean {
        return true
    }
}

class BoardDao {
    fun delete(contentId: String) {
//         ...
    }
}
