package com.example.kotlin.C0001_SQLI.s01

import javax.servlet.http.HttpServletRequest
import java.sql.*

class C0001_SQL_Injection__simple_Java11_02 {
    @Throws(SQLException::class)
    fun bad(request: HttpServletRequest, con: Connection) {
        val gubun: String = request.getParameter("gubun")
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
        val stmt: Statement = con.createStatement()
        stmt.use {

            /* FLAW : CWE-89 */
            val rs: ResultSet = stmt.executeQuery(sql)
            if (!rs.next()) {
                val id: String = rs.getString("idx")
            }
        }
    }

    @Throws(SQLException::class)
    fun good(request: HttpServletRequest, con: Connection) {
        val gubun: String = request.getParameter("gubun")
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
        val pstmt: PreparedStatement = con.prepareStatement(sql)
        pstmt.use {
            pstmt.setString(1, gubun)
            val rs = pstmt.executeQuery()
            if (!rs.next()) {
                val id: String = rs.getString("idx")
            }
        }
    }
}