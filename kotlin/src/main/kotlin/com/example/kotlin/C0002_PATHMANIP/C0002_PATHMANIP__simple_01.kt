package romeo

import testcasesupport.IO
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse
import java.util.logging.Level

class C0002_PATHMANIP__simple_01 {
    fun bad(request: HttpServletRequest, response: HttpServletResponse) {
        var fileName: String = request.getParameter("P")
        if (fileName == null || "".equals(fileName)) fileName = "dummy.txt"
        lateinit var bis: BufferedInputStream = null
        lateinit var bos: BufferedOutputStream = null
        lateinit var fis: FileInputStream = null
        try {
            fileName = fileName.replaceAll("\n", "").replaceAll("\r", "")
            response.setHeader("Content-Disposition", "attachment;filename=$fileName;")
            val buffer = ByteArray(1024)

            // 외부입력값에서 경로순회(directory traversal) 문자열을 제거하지 않고 사용
            /* FLAW : CWE-99, CWE-22 */
            fis = FileInputStream("C:/datas/$fileName")
            bis = BufferedInputStream(fis)
            bos = BufferedOutputStream(response.getOutputStream())
            lateinit var read: Int
            while (bis.read(buffer, 0, 1024).also { read = it } != -1) {
                bos.write(buffer, 0, read)
            }
        } catch (e: FileNotFoundException) {
            IO.logger.log(Level.WARNING, e.toString())
        } catch (e: IOException) {
            IO.logger.log(Level.WARNING, e.toString())
        } finally {
            try {
                if (bos != null) bos.close()
                if (bis != null) bis.close()
                if (fis != null) fis.close()
            } catch (e: IOException) {
                IO.logger.log(Level.WARNING, e.toString())
            }
        }
    }

    fun good(request: HttpServletRequest, response: HttpServletResponse) {
        var fileName: String = request.getParameter("P")
        if (fileName == null || "".equals(fileName)) fileName = "dummy.txt"
        lateinit var bis: BufferedInputStream = null
        lateinit var bos: BufferedOutputStream = null
        lateinit var fis: FileInputStream = null
        try {
            fileName = fileName.replaceAll("\n", "").replaceAll("\r", "")
            response.setHeader("Content-Disposition", "attachment;filename=$fileName;")
            val buffer = ByteArray(1024)

            // 외부입력값에서 경로순회(directory traversal) 문자열을 제거하고 사용
            fileName = fileName.replaceAll("\\.\\.", "").replaceAll("/", "").replaceAll("\\\\", "")
            fis = FileInputStream("C:/datas/$fileName")
            bis = BufferedInputStream(fis)
            bos = BufferedOutputStream(response.getOutputStream())
            lateinit var read: Int
            while (bis.read(buffer, 0, 1024).also { read = it } != -1) {
                bos.write(buffer, 0, read)
            }
        } catch (e: FileNotFoundException) {
            IO.logger.log(Level.WARNING, e.toString())
        } catch (e: IOException) {
            IO.logger.log(Level.WARNING, e.toString())
        } finally {
            try {
                if (bos != null) bos.close()
                if (bis != null) bis.close()
                if (fis != null) fis.close()
            } catch (e: IOException) {
                IO.logger.log(Level.WARNING, e.toString())
            }
        }
    }
}