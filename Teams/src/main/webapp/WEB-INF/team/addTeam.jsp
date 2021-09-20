<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="addTeam.do" method="POST">
		Team Location: <input type="text" name="location" /> 
		Team Name: 		   <input type="text" name="name" /> 
		Conference (AFC or NFC) <input type="text" name="conference" /> 
		Division (Must match: EAST, WEST, NOR,SOU) <input type="text" name="division" /> 
		How many Superbowls Won: <input type="text" name="numberofSb" /> 
		Year of Last Superbowl Win: <input type="text" name="lastSb" /> 
		Year of Last Playoff Appearance: <input type="text" name="lastPlayoff" /> 
		Name of Head Coach: <input type="text" name="headCoach" /> 
	<input type="submit" value="Submit New Team" />
	</form>
	
</body>
</html>