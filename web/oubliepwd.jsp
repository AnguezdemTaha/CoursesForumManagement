<%-- 
    Document   : oubliepwd
    Created on : 15 nov. 2019, 12:17:38
    Author     : lm
--%>

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
        <div id="container">
            <div class="col-md-4 col-lg-push-4"	>
		<br><br>
		<form method="POST" action="#">
                    <div class = "Log1">
                        
                        <label for="email" class="identifie">Email :</label>
                        <div class="form-group"> 	
                            <input class="form-control" type="email" name="email" id="email" >
                            <br>
                            <button class="btn btn-primary" type="submit"  ><span class="glyphicon glyphicon-envelope"></span> ENVOYER</button>
                        </div>
                    </div>
          	</form>   
            </div>
	</div>
    </body>
</html>
