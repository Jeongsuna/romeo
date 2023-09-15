package testcases.C00AC_IMPROPLOG__CWE117;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.logging.Logger;

public class good4 extends HttpServlet {
    private static final Logger logger = Logger.getLogger(YourServletClass.class.getName());

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String val1 = request.getParameter("val1");
        try {
            int value1 = Integer.parseInt(val1);
        } catch (NumberFormatException e) {
            logger.severe("Invalid number format for val1");
            logger.info("Invalid number format for val1");
            logger.warning("Invalid number format for val1");
            logger.fine("Invalid number format for val1");
        }
    }
}
