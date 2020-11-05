<%-- 
    Document   : login
    Created on : 15 nov. 2019, 11:39:36
    Author     : lm
--%>
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>     
<%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
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
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        <link href="Css/bootstrap.css" rel="stylesheet">
        
        
        
    </head>
    <body>
        
        <%@include file="menu0.jsp" %>
    <center>
        <section class="register-now section-padding-200-0 d-flex justify-content-between align-items-center" style="background-image: url(img/core-img/texture.png);">
        <div class="register-contact-form mb-100 wow fadeInUp" data-wow-delay="250ms">
            <div class="container-fluid">
                <div class="row">
                    <div class="col-12"	>
                    <div class="forms">
                            <h4>Gestion des cours</h4>
                            <form  class="" id="myForm" method="POST" action="Login">
                                <div class="row">
                                    
                                        <div><c:if test="${ !empty message2}">
                                                <p>
                                                    <c:out value="  ${ message2 }"/>
                                                </p>
                                             </c:if>  
                                        </div>
                                    <div class="col-12 col-lg-12">
                                        <div class="form-group">
                                            <input type="text" name="nom" class="form-control" id="text" placeholder="Nom d'utilisateur">
                                        </div>
                                    </div>
                                    <div class="col-12 col-lg-12">
                                        <div class="form-group">
                                            <input type="password" name="pwd" class="form-control" id="email" placeholder="Mot de passe">
                                        </div>
                                    </div>
                                    
                                    <div class="col-12">
                                        <button class="btn clever-btn w-100">SE cONNECTER</button>
                                    </div>
                                    <div class="col-12">
                                        <a href="demande.jsp"><h4>S'inscrire</h4></a>                            
                                        <a href="oubliepwd.jsp"><h4>Vous avez oublié votre mot de passe ?</h4></a>
                                    </div>
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        
        </section>
    </center>
        
    </body>
</html>
