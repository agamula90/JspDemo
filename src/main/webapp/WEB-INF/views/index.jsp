<%-- 
    Document   : test
    Created on : Apr 30, 2023, 9:08:27 PM
    Author     : "Andrii Hamula"
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <c:forEach var="i" begin="1" end="10">
            <h1>Hello from Andrii ${i}'s time</h1>
        </c:forEach>
    </body>
</html>
