<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@page isELIgnored="false" %>
          <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Success page</title>
</head>
<body>
<h1>Successfully got data!!!</h1>
<h1>Welcome, ${user.username}</h1>
<h1>Your Username is :${user.email}</h1>
<h1>Your Password is :${user.password}</h1>
</body>
</html>