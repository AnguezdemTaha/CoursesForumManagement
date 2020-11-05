<%-- 
    Document   : coursprof
    Created on : 25 nov. 2019, 21:07:21
    Author     : lm
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
        
        <form>
            <table>
                <caption>
                    liste des cours du module
                </caption>
                <tr>
                <th>
                    nom (sous forme d'un lien aprés)
                </th>
                
                
                </tr>
                
            <ul>
        <c:forEach var="cours" items="${ courss }">
            <li>
                <tr>
                        <td>
                           <c:out value="  ${ cours.nom_cours }" /> 
                        </td>
                        
                       
                </tr>
            </li>
        </c:forEach>
    </ul>    
                    
            </table>
            </form>
    </body>
</html>
