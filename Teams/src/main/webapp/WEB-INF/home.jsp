<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Teams</title>
</head>
<body>
<h1> Welcome to Teams!</h1>

</head>
<body>
<table>
<thead>
<tr>
<th>Location</th>
<th>Name</th>
<th>Conference</th>
<th>Division</th>
<th>Superbowls Won</th>
<th>Last Superbowl Win</th>
<th>Last Playoff Appearance</th>
<th>Current Head Coach</th>
</tr>
</thead>
<c:forEach var="team" items="${teams}">
<tr>
<td>${team.location }</td>
<td><a href="getTeam.do?teamID=${team.id }">${team.name }</a></td>
<td>${team.conference }</td>
<td>${team.division }</td>
<td>           ${team.numberOfSb }</td>
<td>${team.lastSb }</td>
<td>${team.lastPlayoff }</td>
<td>${team.headCoach }</td>
</tr>
</c:forEach>
</table>
<h4> To input a New Team, follow this link:</h4>
<a href="testHTML.html">Click Here</a>
</body>
</html>
