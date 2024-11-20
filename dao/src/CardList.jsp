<!-- "Visual Paradigm: DO NOT MODIFY THIS FILE!"

This is an automatic generated file. It will be regenerated every time 
you generate persistence class.

Modifying its content may cause the program not work, or your work may lost.-->

<!-- Licensee: 
License Type: Evaluation-->
<html>
<head><title>Card List</title>
</head>
<body>
<center>
<h1>Card List</h1>
<table border="1" width="80%">
	<tr>
		<td>CardNum(PK)</td>
		<td>BankName</td>
		<td></td>
	</tr>
<%
Card[] cards = CardDAO.listCardByQuery(null, null);
for(int i = 0; i < cards.length; i++) {
		out.print("<tr>");
		out.print("<td>");
		out.print(cards[i].getCardNum());
		out.println("</td>");
		out.print("<td>");
		out.print(cards[i].getBankName());
		out.println("</td>");
		out.print("<td>");
		out.print("<a href=\"Card.jsp?action=search&cardNum=");
		out.print(cards[i].getCardNum());
		out.print("\">");
out.print("Edit");out.println("</a>");		out.println("</td>");
		out.println("</tr>");
}

%>
</table><br>
<a href="index.html">Index page</a>
 | 
<a href="Card.jsp">Add Card</a>
</center>
</body>
</html>
