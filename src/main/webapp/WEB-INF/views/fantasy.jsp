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
		
		<table id="fantasyTable" width="90%">
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
				<c:choose>
      				<c:when test="${player.goals != 0}">
						<td>${player.goals}</td>
					</c:when>
					<c:otherwise>
						<td>&nbsp</td>
					</c:otherwise>
				</c:choose>
				<c:choose>
      				<c:when test="${player.assists != 0}">
						<td>${player.assists}</td>
					</c:when>
					<c:otherwise>
						<td>&nbsp</td>
					</c:otherwise>
				</c:choose>
				<c:choose>
      				<c:when test="${player.cleanSheets != 0}">
						<td>${player.cleanSheets}</td>
					</c:when>
					<c:otherwise>
						<td>&nbsp</td>
					</c:otherwise>
				</c:choose>
				<c:choose>
      				<c:when test="${player.half != 0}">
						<td>${player.half}</td>
					</c:when>
					<c:otherwise>
						<td>&nbsp</td>
					</c:otherwise>
				</c:choose>
				<c:choose>
      				<c:when test="${player.full != 0}">
						<td>${player.full}</td>
					</c:when>
					<c:otherwise>
						<td>&nbsp</td>
					</c:otherwise>
				</c:choose>
				<c:choose>
      				<c:when test="${player.yellowCards != 0}">
						<td>${player.yellowCards}</td>
					</c:when>
					<c:otherwise>
						<td>&nbsp</td>
					</c:otherwise>
				</c:choose>
				<c:choose>
      				<c:when test="${player.redCards != 0}">
						<td>${player.redCards}</td>
					</c:when>
					<c:otherwise>
						<td>&nbsp</td>
					</c:otherwise>
				</c:choose>
				<c:choose>
      				<c:when test="${player.penaltyMiss != 0}">
						<td>${player.penaltyMiss}</td>
					</c:when>
					<c:otherwise>
						<td>&nbsp</td>
					</c:otherwise>
				</c:choose>
				<c:choose>
      				<c:when test="${player.points != 0}">
						<td>${player.points}</td>
					</c:when>
					<c:otherwise>
						<td>&nbsp</td>
					</c:otherwise>
				</c:choose>
			</tr>
		</c:forEach>
		</table>
	</body>
</html>