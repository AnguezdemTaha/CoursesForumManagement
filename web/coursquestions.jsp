<%-- 
    Document   : coursquestions
    Created on : 2 déc. 2019, 13:54:55
    Author     : lm
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
        <c:forEach var="cours" items="${ courss }">
       <div id="container">

   	  <div class="col-md-8 col-lg-push-2">
   	  	<div class="row">
   			  <br>
   		    <div class="col-md-4 ">
   		  	  
   		  	  <div class=row>
   		  		  <div class="col-md-12 ">
   			        <label>Nom de cours</label>
   			 	    </div>
            </div>
            <div class=row>  
              
            </div>
			      <div class=row>
   		  		  <div class="col-md-12 ">
   			        <label>Nom de prof</label>
              </div>
            </div>
		      </div>
<!--des infos d'pres database !-->
		      <div class="col-md-6 col-lg-push-2">
            <div class="row">
              
              <span class="glyphicon glyphicon-flag"></span>
              <label>Nom d'etudiant</label><br> 
              <span class="glyphicon glyphicon-globe"></span>
              <label>qs contenu</label><br>
              
            
          </div>
        </div>
        <div class="row">
    		  <div class="col-md-10 col-lg-push-1">
            <form method="post" action="traievn.php">
              
              <a href="Documents_cours/2.pdf" download>
                               telecharger le cours 
                           </a>
              
            </form >
          </div>
    		</div>
        <div class="row">
          <form method="post" action="cours_questions.jsp">
           
            <center>
            <button class="btn btn-primary" type="submit"  ><span class="glyphicon glyphicon-repeat"></span> les questions et reponses de cours</button>
            </center>
            <br>
          </form>
    		</div>
      </div>
          </div></div>
    </c:forEach>    
        
        <!-- un autre partie la partie de cette page !-->
        <div id="container">
           
            <div class="col-md-4 col-lg-push-4"	>
        <form method="post" action="cours_questions.jsp">
           
            <center>
            <button class="btn btn-primary" type="submit"  ><span class="glyphicon glyphicon-repeat"></span> les questions et reponses de cours</button>
            </center>
            <br>
          </form>
            </div></div>
        
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
