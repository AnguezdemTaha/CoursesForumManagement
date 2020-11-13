<%-- 
    Document   : cours
    Created on : 15 nov. 2019, 14:54:38
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
        <!-- cette partie lorsque on entre dans un cours precis !-->
        <%@include file="menu_etudiant.jsp" %>
        <div class="clever-catagory bg-img d-flex align-items-center justify-content-center p-3" style="background-image: url(img/bg-img/bg2.jpg);">
        <h3><c:out value="${ nom }" /></h3>
        </div>
        <section class="popular-courses-area section-padding-100">
           
            
           
            
            <div id="id01" class="modal">
        
  <div class="modal-content1" >
  <div class="form-display " >
      
      <div class="sitting_block">
      
          
          <center><h1>Sittings</h1></center>

        
        <br><br>
      <div class="user_name">
        
        <div class="row name_block"> 
          <div class="col-md-3 col-lg-3">
            <label  class="form_cols" for="uesr_name"><h4>tele :all sittings to see after couse user not alowed here to change alof of sittings but ..</h4></label>

          </div>
          <div class="col-md-6 col-lg-6">
              <label  class="form_cols" for="uesr_name"><h4>testname testlastname</h4></label>
          </div>  
          <div class="col-md-3 col-lg-3">
            <a class="editname_button" href="#"><h4>edit tele</h4></a>
          </div>

        </div>
        

        <div class="row editname_block">
        <form  class=" animate" id="myForm" method="POST" action="">
          
          <div class="row">
            <div class="col-md-3 col-lg-3 col-lg-push-2">
              <label  class="form_cols" for="firstName"><h4>Nom :</h4></label>
            </div>
            <div class="col-md-5 col-lg-5 col-lg-push-2">
              <input class="form-control" type="text" name="pwd1" id="pwd1"  placeholder="name" value="Test">
            </div>
          </div>

          <div class="row">
            <div class="col-md-3 col-lg-3 col-lg-push-2">
              <label  class="form_cols" for="lastName"><h4>lastname :</h4></label>
            </div>
            <div class="col-md-5 col-lg-5 col-lg-push-2">
              <input class="form-control" type="text" name="pwd1" id="pwd1"  placeholder="name" value="Testlast">
              <input class="form-control" type="password" name="pwd1" id="pwd1"  placeholder="Enter Password for confirmation">
              <center><br><button class="btn btn-primary" type="submit"  ><span class="glyphicon glyphicon-briefcase"></span> Valider</button>
                <button class="btn btn-primary cancel_name" type="submit"  ><span class="glyphicon glyphicon-briefcase"></span> cancel</button>
              </center>
            </div>
          </div>
        </form> 
        </div>
      </div>


      <div class="user_password">
        
        <div class="row password_block"> 
          <div class="col-md-3 col-lg-3">
            <label  class="form_cols" for="uesr_name"><h4>Password :</h4></label>

          </div>
          
          <div class="col-md-3 col-lg-3 col-lg-push-6">
            <a class="editpassword_button" href="#"><h4>edit Password</h4></a>
          </div>

        </div>
        
        <div class="row editpassword_block">
          <div class="col-md-3 col-lg-3 col-lg-push-2">
            <label  class="form_cols" for="lastName"><h4>Password:</h4></label>
          </div>
          <div class="col-md-5 col-lg-5 col-lg-push-2">
            
            <form  class=" animate" id="myForm" method="POST" action="">
              <input class="form-control" type="text" name="pwd1" id="pwd1"  placeholder="New pass" >
              <input class="form-control" type="password" name="pwd1" id="pwd1"  placeholder="new pass confirmation">
              <input class="form-control" type="password" name="pwd1" id="pwd1"  placeholder="Enter last Password for confirmation">
              <center><br><button class="btn btn-primary" type="submit"  ><span class="glyphicon glyphicon-briefcase"></span> Valider</button>
              <button class="btn btn-primary cancel_password" type="submit"  ><span class="glyphicon glyphicon-briefcase"></span> cancel</button>
            </center>
            </form>

          </div> 
        </div> 

      </div>



      <div class="user_email">
        
        <div class="row email_block"> 
          <div class="col-md-3 col-lg-3">
            <label  class="form_cols" for="uesr_name"><h4>Email :</h4></label>

          </div>
          <div class="col-md-6 col-lg-6">
              <label  class="form_cols" for="uesr_name"><h4>test@test.com</h4></label>
          </div>  
          <div class="col-md-3 col-lg-3">
            <a class="editemail_button" href="#"><h4>edit email</h4></a>
          </div>

        </div>
        
        <div class="row editemail_block">
          <div class="col-md-3 col-lg-3 col-lg-push-2">
            <label  class="form_cols" for="lastName"><h4>Email :</h4></label>
          </div>
          <div class="col-md-5 col-lg-5 col-lg-push-2">
            
            <form  class=" animate" id="myForm" method="POST" action="">
              <input class="form-control" type="text" name="pwd1" id="pwd1"  placeholder="name" value="Test@g.com">
              <input class="form-control" type="password" name="pwd1" id="pwd1"  placeholder="Enter Password for confirmation">
              <center><br><button class="btn btn-primary" type="submit"  ><span class="glyphicon glyphicon-briefcase"></span> Valider</button>
              <button class="btn btn-primary cancel_email" type="submit"  ><span class="glyphicon glyphicon-briefcase"></span> cancel</button>
            </center>
            </form>

          </div> 
        </div> 

      </div>

      <div class="user_email">
        
        <div class="row email_block"> 
          <div class="col-md-3 col-lg-3">
            <label  class="form_cols" for="uesr_name"><h4>Email :</h4></label>

          </div>
          <div class="col-md-6 col-lg-6">
              <label  class="form_cols" for="uesr_name"><h4>test@test.com</h4></label>
          </div>  
          <div class="col-md-3 col-lg-3">
            <a class="editemail_button" href="#"><h4>edit email</h4></a>
          </div>

        </div>
        
        <div class="row editemail_block">
          <div class="col-md-3 col-lg-3 col-lg-push-2">
            <label  class="form_cols" for="lastName"><h4>Email :</h4></label>
          </div>
          <div class="col-md-5 col-lg-5 col-lg-push-2">
            
            <form  class=" animate" id="myForm" method="POST" action="">
              <input class="form-control" type="text" name="pwd1" id="pwd1"  placeholder="name" value="Test@g.com">
              <input class="form-control" type="password" name="pwd1" id="pwd1"  placeholder="Enter Password for confirmation">
              <center><br><button class="btn btn-primary" type="submit"  ><span class="glyphicon glyphicon-briefcase"></span> Valider</button><button class="btn btn-primary" type="submit"  ><span class="glyphicon glyphicon-briefcase"></span> cancel</button>
              </center>
            </form>

          </div> 
        </div> 

      </div>
  </div>
  </div>
      
      
      
      
  </div>
  </div>
            
      
            
             <div id="id02" class="modal">
 <div class="modal-content2" >
  <div class="form-display " >
            
            <div class="addcours_block">
          
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
            
            
            
        <div class="container">
            <div class="row">
                <!-- Single Popular Course -->
                <c:forEach var="cours" items="${ courss }">
              <form method="post" action="Coursquestion">
                  <input type="hidden" id="custId" name="idcours" value="<c:out value="${ cours.id_cours }" />">
                  <input type="hidden" id="custId" name="nomcours" value="<c:out value="${ cours.nom_cours }" />">
                <div class="col-12 col-md-6 col-lg-4">
                    <div class="single-popular-course mb-100 wow fadeInUp" data-wow-delay="250ms">
                        <img src="img/bg-img/bg4.jpg" alt="">
                        <!-- Course Content -->
                        <div class="course-content">
                            <h4><c:out value="${ cours.nom_cours }" />:prof name too</h4>
                            <div class="meta d-flex align-items-center">
                                <a href="#"><c:out value="${ Module_filiere_anneeDao.recupereruser(cours.id_prof).nom }" />+titile prof for this doc</a>
                                <span><i class="fa fa-circle" aria-hidden="true"></i></span>
                                <a href="#"><c:out value="${ nom }" /></a>
                            </div>
                            <p></p>
                        </div>
                        <!-- Seat Rating Fee -->
                        <div class="seat-rating-fee d-flex justify-content-between">
                            <div class="seat-rating h-100 d-flex align-items-center">
                                <div class="seat">
                                    <i class="fa fa-user" aria-hidden="true"></i> <c:out value="${ Module_filiere_anneeDao.nbrquestion(cours) }" /> questions nb
                                </div>
                                <div class="rating">
                                    <i class="fa fa-star" aria-hidden="true"></i> 4.5
                                </div>
                            </div>
                            <div class="course-fee h-100">
                                <button class="btn btn-primary" type="submit"  ><span class="glyphicon glyphicon-repeat"></span> les questions et reponses</button>
                                <a href="Les cours/<c:out value="${ cours.nom_cours }" />.pdf" download>Telecharger</a>
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
                
                
       
    <script src="js/eventpage.js"></script>    
    </body>
</html>
