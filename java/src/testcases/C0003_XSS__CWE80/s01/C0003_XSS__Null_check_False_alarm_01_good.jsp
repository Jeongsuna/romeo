<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>False Alarm</title>
<% 
	String loginType = request.getParameter("loginType");

	if(loginType!=null) {
		loginType = loginType.replaceAll(" <", "<");
	}
%>
</head>

<body onload="initialize();">
	<form id="form" name="form" method="post">
	    <%-- fix --%>
		<input type="hidden" id="loginType" name="loginType" value="<%=loginType%>"/>
	</form>
</body>
</html>