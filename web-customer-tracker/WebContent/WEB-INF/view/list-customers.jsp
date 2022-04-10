<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>

<head>
<title>
List Customers
</title>

<body>
List Customers - coming soon ...

<div id="wrapper">
	<div id="header">
		<h2> CRM -Customer Relationship Management</h2>
	</div>
</div>

<div id="container">
	<div id="content">
		<table> 
			<tr>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Email Adress</th>
			</tr>
		
		<c:forEach var="tempCust" items="${customers}">
		<tr>
			<td>${tempCust.firstName }</td>
			<td>${tempCust.lastName }</td>
			<td>${tempCust.email }</td>
			</tr>
		</c:forEach>
		
		
		
		
		
		</table>
	</div>
</div>

</body>


</head>
</html>