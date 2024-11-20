<!-- "Visual Paradigm: DO NOT MODIFY THIS FILE!"

This is an automatic generated file. It will be regenerated every time 
you generate persistence class.

Modifying its content may cause the program not work, or your work may lost.-->

<!-- Licensee: 
License Type: Evaluation-->
<html>
<head><title>Order List</title>
</head>
<body>
<center>
<h1>Order List</h1>
<table border="1" width="80%">
	<tr>
		<td>OrderId(PK)</td>
		<td>OderDate</td>
		<td>Amount</td>
		<td>OrderState</td>
		<td>Product(FK)</td>
		<td></td>
	</tr>
<%
Order[] orders = OrderDAO.listOrderByQuery(null, null);
for(int i = 0; i < orders.length; i++) {
		out.print("<tr>");
		out.print("<td>");
		out.print(orders[i].getOrderId());
		out.println("</td>");
		out.print("<td>");
		out.print(orders[i].getOderDate());
		out.println("</td>");
		out.print("<td>");
		out.print(orders[i].getAmount());
		out.println("</td>");
		out.print("<td>");
		out.print(orders[i].getOrderState());
		out.println("</td>");
		
		Product product = orders[i].getProduct();
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
		out.print("<a href=\"Order.jsp?action=search&orderId=");
		out.print(orders[i].getOrderId());
		out.print("\">");
out.print("Edit");out.println("</a>");		out.println("</td>");
		out.println("</tr>");
}

%>
</table><br>
<a href="index.html">Index page</a>
 | 
<a href="Order.jsp">Add Order</a>
</center>
</body>
</html>
