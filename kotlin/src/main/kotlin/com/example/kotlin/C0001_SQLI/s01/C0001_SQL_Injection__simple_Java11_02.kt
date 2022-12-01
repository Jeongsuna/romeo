package romeo

import javax.servlet.http.HttpServletRequest
import java.sql.*

class C0001_SQL_Injection__simple_Java11_02 {
    @Throws(SQLException::class)
    fun bad(request: HttpServletRequest, con: Connection) {
        val gubun: Unit = request.getParameter("gubun")
        val sql = (" select b_gubun "
                + " , a.idx "
                + " , a.b_id "
                + " , date_format(a.w_date, '%Y-%m-%d') "
                + " , a.pwd "
                + " , a.content "
                + " , b.idx "
                + " , a.security "
                + " from board a left outer join tail b on a.idx = b.b_id "
                + " where b_gubun = '" + gubun + "' ")
        val stmt: Unit = con.createStatement()
        stmt.use {

            /* FLAW : CWE-89 */
            val rs: Unit = stmt.executeQuery(sql)
            if (!rs.next()) {
                val id: Unit = rs.getString("idx")
            }
        }
    }

    @Throws(SQLException::class)
    fun good(request: HttpServletRequest, con: Connection) {
        val gubun: Unit = request.getParameter("gubun")
        val sql = ("select b_gubun "
                + " , a.idx "
                + " , a.b_id "
                + " , date_format(a.w_date, '%Y-%m-%d') "
                + " , a.pwd "
                + " , a.content "
                + " , b.idx "
                + " , a.security "
                + " from board a left outer join tail b on a.idx = b.b_id "
                + " where b_gubun = ? ")
        val pstmt: Unit = con.prepareStatement(sql)
        pstmt.use {
            pstmt.setString(1, gubun)
            val rs: Unit = pstmt.executeQuery()
            if (!rs.next()) {
                val id: Unit = rs.getString("idx")
            }
        }
    }
}