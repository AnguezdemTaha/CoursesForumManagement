<%-- 
    Document   : gestion_compte_admin
    Created on : 4 déc. 2019, 12:30:51
    Author     : lm
--%>
<%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%@include file="menu_adm.jsp" %>
        <br><br>
        <div id="container">
            <div class="col-md-4 col-lg-push-4"	>
                <br><br>
                <c:if test="${ !empty message1}">
                    <p>
                        <c:out value=" ${ message1 }"/>
                    </p>
                </c:if> 
        <form id="myForm" method="POST" action="Demande_admin">
                    <center> <h4 class = "form-signin-heading"><!--message!--></h4></center>
                    <label  class="form_cols" for="nom">Neuveux Nom </label>
                    <div class="form-group">
                    <input class="form-control" name="nom" id="nom" type="text" />
                    </div>
                    
                    <label  class="form_cols" for="email">neuveux mot de pass  </label>
                    <div class="form-group">
                    <input class="form-control" type="password" name="npwd1" id="email" placeholder="Ex:ahmed123@gmail.com" >
                    </div>
                    <label  class="form_cols" for="telephone">confirmer neuveux mot de passe  </label>
                    <div class="form-group">
                    <input class="form-control" type="password" name="npwd2" id="email" placeholder="0645454545" >
                    </div>
                    
                    <br>
                    <p> <% 
                            
                            //out.println( name );
                    %></p>
                    <center><button class="btn btn-primary" type="submit"  > Enregistrer</button></center>
                </form>
    </body>
</html>
