
Private Sub bad()
	DIM fruit As String
	fruit = "apple"
	' flaw: use goto
	If fruit = "apple" Then Goto l1 Else goto l2
l1:
	Debug.WriteLine "l1"
	goto l3
l2:	
	Debug.WriteLine "l2"
l3:	
	Debug.WriteLine "l3"
End Sub

Private Sub good1()
	DIM fruit As String
	fruit = "apple"
	If fruit = "apple" Then 
		Debug.WriteLine "l1" 
	Else 
		Debug.WriteLine "l2"
	End If	
	Debug.WriteLine "l3"
End Sub

' In actually not bad
Private Sub good2()
	DIM fruit As String
	fruit = "apple"
	If fruit = "apple" Then 
		On Error Goto LabError
		Debug.WriteLine "l1"
	Else 
		Debug.WriteLine "l2"
	End If	
	Debug.WriteLine "l3"
LabError:	
	Debug.WriteLine "error"
	Resume Next
End Sub
