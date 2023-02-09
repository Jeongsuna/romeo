package romeo

import javax.servlet.http.HttpServletRequest

class C000C_TYPEOVER__simple_01 {
    fun bad(request: HttpServletRequest, msg_id: String) {
        var msg_str = ""
        val tmp: String = request.getParameter("slf_msg_param_num")
        if (tmp.equals("0")) {
            msg_str = PropertyUtil.getValue(msg_id)
        } else {
            // 외부입력값을 정수형으로 사용할 때 입력값의 크기를 검증하지 않고 사용
            /* FLAW : CWE-190 */
            val param_ct: Int = Integer.parseInt(tmp)
            val strArr = arrayOfNulls<String>(param_ct)
        }
    }
}
object PropertyUtil {
    fun getValue(msgId: String): String {
        return ""
    }
}