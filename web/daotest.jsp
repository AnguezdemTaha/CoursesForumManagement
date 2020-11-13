<%-- 
    Document   : daotest
    Created on : 12 nov. 2020, 09:15:52
    Author     : lm
--%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1> Hello World!  :::: <c:if test="${ !empty msg}"><c:out value="${ msg }" /></c:if>  </h1>
    </body>
</html>
