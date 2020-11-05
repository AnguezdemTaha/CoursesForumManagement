<%-- 
    Document   : prof_ajouter_cours
    Created on : 3 janv. 2020, 11:35:59
    Author     : lm
--%>

<%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
        <center>
        <section class="register-now section-padding-200-0 d-flex justify-content-between align-items-center" style="background-image: url(img/core-img/texture.png);">
        <div class="register-contact-form mb-100 wow fadeInUp" data-wow-delay="250ms">
            <div class="container-fluid">
                <div class="row">
                    <div class="col-12"	>
                    <div class="forms">
                            <h4>Ajout de cours</h4>
                            <form  class="" id="myForm" method="POST" action="Ajouter_cours" enctype="multipart/form-data">
                                <div class="row">
                                    
                                        <div><c:if test="${ !empty message1}">
                                                <p>
                                                    <c:out value="  ${ message1 }"/>
                                                </p>
                                             </c:if>  
                                        </div>
                                    <div class="col-12 col-lg-12">
                                        <div class="form-group">
                                            <label>Entrer le cours sous format pdf</label>
                                            <input type="file" id="file" name="file" >
                                        </div>
                                    </div>
                                    <div class="col-12 col-lg-12">
                                        <div class="form-group">
                                            <input type="text" name="nom" class="form-control" id="text" placeholder="Nom de cours">
                                        </div>
                                    </div>
                                    
                                    <div class="col-12 col-lg-12">
                                        <div class="form-group">
                                            <textarea id="story" name="contenu" rows="5" class="form-control">Resume(idée)</textarea><br>
                                        </div>
                                    </div>
                                    
                    
                    <label  class="form_cols" for="email">Choisir le module de cours</label>
                    <div class="form-group">
                        <ul>
                        <li>
                            
                            
                             <table class="table table-bordered">
                            
                                <tr>
                                <th>
                                l'annee du module
                                </th>
                                <th>
                                Nom de module
                                </th>
                                </tr>
                                <ul>
                                <c:forEach var="modulep" items="${ modulesp }">
                                    <li>
                                        <tr>
                                            <td>
                                                <c:out value="${ modulep.annee }" />
                                            </td>
                                            <td>
                                                <c:out value="${ modulep.nom }" />
                                            
                                            </td>
                                            <td>
                                            <input type="checkbox"  name="id_m" value="<c:out value="${ modulep.id }" />" >
                                            </td>
                                        </tr>
                                    </li>
                                    
                                    
                                </c:forEach>
                                </ul>    
                            
                            
                            
                            
                             </table>
                            
                        </li>  
                        </ul>
                    </div>
                    
                    

                                    
                                    
                                    <div class="col-12">
                                        <button class="btn clever-btn w-100">Ajouter le cours</button>
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
