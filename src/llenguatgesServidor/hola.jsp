<%-- 
    Document   : hola
    Created on : 25/02/2018, 21:51:09
    Author     : manelriera
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html lang="ca">
	<head>
		<meta charset="utf-8" />
		<title>Hola</title>
	</head>
	<body>
		<%
			double num = Math.random();
			if (num > 0.95) {
		%>
				<h2>Hola, NetBeans!</h2>
		<$
			} else {
		%>
			<h2>Uep, Ramis!</h2>
		<%
			}
		%>
	</body>
</html>
