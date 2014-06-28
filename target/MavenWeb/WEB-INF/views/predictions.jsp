<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Predictions</title>
<link rel="stylesheet"
	href="<c:url value="/resources/style/stylesheet.css" />"
	type="text/css" />
</head>
<body>
	<h1>${name}'s Predictions</h1>

	<div id="container">
		<h2>Group A</h2>
		<table width="30%">
			<thead>
				<tr>
					<td></td>
					<td>W</td>
					<td>D</td>
					<td>L</td>
					<td>GF</td>
					<td>GA</td>
					<td>Pts</td>
				</tr>
			</thead>
			<c:forEach items="${groupA}" var="team">
				<tr>
					<td>${team.name}</td>
					<td>${team.won}</td>
					<td>${team.drawn}</td>
					<td>${team.lost}</td>
					<td>${team.goalsFor}</td>
					<td>${team.goalsAgainst}</td>
					<td>${team.points}</td>
				</tr>
			</c:forEach>
		</table>
		<br />
		<h2>Group B</h2>
		<table width="30%">
			<thead>
				<tr>
					<td></td>
					<td>W</td>
					<td>D</td>
					<td>L</td>
					<td>GF</td>
					<td>GA</td>
					<td>Pts</td>
				</tr>
			</thead>
			<c:forEach items="${groupB}" var="team">
				<tr>
					<td>${team.name}</td>
					<td>${team.won}</td>
					<td>${team.drawn}</td>
					<td>${team.lost}</td>
					<td>${team.goalsFor}</td>
					<td>${team.goalsAgainst}</td>
					<td>${team.points}</td>
				</tr>
			</c:forEach>
		</table>
		<br />
		
		<h2>Group C</h2>
		<table width="30%">
			<thead>
				<tr>
					<td></td>
					<td>W</td>
					<td>D</td>
					<td>L</td>
					<td>GF</td>
					<td>GA</td>
					<td>Pts</td>
				</tr>
			</thead>
			<c:forEach items="${groupC}" var="team">
				<tr>
					<td>${team.name}</td>
					<td>${team.won}</td>
					<td>${team.drawn}</td>
					<td>${team.lost}</td>
					<td>${team.goalsFor}</td>
					<td>${team.goalsAgainst}</td>
					<td>${team.points}</td>
				</tr>
			</c:forEach>
		</table>
		<br />
		
		<h2>Group D</h2>
		<table width="30%">
			<thead>
				<tr>
					<td></td>
					<td>W</td>
					<td>D</td>
					<td>L</td>
					<td>GF</td>
					<td>GA</td>
					<td>Pts</td>
				</tr>
			</thead>
			<c:forEach items="${groupD}" var="team">
				<tr>
					<td>${team.name}</td>
					<td>${team.won}</td>
					<td>${team.drawn}</td>
					<td>${team.lost}</td>
					<td>${team.goalsFor}</td>
					<td>${team.goalsAgainst}</td>
					<td>${team.points}</td>
				</tr>
			</c:forEach>
		</table>
		
		<h2>Group E</h2>
		<table width="30%">
			<thead>
				<tr>
					<td></td>
					<td>W</td>
					<td>D</td>
					<td>L</td>
					<td>GF</td>
					<td>GA</td>
					<td>Pts</td>
				</tr>
			</thead>
			<c:forEach items="${groupE}" var="team">
				<tr>
					<td>${team.name}</td>
					<td>${team.won}</td>
					<td>${team.drawn}</td>
					<td>${team.lost}</td>
					<td>${team.goalsFor}</td>
					<td>${team.goalsAgainst}</td>
					<td>${team.points}</td>
				</tr>
			</c:forEach>
		</table>		
		<br />
		
		<h2>Group F</h2>
		<table width="30%">
			<thead>
				<tr>
					<td></td>
					<td>W</td>
					<td>D</td>
					<td>L</td>
					<td>GF</td>
					<td>GA</td>
					<td>Pts</td>
				</tr>
			</thead>
			<c:forEach items="${groupF}" var="team">
				<tr>
					<td>${team.name}</td>
					<td>${team.won}</td>
					<td>${team.drawn}</td>
					<td>${team.lost}</td>
					<td>${team.goalsFor}</td>
					<td>${team.goalsAgainst}</td>
					<td>${team.points}</td>
				</tr>
			</c:forEach>
		</table>	
		
		<h2>Group G</h2>
		<table width="30%">
			<thead>
				<tr>
					<td></td>
					<td>W</td>
					<td>D</td>
					<td>L</td>
					<td>GF</td>
					<td>GA</td>
					<td>Pts</td>
				</tr>
			</thead>
			<c:forEach items="${groupG}" var="team">
				<tr>
					<td>${team.name}</td>
					<td>${team.won}</td>
					<td>${team.drawn}</td>
					<td>${team.lost}</td>
					<td>${team.goalsFor}</td>
					<td>${team.goalsAgainst}</td>
					<td>${team.points}</td>
				</tr>
			</c:forEach>
		</table>	
					
		<h2>Group H</h2>
		<table width="30%">
			<thead>
				<tr>
					<td></td>
					<td>W</td>
					<td>D</td>
					<td>L</td>
					<td>GF</td>
					<td>GA</td>
					<td>Pts</td>
				</tr>
			</thead>
			<c:forEach items="${groupH}" var="team">
				<tr>
					<td>${team.name}</td>
					<td>${team.won}</td>
					<td>${team.drawn}</td>
					<td>${team.lost}</td>
					<td>${team.goalsFor}</td>
					<td>${team.goalsAgainst}</td>
					<td>${team.points}</td>
				</tr>
			</c:forEach>
		</table>	</div>
</body>
</html>