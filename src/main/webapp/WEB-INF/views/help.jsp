<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page isELIgnored="false" %>
          <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Help page</title>
</head>
<body>
<h1>This is help page</h1>
<h1>${player}</h1>
	<h1>${score}</h1>
	<h1>${time}</h1>
	
	<c:forEach var="box" items="${run_overs}">
	<h1>${box}</h1>
	</c:forEach>
</body>
</html>