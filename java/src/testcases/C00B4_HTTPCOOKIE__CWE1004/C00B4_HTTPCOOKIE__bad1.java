package testcases.C00B4_HTTPCOOKIE__CWE1004;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class SessionServlet extends HttpServlet {

  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    // 세션 생성 또는 가져오기
    HttpSession session = request.getSession(true);

    // 세션에 값을 설정합니다.
    String sessionId = session.getId();
    session.setAttribute("SessionID", sessionId);

    // 쿠키에 세션 값을 저장합니다.
    Cookie sessionCookie = new Cookie("JSESSIONID", sessionId);

    // 쿠키 유효시간 설정 (예: 1시간)
    sessionCookie.setMaxAge(60 * 60);

    // 응답 헤더에 쿠키 추가
    response.addCookie(sessionCookie);

    // 확인 메세지 출력
    response.setContentType("text/html");
    java.io.PrintWriter out = response.getWriter();
    out.println("<html><head>");
    out.println("<title>Session Management</title></head><body>");
    out.println("<h1>Session ID : " + sessionId + " has been created and stored in cookie.</h1>");
    out.println("</body></html>");

  }

  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    doGet(request, response);
  }
}
