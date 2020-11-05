<%-- 
    Document   : demande
    Created on : 15 nov. 2019, 12:00:01
    Author     : lm
--%>
<%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        
         <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <!-- The above 4 meta tags *Must* come first in the head; any other head content must come *after* these tags -->

    <!-- Title -->
    <title>Gestion des cours</title>

    <!-- Favicon -->
    <link rel="icon" href="img/core-img/favicon.ico">

    <!-- Stylesheet -->
    <link rel="stylesheet" href="style.css">
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        
	<link href="Css/bootstrap.min.css" rel="stylesheet">
        
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
                            <h4>Demande d'inscription</h4>
                            <form  class="" id="myForm" method="POST" action="Demande">
                                <div class="row">
                                    
                                        <div><c:if test="${ !empty message1}">
                                                <p>
                                                    <c:out value="  ${ message1 }"/>
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
                                            <input type="text" name="prenom" class="form-control" id="email" placeholder="Prénom">
                                        </div>
                                    </div>
                                    <div class="col-12 col-lg-12">
                                        <div class="form-group">
                                            <input type="text" name="email" class="form-control" id="text" placeholder="Email">
                                        </div>
                                    </div>
                                    <div class="col-12 col-lg-12">
                                        <div class="form-group">
                                            <input type="text" name="telephone" class="form-control" id="text" placeholder="Téléphone">
                                        </div>
                                    </div>
                                    
                                    
                                    <div class="col-12">
                                        <button class="btn clever-btn w-100">Envoyer ma demande</button>
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
