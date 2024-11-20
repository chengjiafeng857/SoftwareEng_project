<!-- "Visual Paradigm: DO NOT MODIFY THIS FILE!"

This is an automatic generated file. It will be regenerated every time 
you generate persistence class.

Modifying its content may cause the program not work, or your work may lost.-->

<!-- Licensee: 
License Type: Evaluation-->
<html>
<jsp:useBean id="RedeemptionOrderBean" scope="page" class="RedeemptionOrderProcessor" />
<jsp:setProperty name="RedeemptionOrderBean" property="*" />
<% String result = RedeemptionOrderBean.process(); %>

<script language="javascript">
<!--
function perform(command)  {
		form1.action.value = command;
		form1.submit();
		return true;
	}
function listAll()  {
		window.location.href = 'RedeemptionOrderList.jsp';
		return true;
	}
// -->
</script>
<head><title>RedeemptionOrder</title>
</head>
<body>
<h1>RedeemptionOrder</h1>
<form method="POST" name="form1" action=RedeemptionOrder.jsp>
	<table>
		<tr>
			<td>*OrderId : </td>
			<td><input type=text name="orderId" value="<jsp:getProperty name="RedeemptionOrderBean" property="orderId"/>" /></td>
		</tr>
		<tr>
			<td>RedeemCardNum : </td>
			<td><input type=text name="redeemCardNum" value="<jsp:getProperty name="RedeemptionOrderBean" property="redeemCardNum"/>" /></td>
		</tr>
		<tr>
			<td>OderDate : </td>
			<td><input type=text name="oderDate" value="<jsp:getProperty name="RedeemptionOrderBean" property="oderDate"/>" /></td>
		</tr>
		<tr>
			<td>Amount : </td>
			<td><input type=text name="amount" value="<jsp:getProperty name="RedeemptionOrderBean" property="amount"/>" /></td>
		</tr>
		<tr>
			<td>OrderState : </td>
			<td><input type=text name="orderState" value="<jsp:getProperty name="RedeemptionOrderBean" property="orderState"/>" /></td>
		</tr>
		<tr>
			<td>Product_productproductId : </td>
			<td><input type=text name="product_productproductId" value="<jsp:getProperty name="RedeemptionOrderBean" property="product_productproductId"/>" /></td>
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
