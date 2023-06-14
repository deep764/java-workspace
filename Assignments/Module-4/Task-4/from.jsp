<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<fieldset>
		<legend>Personal Information</legend>
		<form action="insert.jsp">
			<p>
			<label>Enter Your FirstName: </label>
			<input type="text" name="fname" required="required">
			</p>
			
			<p>
			<label>Enter Your LastName: </label>
			<input type="text" name="lname" required="required">
			</p>
			
			<p>
			<label>Enter Your Email: </label>
			<input type="email" name="email" required="required">
			</p>
			
			<p>
			<label>Enter Your Mobile Number: </label>
			<input type="number" name="mobile" required="required"maxlength="10">
			</p>
			
			<p>
			<label>Select Your Gender: </label>
			<input type="radio" name="gender" value="Male">Male
			<input type="radio" name="gender" value="Female">Female
			</p>
			
			<p>
			<label>Enter Your Password: </label>
			<input type="password" name="pass" required="required">
			</p>
			
			<p>
			<input type="submit" value="Submit"> 
		</p>
		</form>
	</fieldset>
</body>
</html>