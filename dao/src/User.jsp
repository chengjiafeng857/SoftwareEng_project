<!-- "Visual Paradigm: DO NOT MODIFY THIS FILE!"

This is an automatic generated file. It will be regenerated every time 
you generate persistence class.

Modifying its content may cause the program not work, or your work may lost.-->

<!-- Licensee: 
License Type: Evaluation-->
<html>
<jsp:useBean id="UserBean" scope="page" class="UserProcessor" />
<jsp:setProperty name="UserBean" property="*" />
<% String result = UserBean.process(); %>

<script language="javascript">
<!--
function perform(command)  {
		form1.action.value = command;
		form1.submit();
		return true;
	}
function listAll()  {
		window.location.href = 'UserList.jsp';
		return true;
	}
// -->
</script>
<head><title>User</title>
</head>
<body>
<h1>User</h1>
<form method="POST" name="form1" action=User.jsp>
	<table>
		<tr>
			<td>*UserId : </td>
			<td><input type=text name="userId" value="<jsp:getProperty name="UserBean" property="userId"/>" /></td>
		</tr>
		<tr>
			<td>Name : </td>
			<td><input type=text name="name" value="<jsp:getProperty name="UserBean" property="name"/>" /></td>
		</tr>
		<tr>
			<td>BirthDate : </td>
			<td><input type=text name="birthDate" value="<jsp:getProperty name="UserBean" property="birthDate"/>" /></td>
		</tr>
		<tr>
			<td>Risklevel : </td>
			<td><input type=text name="risklevel" value="<jsp:getProperty name="UserBean" property="risklevel"/>" /></td>
		</tr>
		<tr>
			<td>Portfolio_portfolioPortfolioId : </td>
			<td><input type=text name="portfolio_portfolioPortfolioId" value="<jsp:getProperty name="UserBean" property="portfolio_portfolioPortfolioId"/>" /></td>
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
