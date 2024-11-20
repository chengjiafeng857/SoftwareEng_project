<!-- "Visual Paradigm: DO NOT MODIFY THIS FILE!"

This is an automatic generated file. It will be regenerated every time 
you generate persistence class.

Modifying its content may cause the program not work, or your work may lost.-->

<!-- Licensee: 
License Type: Evaluation-->
<html>
<head><title>Product List</title>
</head>
<body>
<center>
<h1>Product List</h1>
<table border="1" width="80%">
	<tr>
		<td>ProductId(PK)</td>
		<td>ProductName</td>
		<td>InterestRate</td>
		<td>RiskLevel</td>
		<td>Exchange(FK)</td>
		<td>Order(FK)</td>
		<td></td>
	</tr>
<%
Product[] products = ProductDAO.listProductByQuery(null, null);
for(int i = 0; i < products.length; i++) {
		out.print("<tr>");
		out.print("<td>");
		out.print(products[i].getProductId());
		out.println("</td>");
		out.print("<td>");
		out.print(products[i].getProductName());
		out.println("</td>");
		out.print("<td>");
		out.print(products[i].getInterestRate());
		out.println("</td>");
		out.print("<td>");
		out.print(products[i].getRiskLevel());
		out.println("</td>");
		
		Exchange exchange = products[i].getExchange();
		if(exchange != null) {
			out.print("<td>");
			out.print("<a href=\"Exchange.jsp?action=search&exchangeId=");
			out.print(exchange.getExchangeId());
			out.print("\">");
			out.print(exchange);
			out.println("</td>");
		}
		
		else
 {
out.println("<td></td>");
		}
		
		
		Order order = products[i].getOrder();
		if(order != null) {
			out.print("<td>");
			out.print("<a href=\"Order.jsp?action=search&orderId=");
			out.print(order.getOrderId());
			out.print("\">");
			out.print(order);
			out.println("</td>");
		}
		
		else
 {
out.println("<td></td>");
		}
		
		out.print("<td>");
		out.print("<a href=\"Product.jsp?action=search&productId=");
		out.print(products[i].getProductId());
		out.print("\">");
out.print("Edit");out.println("</a>");		out.println("</td>");
		out.println("</tr>");
}

%>
</table><br>
<a href="index.html">Index page</a>
 | 
<a href="Product.jsp">Add Product</a>
</center>
</body>
</html>
