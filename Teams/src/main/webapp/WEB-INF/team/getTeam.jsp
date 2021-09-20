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


<h3>To Delete this team, enter the team id here:</h3><br>
<form action="deleteTeam.do" method="POST">
		Team ID: <input type="text" name="teamID" /> <input type="submit"
			value="Delete Team" />
	</form>
	
<br><br>
<h3>In order to update this team, fill out the necessary fields below:</h3><br>
<form action="update.do" method="POST">
		Team ID = <input type = "text" name = "id" value="${team.id }"/><br>
		Team Location: <input type="text" name="location" value="${team.location }"/> <br>
		Team Name: 		   <input type="text" name="name" value="${team.name }"/> <br>
		Conference (AFC or NFC) <input type="text" name="conference" value="${team.conference }"/><br> 
		Division (Must match: EAST, WEST, NOR,SOU) <input type="text" name="division" value="${team.division}"/><br> 
		How many Superbowls Won: <input type="number" name="numberofSb" value = "${team.numberOfSb }"/><br> 
		Year of Last Superbowl Win: <input type="number" name="lastSb" value = "${team.lastSb }"/> <br>
		Year of Last Playoff Appearance: <input type="number" name="lastPlayoff" value="${team.lastPlayoff }"/><br> 
		Name of Head Coach: <input type="text" name="headCoach" value = "${team.headCoach }"/> 
	<input type="submit" value="Update Team" />
	</form>
	
	
	
	
	
	
	
	
	
	
<a href = "home.do">Return to HomePage</a>



</body>

</html>