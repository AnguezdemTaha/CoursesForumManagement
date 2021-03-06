<%-- 
    Document   : adm_supprimer_filiere
    Created on : 4 janv. 2020, 11:45:38
    Author     : lm
--%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
    <meta name="description" content="">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <!-- The above 4 meta tags *Must* come first in the head; any other head content must come *after* these tags -->

    <!-- Title -->
    <title>Gestion des cours</title>

    <!-- Favicon -->
    <link rel="icon" href="img/core-img/favicon.ico">

    <!-- Stylesheet -->
    <link rel="stylesheet" href="style.css">
    </head>
    <body>
         <%@include file="menu_adm.jsp" %>
         <div id="container">
            
            <div class="col-md-8 col-lg-push-2"	>
                <div>   <c:if test="${ !empty message2}">
                    <p>
                        <c:out value="  ${ message2 }"/>
                    </p>
                            </c:if>  
                </div>
        <form id="myForm" method="POST" action="Supprimer_filieres">
            <table class="table table-bordered">
                <caption>
                    Liste des filieres
                </caption>
                <tr>
                <th>
                    nom
                </th>
                
                <th>
                    
                </th>
                </tr>
                
            <ul>
        <c:forEach var="filiere" items="${ filieres }">
            
                <tr>
                        <td>
                           <c:out value="${ filiere.nom }" /> 
                        </td>
                        
                        
                        <td>
                            <input type="checkbox" name="choix" value="${ filiere.id }">
                        </td>
                </tr>
            
        </c:forEach>
    </ul>    
                    
            </table>
                        <center><button class="btn btn-primary" type="submit"  > supprimer ces Filieres </button></center>
            </form>
            </div></div>
                     <script src="js/jquery/jquery-2.2.4.min.js"></script>
    <!-- Popper js -->
    <script src="js/bootstrap/popper.min.js"></script>
    <!-- Bootstrap js -->
    <script src="js/bootstrap/bootstrap.min.js"></script>
    <!-- All Plugins js -->
    <script src="js/plugins/plugins.js"></script>
    <!-- Active js -->
    <script src="js/active.js"></script>    
    </body>
</html>

