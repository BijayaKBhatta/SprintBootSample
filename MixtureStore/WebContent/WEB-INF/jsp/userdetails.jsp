<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>


<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>HOME</title>
<link rel="stylesheet" type="text/css" href="theme1.css" />
<spring:url value="/resources/css/style.css" var="mainCss" />
<link href="${mainCss}" rel="stylesheet" />
<spring:url value="/resources/css/animate.css" var="mainCss" />
<link href="${mainCss1}" rel="stylesheet" />
<spring:url value="/resources/css/bootstrap-datetimepicker.min.css" var="mainCss" />
<link href="${mainCss2}" rel="stylesheet" />
<spring:url value="/resources/css/bootstrap.css" var="mainCss" />
<link href="${mainCss3}" rel="stylesheet" />
<spring:url value="/resources/css/flexslider.css" var="mainCss" />
<link href="${mainCss4}" rel="stylesheet" />
<spring:url value="/resources/css/icomoon.css" var="mainCss" />
<link href="${mainCss5}" rel="stylesheet" />
<spring:url value="/resources/css/simple-line-icons.css" var="mainCss" />
<link href="${mainCss6}" rel="stylesheet" />
<spring:url value="/resources/css/style.css" var="mainCss" />
<link href="${mainCss6}" rel="stylesheet" />

<spring:url value="/resources/css/theme1.css" var="mainCss" />
<link href="${mainCss}" rel="stylesheet" />

</head>
<body>
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
			<table>
			<tr><td>REGISTRATION SUCCESSFUL</td></tr>
				<tr>
					<td>${user.name}</td>
				</tr>
				</table>

		</center>
	</div>

	</div>

	<div id="footer">
		<center>&copy;Devi Mixture Factory</center>
	</div>

</body>
</html>