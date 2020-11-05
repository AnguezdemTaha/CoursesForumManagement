<%-- 
    Document   : coursp
    Created on : 12 déc. 2019, 23:10:33
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
        <%@include file="menu_prof.jsp" %>
        <div class="clever-catagory bg-img d-flex align-items-center justify-content-center p-3" style="background-image: url(img/bg-img/bg2.jpg);">
        <h3><c:out value="${ nom }" /></h3>
        </div>
        <section class="popular-courses-area section-padding-100">
        <div class="container">
            <div class="row">
                <!-- Single Popular Course -->
                <c:forEach var="cours" items="${ courss }">
              <form method="post" action="coursquestionp">
                  <input type="hidden" id="custId" name="idcours" value="<c:out value="${ cours.id_cours }" />">
                  <input type="hidden" id="custId" name="nomcours" value="<c:out value="${ cours.nom_cours }" />">
                <div class="col-12 col-md-6 col-lg-4">
                    <div class="single-popular-course mb-100 wow fadeInUp" data-wow-delay="250ms">
                        <img src="img/bg-img/bg4.jpg" alt="">
                        <!-- Course Content -->
                        <div class="course-content">
                            <h4><c:out value="${ cours.nom_cours }" /></h4>
                            <div class="meta d-flex align-items-center">
                                <a href="#"><c:out value="${ Module_filiere_anneeDao.recupereruser(cours.id_prof).nom }" /></a>
                                <span><i class="fa fa-circle" aria-hidden="true"></i></span>
                                <a href="#"><c:out value="${ nom }" /></a>
                            </div>
                            <p><c:out value="${ cours.contenu_cours }" /></p>
                        </div>
                        <!-- Seat Rating Fee -->
                        <div class="seat-rating-fee d-flex justify-content-between">
                            <div class="seat-rating h-100 d-flex align-items-center">
                                <div class="seat">
                                    <i class="fa fa-user" aria-hidden="true"></i> nbr qst
                                </div>
                                <div class="rating">
                                    <i class="fa fa-star" aria-hidden="true"></i> 4.5
                                </div>
                            </div>
                            <div class="course-fee h-100">
                                <button class="btn btn-primary" type="submit"  name="qs"><span class="glyphicon glyphicon-repeat"></span> les questions et reponses</button>
                                <a href="Les cours/<c:out value="${ cours.nom_cours }" />.pdf" download>Telecharger</a>
                                <button class="btn btn-primary" type="submit"  name="supprimer"><span class="glyphicon glyphicon-repeat"></span> supprimer le cours</button>
                                
                            </div>
                        </div>
                    </div>
                </div>
              </form>
                </c:forEach> 
                </div>
            </div>
             
            
            
            <div class="row">
                <div class="col-12">
                    <div class="load-more text-center wow fadeInUp" data-wow-delay="1000ms">
                        <a href="#" class="btn clever-btn btn-2">Load More</a>
                    </div>
                </div>
            </div>
        
        
    </section>
                
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
