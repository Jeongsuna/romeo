<!DOCTYPE html>
<html>
<body>

<p>Bad Cookie Expire</p>
<%
Function bad()
	Set CM = Server.CreateObject("Persits.CryptoManager")
	Set Context = CM.OpenContext( "", True )
	' flaw: AES256
	Set Key = Context.GenerateKey( calgAES256, 64 )
	Set Blob = Key.EncryptText("some text")
	txtEnc = Blob.Hex
End Function

%> 

<p>Good Cookie Expire</p>
<%
Function good()
	Set CM = Server.CreateObject("Persits.CryptoManager")
	Set Context = CM.OpenContext( "", True )
	' symmetric encryption algorithm - AES256
	Set Key = Context.GenerateKey( calgAES256, 128 )
	Set Blob = Key.EncryptText("some text")
	txtEnc = Blob.Hex
End Function

%> 
</body>
</html>
