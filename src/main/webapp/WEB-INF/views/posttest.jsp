<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<title>Post Test</title>
</head>
<body>
	<div xmlns:form="http://www.springframework.org/tags/form">
	<form:form modelAttribute="player" id="playerAddForm" method="post">
		<form:label path="firstname">
			First Name:
		</form:label>
		<form:input path="firstname" />
		<p />
		<form:label path="lastname">
			Last name:
		</form:label>
		<form:input path="lastname" />
		<p />
		<button type="submit">Save</button>
		<button type="reset">Reset</button>
	</form:form>
	</div>
</body>
</html>