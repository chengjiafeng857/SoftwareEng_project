<!-- "Visual Paradigm: DO NOT MODIFY THIS FILE!"

This is an automatic generated file. It will be regenerated every time 
you generate persistence class.

Modifying its content may cause the program not work, or your work may lost.-->

<!-- Licensee: 
License Type: Evaluation-->
<html>
<jsp:useBean id="ProductBean" scope="page" class="ProductProcessor" />
<jsp:setProperty name="ProductBean" property="*" />
<% String result = ProductBean.process(); %>

<script language="javascript">
<!--
function perform(command)  {
		form1.action.value = command;
		form1.submit();
		return true;
	}
function listAll()  {
		window.location.href = 'ProductList.jsp';
		return true;
	}
// -->
</script>
<head><title>Product</title>
</head>
<body>
<h1>Product</h1>
<form method="POST" name="form1" action=Product.jsp>
	<table>
		<tr>
			<td>*ProductId : </td>
			<td><input type=text name="productId" value="<jsp:getProperty name="ProductBean" property="productId"/>" /></td>
		</tr>
		<tr>
			<td>ProductName : </td>
			<td><input type=text name="productName" value="<jsp:getProperty name="ProductBean" property="productName"/>" /></td>
		</tr>
		<tr>
			<td>InterestRate : </td>
			<td><input type=text name="interestRate" value="<jsp:getProperty name="ProductBean" property="interestRate"/>" /></td>
		</tr>
		<tr>
			<td>RiskLevel : </td>
			<td><input type=text name="riskLevel" value="<jsp:getProperty name="ProductBean" property="riskLevel"/>" /></td>
		</tr>
		<tr>
			<td>Exchange_exchangeexchangeId : </td>
			<td><input type=text name="exchange_exchangeexchangeId" value="<jsp:getProperty name="ProductBean" property="exchange_exchangeexchangeId"/>" /></td>
		</tr>
		<tr>
			<td>Order_orderorderId : </td>
			<td><input type=text name="order_orderorderId" value="<jsp:getProperty name="ProductBean" property="order_orderorderId"/>" /></td>
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
