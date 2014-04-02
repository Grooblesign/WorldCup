<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
	<head>
		<title>World Cop 2014</title>
		<link rel="stylesheet" href="<c:url value="/resources/stylesheet.css" />" type="text/css" />
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
		<br />
		<table>
		<c:forEach items="${groupD}" var="team">
			<tr>		
			<td>${team.name}</td>
			</tr>
		</c:forEach>
		</table>	
		<br />
		<table>
		<c:forEach items="${groupE}" var="team">
			<tr>		
			<td>${team.name}</td>
			</tr>
		</c:forEach>
		</table>	
		<br />
		<table>
		<c:forEach items="${groupF}" var="team">
			<tr>		
			<td>${team.name}</td>
			</tr>
		</c:forEach>
		</table>	
		<br />
		<table>
		<c:forEach items="${groupG}" var="team">
			<tr>		
			<td>${team.name}</td>
			</tr>
		</c:forEach>
		</table>	
		<br />
		<table>
		<c:forEach items="${groupH}" var="team">
			<tr>		
			<td>${team.name}</td>
			</tr>
		</c:forEach>
		</table>	
	</body>
</html>
