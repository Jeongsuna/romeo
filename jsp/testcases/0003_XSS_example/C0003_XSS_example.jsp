<%--
  Class Name : example.jsp
--%>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ page import="ut.Common"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>메리츠화재_오탐_예제샘플1</title>
<%
	String uri = request.getRequestURI();
%>
</head>

<body onload="init();">
	<form id="form" name="form" method="post">
		<input type="hidden" id="uri" name="uri" value="<%=uri%>"/> <!-- FLAW -->
	</form>
</body>
</html>