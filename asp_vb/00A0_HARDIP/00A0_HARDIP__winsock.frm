VERSION 5.00

Private Sub bad()
     ' 서버가 닫혀있으면..
    If WinsockChat.State = 0 Then
		' flaw
        WinsockChat.RemoteHost = "192.168.35.25"
        WinsockChat.RemotePort = "8080"
        WinsockChat.Connect
    ' 서버가 열려있으면..
    ElseIf Winsock1.State = 7 Then
        Winsock1.SendData "send"
    End If
End Sub

Private Sub good()
	' 서버가 닫혀있으면..
    If WinsockChat.State = 0 Then
        WinsockChat.RemoteHost = txtIP.Text
        WinsockChat.RemotePort = txtPort.Text
        WinsockChat.Connect
    ' 서버가 열려있으면..
    ElseIf Winsock1.State = 7 Then
        Winsock1.SendData "send"
    End If
     
End Sub
