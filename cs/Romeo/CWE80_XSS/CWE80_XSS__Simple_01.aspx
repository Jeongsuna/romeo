<%@ Page Language="C#" AutoEventWireup="true" CodeFile="CWE80_XSS__Simple_01.cs" Inherits="CWE80_XSS__Simple_01" ValidateRequest="false" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
</head>
<body>
    <form id="form1" runat="server">
    <div>
    
        <br />
        Enter ID:
        <asp:Label ID="IdLabel" runat="server" Text=""></asp:Label>
    
        <br />
        <br />
        Enter Name:
        <asp:TextBox ID="NameTextBox" runat="server"></asp:TextBox>
        <br />
        <br />
    
    </div>
    <asp:Button ID="SubmitButton" runat="server" Text="Submit" onclick="SubmitButtonClick" />
    <br />
    <br />
        <asp:Label ID="MsgLabel" runat="server" Text=""></asp:Label>
    
    <br />
    </form>
</body>
</html>
