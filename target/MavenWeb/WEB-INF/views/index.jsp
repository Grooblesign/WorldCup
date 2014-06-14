<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
	<head>
		<title>World Cop 2014</title>
		<link rel="stylesheet" href="<c:url value="/resources/style/stylesheet.css" />" type="text/css" />
	</head>		
	<body>
		<h1>World Cup 2014</h1>
		<div id="container">
		<table width="30%">
		<thead>
			<tr>
			<td>Group A</td>
			</tr>
		</thead>
		<c:forEach items="${groupA}" var="team">
			<tr>		
			<td>${team.name}</td>
			</tr>
		</c:forEach>
		</table>	
		<br />
		<table width="30%">
		<thead>
			<tr>
			<td>Group B</td>
			</tr>
		</thead>
		<c:forEach items="${groupB}" var="team">
			<tr>		
			<td>${team.name}</td>
			</tr>
		</c:forEach>
		</table>	
		<br />
		<table width="30%">
		<thead>
			<tr>
			<td>Group C</td>
			</tr>
		</thead>
		<c:forEach items="${groupC}" var="team">
			<tr>		
			<td>${team.name}</td>
			</tr>
		</c:forEach>
		</table>	
		<br />
		<table width="30%">
		<thead>
			<tr>
			<td>Group D</td>
			</tr>
		</thead>
		<c:forEach items="${groupD}" var="team">
			<tr>		
			<td>${team.name}</td>
			</tr>
		</c:forEach>
		</table>	
		<br />
		<table width="30%">
		<thead>
			<tr>
			<td>Group E</td>
			</tr>
		</thead>
		<c:forEach items="${groupE}" var="team">
			<tr>		
			<td>${team.name}</td>
			</tr>
		</c:forEach>
		</table>	
		<br />
		<table width="30%">
		<thead>
			<tr>
			<td>Group F</td>
			</tr>
		</thead>
		<c:forEach items="${groupF}" var="team">
			<tr>		
			<td>${team.name}</td>
			</tr>
		</c:forEach>
		</table>	
		<br />
		<table width="30%">
		<thead>
			<tr>
			<td>Group G</td>
			</tr>
		</thead>
		<c:forEach items="${groupG}" var="team">
			<tr>		
			<td>${team.name}</td>
			</tr>
		</c:forEach>
		</table>	
		<br />
		<table width="30%">
		<thead>
			<tr>
			<td>Group H</td>
			</tr>
		</thead>
		<c:forEach items="${groupH}" var="team">
			<tr>		
			<td>${team.name}</td>
			</tr>
		</c:forEach>
		</table>	
		</div>
	</body>
</html>
