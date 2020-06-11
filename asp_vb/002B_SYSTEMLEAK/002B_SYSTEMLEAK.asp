<!DOCTYPE html>
<html>
<body>

<p>Bad system leak </p>
<%

Function bad_server_err()
	Response.Write "오류번호: " & Server.GetLastError() & "<BR>"
end function

Function bad_err()
	If Err.number <>0 then
      Response.Write "오류번호: " & Err.number & "설명: " & Err.Description & "<BR>"
	End If
end function	
%> 

<p>Good</p>
<%
%> 
</body>
</html>
