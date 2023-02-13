package com.example.kotlin.C0005_FILEUPLOAD

import com.oreilly.servlet.MultipartRequest
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy
import net.coobird.thumbnailator.Thumbnails
import testcasesupport.IO
import java.io.IOException
import java.sql.Connection
import java.sql.PreparedStatement
import java.sql.SQLException
import java.util.*
import java.util.logging.Level
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

class C0005_FILEUPLOAD__simple_01 {
    private lateinit var path: String
    private lateinit var path_bak: String
    private var size = 0
    @Throws(IOException::class)
    fun bad(request: HttpServletRequest, response: HttpServletResponse, savePath: String) {
        val sizeLimit = 5 * 1024 * 1024
        val multi = MultipartRequest(request, savePath, sizeLimit.toLong(), "euc-kr", DefaultFileRenamePolicy())
        val stemail = request.getParameter("stemail")
        val stpwd = request.getParameter("stpwd")
        val stcontent = request.getParameter("stcontent")
        val stre_step = request.getParameter("stre_step")
        val stre_num = request.getParameter("stre_num")
        val fileName = multi.getFilesystemName("filename")
        lateinit var con: Connection
        lateinit var pstmt: PreparedStatement
        try {
            con = IO.getDBConnection()
            val sql = (" INSERT INTO board(email,r_num,w_date,pwd,content,re_step,re_num,filename) "
                    + " values ( ?, 0, sysdate(), ?, ?, ?, ?, ? ) ")
            pstmt = con.prepareStatement(sql)
            pstmt.setString(1, stemail)
            pstmt.setString(2, stpwd)
            pstmt.setString(3, stcontent)
            pstmt.setString(4, stre_step)
            pstmt.setString(5, stre_num)
            pstmt.setString(6, fileName)
            pstmt.executeUpdate()
        } catch (e: SQLException) {
            IO.logger.log(Level.WARNING, e.toString())
        } finally {
            try {
                pstmt.close()
                con.close()
            } catch (e: SQLException) {
                IO.logger.log(Level.WARNING, e.toString())
            }
        }

        /* FLAW : CWE-434 */
        Thumbnails.of("'$savePath'/'$fileName'").size(150,150).toFile("'$savePath'/s_'$fileName'")
    }

    @Throws(IOException::class)
    fun good(request: HttpServletRequest, response: HttpServletResponse, savePath: String) {
        val sizeLimit = 5 * 1024 * 1024
        val multi = MultipartRequest(request, savePath, sizeLimit.toLong(), "euc-kr", DefaultFileRenamePolicy())
        val stemail = request.getParameter("stemail")
        val stpwd = request.getParameter("stpwd")
        val stcontent = request.getParameter("stcontent")
        val stre_step = request.getParameter("stre_step")
        val stre_num = request.getParameter("stre_num")
        val fileName = multi.getFilesystemName("filename")
        lateinit var con: Connection
        lateinit var pstmt: PreparedStatement
        if (fileName != null) {
            val fileExt = fileName.substring(fileName.lastIndexOf(".") + 1).lowercase(Locale.getDefault())
            if ("gif" != fileExt && "jpg" != fileExt && "png" != fileExt) {
                alertMessage(response, "업로드 불가능한 파일입니다.")
                return
            }
        }
        try {
            con = IO.getDBConnection()
            val sql = (" INSERT INTO board(email,r_num,w_date,pwd,content,re_step,re_num,file-name) "
                    + " values ( ?, 0, sysdate(), ?, ?, ?, ?, ? ) ")
            pstmt = con.prepareStatement(sql)
            pstmt.setString(1, stemail)
            pstmt.setString(2, stpwd)
            pstmt.setString(3, stcontent)
            pstmt.setString(4, stre_step)
            pstmt.setString(5, stre_num)
            pstmt.setString(6, fileName)
            pstmt.executeUpdate()
        } catch (e: SQLException) {
            IO.logger.log(Level.WARNING, e.toString())
        } finally {
            try {
                pstmt.close()
                con.close()
            } catch (e: SQLException) {
                IO.logger.log(Level.WARNING, e.toString())
            }
        }
        Thumbnails.of("'$savePath'/'$fileName'").size(150,150).toFile("'$savePath'/s_'$fileName'")
    }

    @Throws(IOException::class)
    private fun alertMessage(response: HttpServletResponse, s: String) {
        val o = response.writer
        o.println("<script>alert('$s');</script>")
    }
}