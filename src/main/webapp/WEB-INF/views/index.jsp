<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page isELIgnored="false" %>
          <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Index page</title>
</head>
<body>
	<h1>This is home page</h1>
	<h1>${name}</h1>
	<h1>${age}</h1>
<%-- 	<h1>${fam}</h1>
 --%>	
	<c:forEach var="cointainer" items="${fam}">

<h1>${cointainer}</h1>

</c:forEach>
</body>
</html>