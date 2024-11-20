<!-- "Visual Paradigm: DO NOT MODIFY THIS FILE!"

This is an automatic generated file. It will be regenerated every time 
you generate persistence class.

Modifying its content may cause the program not work, or your work may lost.-->

<!-- Licensee: 
License Type: Evaluation-->
<html>
<head><title>RedeemptionOrder List</title>
</head>
<body>
<center>
<h1>RedeemptionOrder List</h1>
<table border="1" width="80%">
	<tr>
		<td>OrderId(PK)</td>
		<td>RedeemCardNum</td>
		<td>OderDate</td>
		<td>Amount</td>
		<td>OrderState</td>
		<td>Product(FK)</td>
		<td></td>
	</tr>
<%
RedeemptionOrder[] redeemptionOrders = RedeemptionOrderDAO.listRedeemptionOrderByQuery(null, null);
for(int i = 0; i < redeemptionOrders.length; i++) {
		out.print("<tr>");
		out.print("<td>");
		out.print(redeemptionOrders[i].getOrderId());
		out.println("</td>");
		out.print("<td>");
		out.print(redeemptionOrders[i].getRedeemCardNum());
		out.println("</td>");
		out.print("<td>");
		out.print(redeemptionOrders[i].getOderDate());
		out.println("</td>");
		out.print("<td>");
		out.print(redeemptionOrders[i].getAmount());
		out.println("</td>");
		out.print("<td>");
		out.print(redeemptionOrders[i].getOrderState());
		out.println("</td>");
		
		Product product = redeemptionOrders[i].getProduct();
		if(product != null) {
			out.print("<td>");
			out.print("<a href=\"Product.jsp?action=search&productId=");
			out.print(product.getProductId());
			out.print("\">");
			out.print(product);
			out.println("</td>");
		}
		
		else
 {
out.println("<td></td>");
		}
		
		out.print("<td>");
		out.print("<a href=\"RedeemptionOrder.jsp?action=search&orderId=");
		out.print(redeemptionOrders[i].getOrderId());
		out.print("\">");
out.print("Edit");out.println("</a>");		out.println("</td>");
		out.println("</tr>");
}

%>
</table><br>
<a href="index.html">Index page</a>
 | 
<a href="RedeemptionOrder.jsp">Add RedeemptionOrder</a>
</center>
</body>
</html>
