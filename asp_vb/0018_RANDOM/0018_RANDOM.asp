<!DOCTYPE html>
<html>
<body>

<p>Bad statistical PRNG</p>
<%
Function bad()
	dim num
	num = Rnd()
	bad = "http://site.com/page" & num
End Function

%> 

<p>Good cryptographic PRNG</p>
<%
Function good()
	dim cryptPRNG
	set cryptPRNG = Server.CreateObject("CryptoPRNG")
	dim num
	num = cryptPRNG.Rnd()
	good = "http://site.com/page" & num
End Function

%> 
</body>
</html>
