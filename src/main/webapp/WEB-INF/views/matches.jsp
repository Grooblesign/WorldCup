<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
	<head>
		<title>Matches</title>
		<link rel="stylesheet" href="<c:url value="/resources/style/stylesheet.css" />" type="text/css" />
	</head>
	<body>
		<h1>Matches</h1>	
		<div id="container">
			<table id="matchesTable">
			<thead>
				<tr>
					<td>Date</td>
					<td>Time</td> 			
					<td>Team 1</td> 			
					<td>Team 2</td> 	
					<td>Score</td> 	
					<td>Adam</td> 	
					<td>Emily</td> 	
					<td>John</td> 	
					<td>Kyle</td> 	
					<td>Luke</td> 	
					<td>Paul</td>
				</tr>
			</thead>	
			<c:forEach items="${matches}" var="match">
				<tr>		
				<td>${match.date}</td>
				<td>${match.time}</td>
				<td>${match.team1Name}</td>
				<td>${match.team2Name}</td>
				<c:choose>
					<c:when test="${match.team1Goals == -1}">
						<td />
					</c:when>
					<c:otherwise>	
						<td class="matchesTableResult">${match.team1Goals} - ${match.team2Goals}</td>
					</c:otherwise>
				</c:choose>
				<c:choose>
					<c:when test="${(match.getTeam1Goals == match.getTeam1GoalsAdam) && (match.getTeam2Goals == match.getTeam2GoalsAdam)}">
						<td class="matchesTableResultExact">${match.team1GoalsAdam} - ${match.team2GoalsAdam}</td>
					</c:when>
					<c:otherwise>	
						<td class="matchesTableResult">${match.team1GoalsAdam} - ${match.team2GoalsAdam}</td>
					</c:otherwise>
				</c:choose>
				<c:choose>
					<c:when test="${(match.getTeam1Goals == match.getTeam1GoalsEmily) && (match.getTeam2Goals == match.getTeam2GoalsEmily)}">
						<td class="matchesTableResultExact">${match.team1GoalsEmily} - ${match.team2GoalsEmily}</td>
					</c:when>
					<c:otherwise>	
						<td class="matchesTableResult">${match.team1GoalsEmily} - ${match.team2GoalsEmily}</td>
					</c:otherwise>
				</c:choose>
				<c:choose>
					<c:when test="${(match.getTeam1Goals == match.getTeam1GoalsJohn) && (match.getTeam2Goals == match.getTeam2GoalsJohn)}">
						<td class="matchesTableResultExact">${match.team1GoalsJohn} - ${match.team2GoalsJohn}</td>
					</c:when>
					<c:otherwise>	
						<td class="matchesTableResult">${match.team1GoalsJohn} - ${match.team2GoalsJohn}</td>
					</c:otherwise>
				</c:choose>
				<c:choose>
					<c:when test="${(match.getTeam1Goals == match.getTeam1GoalsKyle) && (match.getTeam2Goals == match.getTeam2GoalsKyle)}">
						<td class="matchesTableResultExact">${match.team1GoalsKyle} - ${match.team2GoalsKyle}</td>
					</c:when>
					<c:otherwise>	
						<td class="matchesTableResult">${match.team1GoalsKyle} - ${match.team2GoalsKyle}</td>
					</c:otherwise>
				</c:choose>
				<c:choose>
					<c:when test="${(match.getTeam1Goals == match.getTeam1GoalsLuke) && (match.getTeam2Goals == match.getTeam2GoalsLuke)}">
						<td class="matchesTableResultExact">${match.team1GoalsLuke} - ${match.team2GoalsLuke}</td>
					</c:when>
					<c:otherwise>	
						<td class="matchesTableResult">${match.team1GoalsLuke} - ${match.team2GoalsLuke}</td>
					</c:otherwise>
				</c:choose>
				<c:choose>
					<c:when test="${(match.getTeam1Goals == match.getTeam1GoalsPaul) && (match.getTeam2Goals == match.getTeam2GoalsPaul)}">
						<td class="matchesTableResultExact">${match.team1GoalsPaul} - ${match.team2GoalsPaul}</td>
					</c:when>
					<c:otherwise>	
						<td class="matchesTableResult">${match.team1GoalsPaul} - ${match.team2GoalsPaul}</td>
					</c:otherwise>
				</c:choose>
				</tr>
				<c:if test="${(match.index == 48)}">
					<tr>
						<td>&nbsp;</td>
						<td>&nbsp;</td>
						<td>&nbsp;</td>
						<td>&nbsp;</td>
						<td>&nbsp;</td>
						<td>&nbsp;</td>
						<td>&nbsp;</td>
						<td>&nbsp;</td>
						<td>&nbsp;</td>
						<td>&nbsp;</td>
						<td>&nbsp;</td>
					</tr>
				</c:if>
			</c:forEach>
			</table>
			<br />
		</div>
	</body>
</html>