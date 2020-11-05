<%-- 
    Document   : adm_ajouter_prof
    Created on : 25 nov. 2019, 13:17:58
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
        <div id="container">
            <div class="col-md-4 col-lg-push-4"	>
		<br>
                <c:if test="${ !empty message1}">
                    <p>
                        <c:out value=" ${ message1 }"/>
                    </p>
                </c:if>  
                   
                
                
                    <p>
    <%
        /*String name =(String ) request.getAttribute("nom");
        %>                   
    <%
        /* String heure = (String) request.getAttribute("heure");
        if (heure.equals("jour")) {
            out.println("Bonjour"); 
        }
        else {
            out.println("Bonsoir");
        }*/
    %>
</p>

		<form id="myForm" method="POST" action="Demande_admin">
                    <center> <h4 class = "form-signin-heading"><!--message!--></h4></center>
                    <label  class="form_cols" for="nom">Nom </label>
                    <div class="form-group">
                    <input class="form-control" name="nom" id="nom" type="text" />
                    </div>
                    <label  class="form_cols" for="nom">Prenom </label>
                    <div class="form-group">
                    <input class="form-control" name="prenom" id="lastName" type="text" />
                    </div>
                    <label  class="form_cols" for="email">Email  </label>
                    <div class="form-group">
                    <input class="form-control" type="email" name="email" id="email" placeholder="Ex:ahmed123@gmail.com" >
                    </div>
                    <label  class="form_cols" for="telephone">Telephone  </label>
                    <div class="form-group">
                    <input class="form-control" type="text" name="telephone" id="email" placeholder="0645454545" >
                    </div>
                    <div>
                    <div>
                        <div>
                            <label  class="form_cols" for="modules">Modules  </label>
                            <c:forEach var="module" items="${ modules }">
                                
                            
                            <input type="checkbox" id=<c:out value="${ module.nom }" /> name="choix" value=<c:out value="${ module.nom }" /> >
                            <label for=<c:out value="${ module.nom }" />><c:out value="${ module.nom }" /></label>
                            </c:forEach>
                        </div>
                        
                    </div>
                     
                    <br>
                    <p> <% 
                            
                            //out.println( name );
                    %></p>
                    <center><button class="btn btn-primary" type="submit"  > Ajouter L'utilisateur</button></center>
                </form>
            </div>
        </div>
    </body>
</html>
