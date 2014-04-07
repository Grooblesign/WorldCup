<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>World Cup SPA</title>
	<script src="<c:url value="/resources/scripts/jquery-2.1.0.js" />"></script>
	<link rel="stylesheet" href="<c:url value="/resources/style/stylesheet.css" />" type="text/css" />
	<script type="text/javascript">
        function init() {
            $.getJSON("http://localhost:8080/MavenWeb/matches/rest", function (data) {
                var items = [];
                items.push("<thead><td>Date</td><td>Team 1</td><td>Team 2</td><td>Location</td></thead>");
                $.each(data, function (key, val) {
                    items.push("<tr id='" + key + "'>" + "<td>" + val.date + "</td>" + "<td>" + val.team1Name + "</td><td>" + val.team2Name + "</td><td>" + val.venue + "</td><tr>");
                });
                $("<table/>", {
                    "id": "matchesTable",
                    html: items.join("")
                }).appendTo("body");
            });
        }
    </script>
</head>
<body onload="init();">
	<h1>World Cup 2014</h1>
</body>
</html>