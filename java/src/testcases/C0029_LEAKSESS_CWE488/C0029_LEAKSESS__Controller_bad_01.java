package testcases.C0029_LEAKSESS_CWE488;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;

@Controller
public class C0029_LEAKSESS__Controller_bad_01 {
	private int currentPage = 1;
	public void doSomething(HttpServletRequest request) {
		/* FLAW: */
		currentPage = Integer.parseInt(request.getParameter("page"));
	}
}
