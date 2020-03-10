<!DOCTYPE html>
<html>
<body>

<p>Bad Cookie Expire</p>
<%
Function bad()
	Set CM = Server.CreateObject("Persits.CryptoManager")
	Set Context = CM.OpenContext( "", True )
	' md4, rc2
	Set Key = Context.GenerateKeyFromPassword( "mypassword", calgMD4, calgRC2 )
	Set Blob = Key.EncryptText("some text")
	txtEnc = Blob.Hex
End Function

%> 

<p>Good Cookie Expire</p>
<%
Function good()
	Set CM = Server.CreateObject("Persits.CryptoManager")
	Set Context = CM.OpenContext( "", True )
	' sha256, 3des
	Set Key = Context.GenerateKeyFromPassword( "mypassword", calgSHA256, calg3DES2 )
	Set Blob = Key.EncryptText("some text")
	txtEnc = Blob.Hex
End Function

%> 
</body>
</html>
