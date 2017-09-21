import javax.servlet.http.*;

public class CWE80_XSS__Safe_01 {
	public static void v(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String p = request.getParameter("n");
		// good
		Integer i = Integer.parseInt(p);
		response.getWriter().println("<br>bad(): data = " + i);
	}
}