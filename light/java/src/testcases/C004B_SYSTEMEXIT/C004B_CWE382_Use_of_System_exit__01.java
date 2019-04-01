package testcases.C004B_SYSTEMEXIT;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class C004B_CWE382_Use_of_System_exit__01 {
	/*
	by juho
	## Included in the doPost() method defined below is a call to System.exit() in the event of a specific exception.
	*/
	public void doPostBad(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int action;
    //FLAW:
		System.exit(1);
	}
	public void doPostGood(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int action;
		//exception handler
	}
}
