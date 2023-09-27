<%-- 
    Document   : login
    Created on : Sep 27, 2023, 4:15:55 PM
    Author     : ADMIN
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <form action="home">
            <input type="text" name="name">
            <input type="submit" name="ADD NAME">
        </form>
        
        <h1>LIST NAME</h1>
        <c:set var="i" value="0" />
        <c:forEach items="${names}" var="name">
           <c:set var="i" value="${(i+1)}" />
           ${i}. ${name} <br>
        </c:forEach>
        
    </body>
</html>
