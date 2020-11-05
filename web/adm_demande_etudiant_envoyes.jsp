<%-- 
    Document   : demande_etudiant_envoyes
    Created on : 15 nov. 2019, 14:07:20
    Author     : lm
--%>
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %> 
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
        <div id="container">
            
            <div class="col-md-4 col-lg-push-4"	>
        <form id="myForm" method="POST" action="Supprimer_Demandes_etudiant">
            <table>
                <caption>
                    liste des etudiant
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
                            <input type="checkbox" name="choix">
                        </td>
                </tr>
            
        </c:forEach>
    </ul>    
                    
            </table>
            </form>
            </div>
        </div>
    </body>
</html>
