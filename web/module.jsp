<%-- 
    Document   : module
    Created on : 15 nov. 2019, 14:50:55
    Author     : lm
--%>

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
        <h1>affichage des cours module</h1>
        <div id="page_acceuil">
            <nav class="navbar navbar-inverse navbar-fixed-top"> 
                <div class="container-fluid">
                    <ul>                         
                        <li><a href="index.php">Home</a></li>
                        <li>
                            <select class="input-sm form-control" name="type" id="type" onchange="document.location.href = this.value;">
                                <option value="#" selected="selected">Nom de module <!--ce nom afficher par la base de donnée!--></option>
                                <option value="#">Cours X</option>
                                <option value="#">Cours Y</option>
                                <option value="#">Cours Z</option>
                                <option value="#">Autre[aprés on va les generer par la abse de données)</option>
                            </select>
                        </li>  
                        <!--a on va ensuite generer ces cours par la base de donnée  !-->
                        
                        
                    </ul>
                </div>
            </nav>
	</div>
    </body>
</html>
