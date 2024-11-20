<!-- "Visual Paradigm: DO NOT MODIFY THIS FILE!"

This is an automatic generated file. It will be regenerated every time 
you generate persistence class.

Modifying its content may cause the program not work, or your work may lost.-->

<!-- Licensee: 
License Type: Evaluation-->
<html>
<jsp:useBean id="CardBean" scope="page" class="CardProcessor" />
<jsp:setProperty name="CardBean" property="*" />
<% String result = CardBean.process(); %>

<script language="javascript">
<!--
function perform(command)  {
		form1.action.value = command;
		form1.submit();
		return true;
	}
function listAll()  {
		window.location.href = 'CardList.jsp';
		return true;
	}
// -->
</script>
<head><title>Card</title>
</head>
<body>
<h1>Card</h1>
<form method="POST" name="form1" action=Card.jsp>
	<table>
		<tr>
			<td>*CardNum : </td>
			<td><input type=text name="cardNum" value="<jsp:getProperty name="CardBean" property="cardNum"/>" /></td>
		</tr>
		<tr>
			<td>BankName : </td>
			<td><input type=text name="bankName" value="<jsp:getProperty name="CardBean" property="bankName"/>" /></td>
		</tr>
	</table>
	<INPUT type="hidden" name="action" value="">
	<hr>
	<INPUT type="button" value="List All" onclick="return listAll();">
	<INPUT type="button" value="Search" onclick="return perform('search');">
	<INPUT type="button" value="Insert" onclick="return perform('insert');">
	<INPUT type="button" value="Update" onclick="return perform('update');">
	<INPUT type="button" value="Delete" onclick="return perform('delete');">
	<INPUT type="reset">
</form>
<hr>
<h3><b>Result :</b><%=result%></h3>
</body>
</html>
