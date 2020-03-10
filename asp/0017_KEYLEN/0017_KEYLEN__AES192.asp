<!DOCTYPE html>
<html>
<body>

<p>Bad Cookie Expire</p>
<%
Function bad()
	Set CM = Server.CreateObject("Persits.CryptoManager")
	Set Context = CM.OpenContext( "", True )
	' flaw: AES192
	Set Key = Context.GenerateKey( calgAES192, 64 )
	Set Blob = Key.EncryptText("some text")
	txtEnc = Blob.Hex
End Function

%> 

<p>Good Cookie Expire</p>
<%
Function good()
	Set CM = Server.CreateObject("Persits.CryptoManager")
	Set Context = CM.OpenContext( "", True )
	' symmetric encryption algorithm - AES192
	Set Key = Context.GenerateKey( calgAES192, 128 )
	Set Blob = Key.EncryptText("some text")
	txtEnc = Blob.Hex
End Function

%> 
</body>
</html>
