package com.example.kotlin.C0005_FILEUPLOAD

import com.oreilly.servlet.MultipartRequest
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy

import java.io.File
import java.io.IOException
import java.sql.Connection
import java.sql.DriverManager
import java.sql.PreparedStatement
import java.sql.SQLException
import java.util.*
import javax.servlet.ServletException
import javax.servlet.http.HttpServlet
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

class C0005_FILEUPLOAD__Oreilly_01 : HttpServlet() {
    @Throws(ServletException::class, IOException::class)
    protected override fun doGet(req: HttpServletRequest, resp: HttpServletResponse) {
        try {
            bad(req, resp)
        } catch (e: SQLException) {
        }
        try {
            good(req, resp)
        } catch (e: SQLException) {
        }
    }

    @Throws(IOException::class, SQLException::class)
    private fun bad(req: HttpServletRequest, resp: HttpServletResponse) {
        val savePath = "../save"
        val multipartRequest = MultipartRequest(req, savePath, 1000, DefaultFileRenamePolicy())
        val fileName: String = multipartRequest.getFilesystemName("filename")
        val sql = ("INSERT INTO board(email,r_num,w_date,pwd,content,re_step,re_num,filename)"
                + " values ( ?, 0, sysdate(), ?, ?, ?, ?, ? ) ")
        val con: Connection = DriverManager.getConnection(
            String.format(
                "jdbc:derby:%s;password=codemind;bootPassword=%s", "xxx", "password"
            )
        )
        val pstmt: PreparedStatement = con.prepareStatement(sql)
        pstmt.executeUpdate()
        val file: File = multipartRequest.getFile("filename")
    }

    @Throws(IOException::class, SQLException::class)
    private fun good(req: HttpServletRequest, resp: HttpServletResponse) {
        val savePath = "../save"
        val multipartRequest = MultipartRequest(req, savePath, 1000, DefaultFileRenamePolicy())
        val fileName: String = multipartRequest.getFilesystemName("filename")
        if (fileName != null) {
            val fileExt = fileName.substring(fileName.lastIndexOf("") + 1).lowercase(Locale.getDefault())
            if ("gif" != fileExt && "jpg" != fileExt && "png" != fileExt) {
                resp.getWriter().print("<script>alert('업로드 불가능한 파일입니다.')</script>")
                return
            }
        }
        val sql = ("INSERT INTO board(email,r_num,w_date,pwd,content,re_step,re_num,filename)"
                + " values ( ?, 0, sysdate(), ?, ?, ?, ?, ? ) ")
        val con: Connection = DriverManager.getConnection(
            String.format(
                "jdbc:derby:%s;password=codemind;bootPassword=%s", "xxx", "password"
            )
        )
        val pstmt: PreparedStatement = con.prepareStatement(sql)
        pstmt.executeUpdate()
        val file: File = multipartRequest.getFile("filename")
    }
}