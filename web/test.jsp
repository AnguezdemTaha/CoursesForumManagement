<%-- 
    Document   : test
    Created on : 20 nov. 2019, 13:03:43
    Author     : lm
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        
        
        <% String name =(String) request.getAttribute("etudiant1");
        String name2 =(String) request.getAttribute("etudiant2");
        String name3 =(String) request.getAttribute("etudiant3");

            %>
            <h1><%= name %><%= name2 %><%= name3 %></h1>
    </body>
</html>
