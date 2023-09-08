package testcases.C0005_FILEUPLOAD__CWE434;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.List;

@WebServlet("/fileUpload")
public class
C0005_FILEUPLOAD_Servlet_01 extends HttpServlet {

    private static final long serialVersionUID = 1L;

    protected void good(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String uploadDirectory = "C:/uploads/"; // 업로드 디렉토리 경로
        ServletFileUpload fileUpload = new ServletFileUpload();

        try {
            List<FileItem> items = fileUpload.parseRequest(request);
            for (FileItem item : items) {
                if (!item.isFormField()) { // 파일인 경우
                    String fileName = item.getName();
                    if (  fileName   !=   null) {
                        // 파일 이름에 대한 보안 검증 추가 (예: 허용되는 확장자만 업로드 가능하도록)
                        String fileExtension = fileName.substring(fileName.lastIndexOf(".") + 1).toLowerCase();
                        if (isAllowedExtension(fileExtension)) {
                            File uploadedFile = new File(uploadDirectory + fileName);
                            item.write(uploadedFile);
                        } else {
                            response.getWriter().write("허용되지 않은 파일 형식입니다.");
                            return;
                        }
                    }
                }
            }
            response.getWriter().write("파일 업로드 성공!");
        } catch (Exception e) {
            response.getWriter().write("파일 업로드 실패!");
        }
    }

    protected void bad(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String uploadDirectory = "C:/uploads/"; // 업로드 디렉토리 경로
        ServletFileUpload fileUpload = new ServletFileUpload();

        try {
            List<FileItem> items = fileUpload.parseRequest(request);
            for (FileItem item : items) {
                    String fileName = item.getName();
            }
            response.getWriter().write("파일 업로드 성공!");

        } catch (Exception e) {
            response.getWriter().write("파일 업로드 실패!");
        }

    }

    // 파일 업로드 허용 여부 검사
    private boolean isAllowedExtension(String fileExtension) {
        List<String> allowedExtensions = Arrays.asList("txt", "pdf", "jpg", "png");
        return allowedExtensions.contains(fileExtension);
    }
}