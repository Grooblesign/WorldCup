<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Fantasy Team</title>
	<link rel="stylesheet"
		href="<c:url value="/resources/style/stylesheet.css" />"
		type="text/css" />
	</head>
	<body>
		<h1>${person}'s Team</h1>
		
		<table width="90%">
			<tr>
				<thead>
					<td>Name</td>
					<td>Team</td>
					<td>Position</td>
					<td>G</td>
					<td>A</td>
					<td>C</td>
					<td>H</td>
					<td>F</td>
					<td>Y</td>
					<td>R</td>
					<td>P</td>
					<td>Pts</td>
				</thead>
			<tr>
		<c:forEach items="${team}" var="player">
			<tr>
				<td>${player.name}</td>
				<td>${player.teamName}</td>
				<td>${player.position}</td>
				<td>${player.goals}</td>
				<td>${player.assists}</td>
				<td>${player.cleanSheets}</td>
				<td>${player.half}</td>
				<td>${player.full}</td>
				<td>${player.yellowCards}</td>
				<td>${player.redCards}</td>
				<td>${player.penaltyMiss}</td>
				<td>${player.points}</td>
			</tr>
		</c:forEach>
		</table>
	</body>
</html>