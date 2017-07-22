<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>HOME</title>
<spring:url value="/resources/css/theme1.css" var="mainCss" />
<link href="${mainCss}" rel="stylesheet" />


<script type="text/javascript">
function validatePhoneNumber() {
    var ph1,ph2, text;

    // Get the value of the input field with id="numb"
    ph1 = document.getElementById("phone1").value;
    ph2 = document.getElementById("phone2").value;
    // If x is Not a Number or less than one or greater than 10
    if (isNaN(ph1) || ph1 < 0 || ph1=="" || isNaN(ph2) ||ph2<0 || ph1.length != 1 || ph2.length !=1) {
        alert("Phone number is not va;ida");
        return false;
    } else {
        text = "Input OK";
    }
    document.getElementById("demo").innerHTML = text;

}

function validateEmail() {
    var email = document.forms["myForm"]["email"].value;
    alert(email);
    var atpos = email.indexOf("@");
    var dotpos = email.lastIndexOf(".");
    if (atpos<1 || dotpos<atpos+2 || dotpos+2>=x.length) {
        alert("Not a valid e-mail address");
        return false;
    }
}


</script>

</head>
<body bgcolor="grey">

<h1>This is a heading CSS from theme</h1>


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
			<form:form commandName="newUserRegistration" name=myForm>

				<span style="color: red;"> <form:errors path="*" />
				</span>
				<table border="2">
					<tr>
						<th>NAME</th>
						<td><form:input path="name" /></td>
					</tr>
					<tr>
						<th>PASSWORD</th>
						<td><form:password path="password" /></td>
					</tr>
					
					<tr>
						<th>Shop Name</th>
						<td><form:input path="shopName" /></td>
					</tr>
					<tr>
						<th>Address</th>
						<td><form:textarea path="address" rows="5" cols="30" /></td>
					</tr>
					
					<tr>
						<th>Role</th>
						<td><form:input path="role" /></td>
					</tr>
					<tr>
						<th>Phone Number 1</th>
						<td><form:input path="phone1" /></td>
					</tr>
					<tr>
						<th>Phone Number 2</th>
						<td><form:input path="phone2" /></td>
					</tr>
					<tr>
						<th>License Number</th>
						<td><form:input path="licenseNum" /></td>
					</tr>
					<tr>
						<th>Sales Person Name</th>
						<td><form:input path="salesPerson" /></td>
					</tr>
					
					<!-- below need to be combobox -->
					<tr>
						<th>Types</th>
						<td><form:input  path="roleType" /></td>
						
					</tr>
					
					<tr>
						<th>Email</th>
						<td><form:input path="email" /></td>
					</tr>
					<tr>
					<td></td>
						<td><input type="submit" value="submit"  onclick="validatePhoneNumber();validateEmail()"/></td>
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