<%-- 
    Document   : question_cours
    Created on : 15 nov. 2019, 15:20:51
    Author     : lm
--%>
<%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
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
        <link href="Css/bootstrap.min.css" rel="stylesheet">
    </head>
    <body>
        <%@include file="menu_etudiant.jsp" %>
        <div class="clever-catagory bg-img d-flex align-items-center justify-content-center p-3" style="background-image: url(img/bg-img/bg2.jpg);">
        <h3><c:out value="${ cours7.nom_cours }" /></h3>
        </div>
        <br><br>
        <div class="clever-faqs">
                                            <h4>Questions de cours</h4>
                                             
                                            <div class="accordions" id="accordion" role="tablist" aria-multiselectable="true">

                                               <c:forEach var="map" items="${ maps4 }">
                                                   
                                                <div class="panel single-accordion">
                                                        <input type="hidden"  name="idquestion" value="<c:out value="${map.key.id}"/>">
                                                        <h6>
                                                        <a role="button" class="collapsed" aria-expanded="true" aria-controls="<c:out value="${map.key.id}"/>" data-parent="#accordion" data-toggle="collapse" href="#<c:out value="${map.key.id}"/>"><c:out value="${map.key.contenu}"/>
                                                        <span class="accor-open"><i class="fa fa-plus" aria-hidden="true"></i></span>
                                                        <span class="accor-close"><i class="fa fa-minus" aria-hidden="true"></i></span>
                                                        </a>
                                                        </h6>
                                                    <div id="<c:out value="${map.key.id}"/>" class="accordion-content collapse">
                                                        <c:forEach var="value" items="${ map.value }">
                                                            <p><c:out value="${value.contenu}"/></p><br>
                                                        </c:forEach>
                                                            
                                                        
                                                        <form method="post" action="Ajouter_reponse">
                                                            <input type="hidden" id="custId" name="idquestion" value="<c:out value="${map.key.id}"/>">
                                                            <div class="form-group">
                                                            <label for="comment">Poser une reponse:</label>
                                                            <textarea id="story" name="reponse" rows="4" class="form-control"></textarea><br>
                                                            </div>
                                                            
                                                            <button class="btn btn-primary" type="submit"  ><span class="glyphicon glyphicon-repeat"></span> ajouter une reponse</button>
                                                        </form>
                                                    </div>
                                                </div>
                                                        
                                                        
                                                
                                                        </c:forEach> 
                                                        </div>
                                            <br><br>
        <form method="post" action="Ajouter_question">
            <div class="form-group">
            <label for="comment">Poser une question:</label>
                                                            
            <textarea id="story" name="question" rows="5" class="form-control"></textarea><br>
            </div>
            
            
            <button class="btn btn-primary" type="submit"  ><span class="glyphicon glyphicon-repeat"></span> ajouter une question</button>
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
