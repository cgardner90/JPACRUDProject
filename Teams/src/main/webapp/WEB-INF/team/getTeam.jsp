<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Team Search</title>
</head>
<body>
<h1> ${team.location}   ${team.name }</h1>
<h3> Team ID = ${team.id }</h3>


To Delete this team, enter the team id here:
<form action="deleteTeam.do" method="POST">
		Film ID: <input type="text" name="teamID" /> <input type="submit"
			value="Delete Team" />
	</form>
</body>

</html>