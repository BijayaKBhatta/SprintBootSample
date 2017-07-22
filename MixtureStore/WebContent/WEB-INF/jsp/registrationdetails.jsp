<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>HOME</title>
<link rel="stylesheet" type="text/css" href="theme1.css" />
</head>




<body>

<h1>This is a heading</h1>
<p>This is a paragraph.</p>


	<div id="main">
		<div id="head">
			<ul>
				<li><a href="/ForwardingWeb/home.web">Home</a></li>
				<li><a href="/ForwardingWeb/aboutus.web">About us</a></li>
				<li><a href="/ForwardingWeb/contactus.web">Contact us</a></li>
			</ul>
		</div>
	</div>

	<div id="body">
		<center>
			<h1>ENTER USER DETAILS</h1>

			<form:form commandName="registrationForm">

				<span style="color: red;"> <form:errors path="*" />
				</span>
				<table border="2">
					<tr>
						<th>NAME</th>
						<td><form:input path="name" /></td>
					</tr>
					<tr>
						<th>PASSWORD</th>
						<td><form:input path="password" /></td>
					</tr>
					<tr>
						<th>Registration DATE</th>
						<td><form:input path="reg_date" /></td>
					</tr>
					<tr>
						<th>Role</th>
						<td><form:input path="role" /></td>
					</tr>
					<tr>
						<th>GENDER</th>
						<td><form:input path="gender" /></td>
					</tr>
					<tr>
						<th>AGE</th>
						<td><form:input path="age" /></td>
					</tr>
					<tr>
						<th>Email</th>
						<td><form:input path="email" /></td>
					</tr>
					
					<tr>
						<th>Address</th>
						<td><form:input path="address" /></td>
					</tr>
					<tr>
						<td><input type="submit" value="submit" /></td>
					</tr>
					
				</table>
			</form:form>
		</center>
	</div>

	</div>

	<div id="footer">
		<center>&copy;RK'S TEAM</center>
	</div>

</body>
</html>