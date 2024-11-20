<!-- "Visual Paradigm: DO NOT MODIFY THIS FILE!"

This is an automatic generated file. It will be regenerated every time 
you generate persistence class.

Modifying its content may cause the program not work, or your work may lost.-->

<!-- Licensee: 
License Type: Evaluation-->
<html>
<head><title>Exchange List</title>
</head>
<body>
<center>
<h1>Exchange List</h1>
<table border="1" width="80%">
	<tr>
		<td>ExchangeId(PK)</td>
		<td>ExchangeName</td>
		<td></td>
	</tr>
<%
Exchange[] exchanges = ExchangeDAO.listExchangeByQuery(null, null);
for(int i = 0; i < exchanges.length; i++) {
		out.print("<tr>");
		out.print("<td>");
		out.print(exchanges[i].getExchangeId());
		out.println("</td>");
		out.print("<td>");
		out.print(exchanges[i].getExchangeName());
		out.println("</td>");
		out.print("<td>");
		out.print("<a href=\"Exchange.jsp?action=search&exchangeId=");
		out.print(exchanges[i].getExchangeId());
		out.print("\">");
out.print("Edit");out.println("</a>");		out.println("</td>");
		out.println("</tr>");
}

%>
</table><br>
<a href="index.html">Index page</a>
 | 
<a href="Exchange.jsp">Add Exchange</a>
</center>
</body>
</html>
