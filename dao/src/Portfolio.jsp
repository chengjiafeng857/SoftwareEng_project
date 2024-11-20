<!-- "Visual Paradigm: DO NOT MODIFY THIS FILE!"

This is an automatic generated file. It will be regenerated every time 
you generate persistence class.

Modifying its content may cause the program not work, or your work may lost.-->

<!-- Licensee: 
License Type: Evaluation-->
<html>
<jsp:useBean id="PortfolioBean" scope="page" class="PortfolioProcessor" />
<jsp:setProperty name="PortfolioBean" property="*" />
<% String result = PortfolioBean.process(); %>

<script language="javascript">
<!--
function perform(command)  {
		form1.action.value = command;
		form1.submit();
		return true;
	}
function listAll()  {
		window.location.href = 'PortfolioList.jsp';
		return true;
	}
// -->
</script>
<head><title>Portfolio</title>
</head>
<body>
<h1>Portfolio</h1>
<form method="POST" name="form1" action=Portfolio.jsp>
	<table>
		<tr>
			<td>*PortfolioId : </td>
			<td><input type=text name="PortfolioId" value="<jsp:getProperty name="PortfolioBean" property="portfolioId"/>" /></td>
		</tr>
		<tr>
			<td>TotalInvestment : </td>
			<td><input type=text name="totalInvestment" value="<jsp:getProperty name="PortfolioBean" property="totalInvestment"/>" /></td>
		</tr>
		<tr>
			<td>TotalEarning : </td>
			<td><input type=text name="totalEarning" value="<jsp:getProperty name="PortfolioBean" property="totalEarning"/>" /></td>
		</tr>
		<tr>
			<td>User_useruserId : </td>
			<td><input type=text name="user_useruserId" value="<jsp:getProperty name="PortfolioBean" property="user_useruserId"/>" /></td>
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
