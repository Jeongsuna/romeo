package testcases.C00AC_IMPROPLOG__CWE117;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class good1 extends HttpServlet {
    private static final Logger logger = LogManager.getLogger();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String val1 = request.getParameter("val1");
        try {
            int value1 = Integer.parseInt(val1);
        } catch (NumberFormatException e) {
            logger.error("Invalid number format for val1", e);
            logger.info("Invalid number format for val1");
            logger.warn("Invalid number format for val1");
            logger.debug("Invalid number format for val1");
            logger.trace("Invalid number format for val1");
        }
    }
}
