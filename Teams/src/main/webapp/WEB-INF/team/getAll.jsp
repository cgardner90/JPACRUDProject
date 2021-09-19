<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
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
<c:forEach var="t" items="${teams }">
<tr>
<td>${team.location }</td>
<td>${team.name }</td>
<td>${team.conference }</td>
<td>${team.division }</td>
<td>${team.numberOfSb }</td>
<td>${team.lastSb }</td>
<td>${team.lastPlayoff }</td>
<td>${team.headCoach }</td>
</tr>
</body>
</html>