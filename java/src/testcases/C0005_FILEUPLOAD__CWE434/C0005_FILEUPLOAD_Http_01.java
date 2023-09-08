package testcases.C0005_FILEUPLOAD__CWE434;



import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@WebServlet("/fileUpload")
public class
C0005_FILEUPLOAD_Http_01 extends HttpServlet {

    private static final long serialVersionUID = 1L;

    protected void good(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            Part filePart = request.getPart("file");
            String fileName = getFileName(filePart);

            // 유효성 검사: 파일이 비어있는지 확인
            if (filePart.getSize() == 0) {
                response.getWriter().println("파일이 비어 있습니다.");
                return;
            }

            // 유효성 검사: 허용된 파일 유형만 업로드 가능하도록 확인
            String contentType = filePart.getContentType();
            if (!contentType.equals("image/jpeg") && !contentType.equals("image/png")) {
                response.getWriter().println("올바른 이미지 파일 형식이 아닙니다.");
                return;
            }

            // 파일 저장 처리 등 추가 로직 수행

            response.getWriter().println("파일 업로드가 성공적으로 완료되었습니다.");
        } catch (Exception ex) {
            response.getWriter().println("파일 업로드에 실패했습니다: " + ex.getMessage());
        }
    }

    private String getFileName(Part part) {
        for (String content : part.getHeader("content-disposition").split(";")) {
            if (content.trim().startsWith("filename")) {
                return content.substring(content.indexOf('=') + 1).trim().replace("\"", "");
            }
        }
        return null;
    }

    protected void bad(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            Part filePart2 = request.getPart("file");
            String fileName2 = getFileName(filePart2);

            // 나쁜 예제: 파일 확장자를 검사하지 않음
            // 나쁜 예제: 파일 크기를 검사하지 않음

            // 파일 저장 처리 등 추가 로직 수행

            response.getWriter().println("파일 업로드가 성공적으로 완료되었습니다.");
        } catch (Exception ex) {
            response.getWriter().println("파일 업로드에 실패했습니다: " + ex.getMessage());
        }
    }

    private String getFileName2(Part part) {
        for (String content : part.getHeader("content-disposition").split(";")) {
            if (content.trim().startsWith("filename")) {
                return content.substring(content.indexOf('=') + 1).trim().replace("\"", "");
            }
        }
        return null;

    }

    // 파일 업로드 허용 여부 검사
    private boolean isAllowedExtension(String fileExtension) {
        List<String> allowedExtensions = Arrays.asList("txt", "pdf", "jpg", "png");
        return allowedExtensions.contains(fileExtension);
    }
}