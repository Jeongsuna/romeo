<!DOCTYPE html>
<html>
<body>

<p>Bad hardcoded password </p>
<%
Function bad()
	set obj= CreateObject("System.Security.Cryptography.RijndaelManaged")
	set utf8 = CreateObject("System.Text.UTF8Encoding")
	ekey = "29v0anorn2-h9daf"
	eiv = "29v0anorn2-h9daf"
	obj.BlockSize = 128
	' flaw: use hardcoded key
	obj.Key = utf8.GetBytes_4(ekey)
end function
%> 

<p>Good</p>
<%
Function good(str)
	set obj= CreateObject("System.Security.Cryptography.RijndaelManaged")
	set utf8 = CreateObject("System.Text.UTF8Encoding")
	ekey = str
	eiv = "29v0anorn2-h9daf"
	obj.BlockSize = 128
	' flaw: use hardcoded key
	obj.Key = utf8.GetBytes_4(ekey)
end function	
%> 
</body>
</html>
