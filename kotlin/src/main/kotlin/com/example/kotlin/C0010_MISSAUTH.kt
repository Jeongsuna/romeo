package romeo

import org.springframework.web.servlet.ModelAndView
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpSession

class C0010_MISSAUTH {

    fun bad(memberModel: MemberModel, req: HttpServletRequest, session: HttpSession): ModelAndView {
        val mav = ModelAndView()
        //1. 로그인한 사용자를 불러온다.
        val userId = session.getAttribute("userId")
        val passwd = req.getParameter("oldUserPw")

        val service = MemberService()

        //2. 실제 수정하는 사용자와 일치 여부를 확인하지 않고, 회원정보를 수정하여 안전하지 않다.
        if (service.modifyMember(memberModel)) {
            mav.setViewName("redirect:/board/list.do")
            session.setAttribute("userName", memberModel.getUserName())
            return mav
        } else {
            mav.addObject("errCode", 2)
            mav.setViewName("/board/member_modify")
            return mav
        }

    }


    fun good(memberModel: MemberModel, req: HttpServletRequest, session: HttpSession): ModelAndView {
        val mav = ModelAndView()
        //1. 로그인한 사용자를 불러온다.
        val userId = session.getAttribute("userId")
        val passwd = req.getParameter("oldUserPw")
        val service = MemberService()
        //2. 회원정보를 실제 수정하는 사용자와 로그인 사용자와 동일한지 확인한다.
        val requestUser = memberModel.getUserId()
        if (userId != null && requestUser != null && !userId.equals(requestUser)) {
            mav.addObject("errCode", 1)
            mav.addObject("member", memberModel)
            mav.setViewName("/board/member_modify")
            return mav
        }
        //3. 동일한 경우에만 회원정보를 수정해야 안전하다.
        if (service.modifyMember(memberModel)) {
            // ...
        }
        return mav

    }

}

class MemberModel {
    fun getUserName() {
    }

    fun getUserId() {

    }
}

class MemberService {
    fun modifyMember(memberModel: MemberModel): Boolean {
        return true
    }
}