package testcases.C0029_LEAKSESS_CWE488;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;

@Controller
public class C0029_LEAKSESS__Controller_01_good {
	public void doSomething(HttpServletRequest request) {
		int currentPage = Integer.parseInt(request.getParameter("page"));
	}
}
