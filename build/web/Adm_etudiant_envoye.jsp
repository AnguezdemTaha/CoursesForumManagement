<%-- 
    Document   : supprimer_compte_etudiant
    Created on : 15 nov. 2019, 14:08:26
    Author     : lm
--%>
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>     

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
         
            
            <div class="col-md-10 col-lg-push-1"	>
                
            <form  class="" id="myForm" method="POST" action="Supprimer_demande">
            <table class="table table-bordered">
                <caption>
                    <p>Liste des demandes envoyées</p>
                </caption>
                <tr>
                <th>
                    Nom
                </th>
                <th>
                    Prénom
                </th>
                <th>
                    Email
                </th>
                
                <th>
                    Téléphone
                </th>
                </tr>
                
            <ul>
        <c:forEach var="etudiant" items="${ etudiants }">
            
                <tr>
                        <td>
                           <c:out value="${ etudiant.nom }" /> 
                        </td>
                        <td>
                            <c:out value="${ etudiant.prenom }" />
                        </td>
                        <td>
                            <c:out value="${ etudiant.email }" />
                        </td>
                        <td>
                            <c:out value="${ etudiant.telephone }" />
                        </td>
                        <td>
                            <input type="checkbox" name="choix"  value="${ etudiant.id }">
                        </td>
                </tr>
            
        </c:forEach>
    </ul>    
                    
            </table>
                
                <center><br><button class="btn btn-primary" type="submit" name="supprimer"  > Supprimer</button>
                 <button class="btn btn-primary" type="submit" name="valider"  > Valider</button></center>

            </form>
                    
            
            </div>
       
        
   
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
