<!-- "Visual Paradigm: DO NOT MODIFY THIS FILE!"

This is an automatic generated file. It will be regenerated every time 
you generate persistence class.

Modifying its content may cause the program not work, or your work may lost.-->

<!-- Licensee: 
License Type: Evaluation-->
<html>
<head><title>User List</title>
</head>
<body>
<center>
<h1>User List</h1>
<table border="1" width="80%">
	<tr>
		<td>UserId(PK)</td>
		<td>Name</td>
		<td>BirthDate</td>
		<td>Risklevel</td>
		<td>Portfolio(FK)</td>
		<td></td>
	</tr>
<%
User[] users = UserDAO.listUserByQuery(null, null);
for(int i = 0; i < users.length; i++) {
		out.print("<tr>");
		out.print("<td>");
		out.print(users[i].getORMID());
		out.print("</td>");
		out.print("<td>");
		out.print(users[i].getName());
		out.println("</td>");
		out.print("<td>");
		out.print(users[i].getBirthDate());
		out.println("</td>");
		out.print("<td>");
		out.print(users[i].getRisklevel());
		out.println("</td>");
		
		Portfolio portfolio = users[i].getPortfolio();
		if(portfolio != null) {
			out.print("<td>");
			out.print("<a href=\"Portfolio.jsp?action=search&PortfolioId=");
			out.print(portfolio.getORMID());
			out.print("\">");
			out.print(portfolio.getORMID());
			out.print("</a>");
			out.println("</td>");
		}
		
		else
 {
out.println("<td></td>");
		}
		
		out.print("<td>");
		out.print("<a href=\"User.jsp?action=search&userId=");
		out.print(users[i].getORMID());
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
<a href="User.jsp">Add User</a>
</center>
</body>
</html>
