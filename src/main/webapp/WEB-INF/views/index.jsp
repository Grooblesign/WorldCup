<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Brazil 2014</title>
<link rel="stylesheet"
	href="<c:url value="/resources/style/stylesheet.css" />"
	type="text/css" />
</head>
<body>
	<h1>Brazil 2014</h1>

	<table width="40%">
		<thead>
			<tr>
				<td>Name</td>
				<td>E</td>
				<td>R</td>
				<td>B</td>
				<td>Pts</td>
			</tr>
		</thead>
		<c:forEach items="${people}" var="person">
			<tr>
				<td>${person.name}</td>
				<td>${person.exact}</td>
				<td>${person.result}</td>
				<td>${person.bonus}</td>
				<td>${person.points}</td>
			</tr>
		</c:forEach>
	</table>
	<br />
	<a href="matches">Match predictions</a>
</body>
</html>