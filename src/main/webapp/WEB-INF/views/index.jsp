<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
	<head>
		<title>World Cop 2014</title>
	</head>		
	<body>
		<h1>World Cup 2014</h1>
		<table>
		<c:forEach items="${groupA}" var="team">
			<tr>		
			<td>${team.name}</td>
			</tr>
		</c:forEach>
		</table>	
		<br />
		<table>
		<c:forEach items="${groupB}" var="team">
			<tr>		
			<td>${team.name}</td>
			</tr>
		</c:forEach>
		</table>	
		<br />
		<table>
		<c:forEach items="${groupC}" var="team">
			<tr>		
			<td>${team.name}</td>
			</tr>
		</c:forEach>
		</table>	
	</body>
</html>
