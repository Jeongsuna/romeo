<!DOCTYPE html>
<html>
<body>

<p>Bad hardcoded password </p>
<%

Function bad_ms_sql()
	Set Conn = Server.CreateObject("ADODB.Connection")
	Conn.open "DSN=MyDSN;UID=user;PWD=password;DATABASE=mydatabase"
end function

Function bad_ole_db()
	Set Conn = Server.CreateObject("ADODB.Connection")
	Conn.cursorlocation=adUseClient   
	DSNTest="Provider=MSDAORA.1;Password=pass;User ID=name;Data Source=data.world"
	Conn.open DSNtest
end function	
%> 

<p>Good</p>
<%
Function good(pwd)
	Set Conn = Server.CreateObject("ADODB.Connection")
	Conn.open "DSN=MyDSN;UID=user;PWD=" & pwd &";DATABASE=mydatabase"
end function	
%> 
</body>
</html>
