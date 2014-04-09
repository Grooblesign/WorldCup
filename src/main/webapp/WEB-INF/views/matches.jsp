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
					<td>Result</td> 	
					<td>Adam</td> 	
					<td>Emily</td> 	
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
				<td>${match.team1Goals} - ${match.team2Goals}</td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				</tr>
			</c:forEach>
			</table>
		</div>
	</body>
</html>