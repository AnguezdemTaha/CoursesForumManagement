<%-- 
    Document   : affichage_modules_de_fiiliere
    Created on : 25 nov. 2019, 14:56:11
    Author     : lm
--%>
<%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="Css/bootstrap.min.css" rel="stylesheet">
        <link rel="stylesheet" type="text/css" href="projet_css/style_page_princ_utilisateur.css">
        <link href="projet_css/style2.css" rel="stylesheet">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="Cours" method="POST">
            <c:if test="${ !empty anneev}">
             <input type="hidden" id="custId" name="annee" value="<c:out value="${ anneev }" />">
            </c:if>
        <select class="input-sm form-control" name="nom_module" id="type" onchange="this.form.submit()">
                                
            <c:if test="${ !empty filierv}">
                                <option value="#" selected="selected"><c:out value="${ module.filier }" /> </option>
            </c:if>
                                
                                <c:forEach var="module" items="${ modules }">
                                    
                                    <option value="<c:out value="${ module.nom }" />"><c:out value="${ module.nom }" /> </option>
                <!-- sous forme des lien <a>... !-->
                                </c:forEach>
                                
                                
        </select>
        </form>
    </body>
</html>
