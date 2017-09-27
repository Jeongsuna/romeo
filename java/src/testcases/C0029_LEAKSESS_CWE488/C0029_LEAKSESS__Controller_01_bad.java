package testcases.C0029_LEAKSESS_CWE488;

import javax.servlet.http.HttpServletRequest;

@Controller
public class C0029_LEAKSESS__Controller_01_bad {
	private int currentPage = 1;
	public void doSomething(HttpServletRequest request) {
		/* FLAW: */
		currentPage = Integer.parseInt(request.getParameter("page"));
	}
}
