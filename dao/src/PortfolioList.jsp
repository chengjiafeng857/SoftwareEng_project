<!-- "Visual Paradigm: DO NOT MODIFY THIS FILE!"

This is an automatic generated file. It will be regenerated every time 
you generate persistence class.

Modifying its content may cause the program not work, or your work may lost.-->

<!-- Licensee: 
License Type: Evaluation-->
<html>
<head><title>Portfolio List</title>
</head>
<body>
<center>
<h1>Portfolio List</h1>
<table border="1" width="80%">
	<tr>
		<td>PortfolioId(PK)</td>
		<td>TotalInvestment</td>
		<td>TotalEarning</td>
		<td>User(FK)</td>
		<td></td>
	</tr>
<%
Portfolio[] portfolios = PortfolioDAO.listPortfolioByQuery(null, null);
for(int i = 0; i < portfolios.length; i++) {
		out.print("<tr>");
		out.print("<td>");
		out.print(portfolios[i].getORMID());
		out.print("</td>");
		out.print("<td>");
		out.print(portfolios[i].getTotalInvestment());
		out.println("</td>");
		out.print("<td>");
		out.print(portfolios[i].getTotalEarning());
		out.println("</td>");
		
		User user = portfolios[i].getUser();
		if(user != null) {
			out.print("<td>");
			out.print("<a href=\"User.jsp?action=search&userId=");
			out.print(user.getORMID());
			out.print("\">");
			out.print(user.getORMID());
			out.print("</a>");
			out.println("</td>");
		}
		
		else
 {
out.println("<td></td>");
		}
		
		out.print("<td>");
		out.print("<a href=\"Portfolio.jsp?action=search&PortfolioId=");
		out.print(portfolios[i].getORMID());
		out.print("\">");
		out.print("Edit");
		out.print("</a>");
		out.print("</td>");
		out.println("</td>");
		out.println("</tr>");
}

%>
</table><br>
<a href="index.html">Index page</a>
 | 
<a href="Portfolio.jsp">Add Portfolio</a>
</center>
</body>
</html>
