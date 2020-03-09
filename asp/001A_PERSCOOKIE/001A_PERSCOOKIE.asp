<!DOCTYPE html>
<html>
<body>

<p>Bad Cookie Expire</p>
<%
Function bad()
	Response.Cookies("myname").Expires=now() + 30
	Response.Cookies("myname").Expires=dateadd("d", 30, now())
End Function

%> 

<p>Good Cookie Expire</p>
<%
Function good()
	' 7일 이하
	Response.Cookies("myname").Expires=now() + 1
	Response.Cookies("myname").Expires=dateadd("d", 1, now())
End Function



%> 
</body>
</html>
