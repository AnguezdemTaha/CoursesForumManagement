<%-- 
    Document   : prof_question_reponse
    Created on : 3 janv. 2020, 23:20:56
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
        <%@include file="menu_prof.jsp" %>
         
            
            <div class="col-md-10 col-lg-push-1"	>
                
            <form  class="" id="myForm" method="POST" action="Prof_question_reponse">
            <table class="table table-bordered">
                <caption>
                    <p>Liste des Questions </p>
                </caption>
                <tr>
                <th>
                    Nom cours
                </th>
                <th>
                    question/reponse
                </th>
                
                </tr>
                
            <ul>
        <c:forEach var="qs" items="${ Questionsvn }">
            
                <tr>
                        <td>
                           <c:out value="${ qs.contenu }" /> 
                        </td>
                        <td>
                            <c:out value="${ qs.date }" />
                        </td>
                        
                        <td>
                            <input type="checkbox" name="choix"  value="${ qs.id }">
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

