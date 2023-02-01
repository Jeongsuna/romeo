package com.example.kotlin.C0006_REDIRECT.s01

import testcasesupport.IO
import java.io.IOException
import java.sql.Connection
import java.sql.PreparedStatement
import java.sql.ResultSet
import java.sql.SQLException
import java.util.logging.Level
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse
import javax.servlet.http.HttpSession

class C0006_REDIRECT__simple_01 {
    fun bad(session: HttpSession, request: HttpServletRequest, response: HttpServletResponse) {
        val id = session.getAttribute("id") as String
        val bn = request.getParameter("gubun")
        //외부로부터 입력받은 URL 이 검증없이 다른 사이트로 이동이 가능하여 안전하지 않다.
        val rd = request.getParameter("redirect")
        lateinit var conn: Connection
        lateinit var pstmt: PreparedStatement
        lateinit var rs: ResultSet
        if (id.length > 0) {
            val sql = "select level from customer where customer_id = ?"
            try {
                conn = IO.getDBConnection()
                pstmt = conn.prepareStatement(sql)
                pstmt.setString(1, id)
                rs = pstmt.executeQuery()
                rs.next()
                if ("0" == rs.getString(1) && "01AD" == bn) {
                    /* FLAW : CWE-601 */
                    response.sendRedirect(rd)
                    return
                }
            } catch (e: SQLException) {
                IO.logger.log(Level.WARNING, e.toString())
            } catch (e: IOException) {
                IO.logger.log(Level.WARNING, e.toString())
            } finally {
                try {
                    rs.close()
                    pstmt.close()
                    conn.close()
                } catch (e: SQLException) {
                    IO.logger.log(Level.WARNING, e.toString())
                }
            }
        }
    }

    fun good(session: HttpSession, request: HttpServletRequest, response: HttpServletResponse): String {
        val allowedUrl = arrayOf("/main.do", "/login.jsp", "list.do")
        val id = session.getAttribute("id") as String
        val bn = request.getParameter("gubun")
        var rd = request.getParameter("redirect")
        lateinit var conn: Connection
        lateinit var pstmt: PreparedStatement
        lateinit var rs: ResultSet
        rd = try {
            allowedUrl[rd.toInt()]
        } catch (e: NumberFormatException) {
            return "잘못된 접근입니다."
        } catch (e: ArrayIndexOutOfBoundsException) {
            return "잘못된 입력입니다."
        }
        if (id.length > 0) {
            val sql = "select level from customer where customer_id = ?"
            try {
                conn = IO.getDBConnection()
                pstmt = conn.prepareStatement(sql)
                pstmt.setString(1, id)
                rs = pstmt.executeQuery()
                rs.next()
                if ("0" == rs.getString(1) && "01AD" == bn) {
                    response.sendRedirect(rd)
                    return "success"
                }
            } catch (e: SQLException) {
                IO.logger.log(Level.WARNING, e.toString())
            } catch (e: IOException) {
                IO.logger.log(Level.WARNING, e.toString())
            } finally {
                try {
                    rs.close()
                    pstmt.close()
                    conn.close()
                } catch (e: SQLException) {
                    IO.logger.log(Level.WARNING, e.toString())
                }
            }
        }
        return "fail"
    }
}