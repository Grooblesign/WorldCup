<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
	<head>
		<title>World Cop 2014</title>
	</head>		
	<body>
		<h1>World Cup 2014</h1>
		${datetime}
		<br />
		${databaseurl}
		<br />
		${message}
		<br />
		${teamcount}
		<br />
		<c:forEach items="${teams}" var="team">		
			${team}
			<br />
		</c:forEach>	
	</body>
</html>
