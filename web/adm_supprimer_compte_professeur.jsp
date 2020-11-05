<%-- 
    Document   : adm_supprimer_compte_professeur
    Created on : 15 nov. 2019, 14:10:57
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
        <form id="myForm" method="POST" action="Supprimer_Comptes_Professeur">
            <table class="table table-bordered">
                <caption>
                    Liste des proffesseur
                </caption>
                <tr>
                <th>
                    nom
                </th>
                <th>
                    prenom
                </th>
                <th>
                    email
                </th>
                <th>
                    telephone
                </th>
                </tr>
                
            <ul>
        <c:forEach var="professeur" items="${ professeurs }">
            
                <tr>
                        <td>
                           <c:out value="${ professeur.nom }" /> 
                        </td>
                        <td>
                            <c:out value="${ professeur.prenom }" />
                        </td>
                        <td>
                            <c:out value="${ professeur.email }" />
                        </td>
                        <td>
                            <c:out value="${ professeur.telephone }" />
                        </td>
                        <td>
                            <input type="checkbox" name="choix" value="${ professeur.id }">
                        </td>
                </tr>
            
        </c:forEach>
    </ul>    
                    
            </table>
            <center><button class="btn btn-primary" type="submit"  > supprimer </button></center>
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
