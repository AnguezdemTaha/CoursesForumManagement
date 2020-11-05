<%-- 
    Document   : reponse_questioin
    Created on : 9 déc. 2019, 20:50:02
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
        <%@include file="menu_etudiant.jsp" %>
        <br><br>
        <c:forEach var="question" items="${ reponsesquestion }">
             
       <div id="container">
           
               <input type="hidden" id="custId" name="idquestion" value="<c:out value="${ question.id }" />">
               
           <!-- a changer apres comme variable jee !-->
           <input type="hidden" id="custId" name="idcours" value="">
           
           
   	  <div class="col-md-8 col-lg-push-2">
   	  	<div class="row">
   			  <br>
   		    <div class="col-md-2 ">
   		  	  
   		  	  <div class=row>
                        	 <div class="col-md-12 ">
                                        <label>on peut ajouter le nom d'etudiant </label>
                               </div>
                           </div>
                            
			      <div class=row>
   		  		  
            </div>
		      </div>
<!--des infos d'pres database !-->
		      <div class="col-md-10 col-lg-push-0">
                        <div class="row">
              
              
              <span class="glyphicon glyphicon-globe"></span>
              <label><c:out value="${ question.contenu }" /></label><br>
              
                            </div>
          	
                     </div>
              <c:forEach var="question" items="${ reponsesquestion }">
               <label>reponses</label>
              </c:forEach>
        </div>
              
        
        
        
      </div>
      
    </div>
         
    </c:forEach>    
         <div id="container">
           
              
           
           
   	  <div class="col-md-8 col-lg-push-2">
        <form method="post" action="Ajouter_reponse">
            <input type="text" name="reponse">
            <button class="btn btn-primary" type="submit"  ><span class="glyphicon glyphicon-repeat"></span> ajouter une reponse</button>
        </form>
          </div></div>
    </body>
</html>
