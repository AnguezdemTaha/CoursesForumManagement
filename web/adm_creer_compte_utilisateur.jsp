<%-- 
    Document   : creer_compte_etudiant
    Created on : 15 nov. 2019, 14:07:45
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
        <div id="container">
            <div class="col-md-4 col-lg-push-4"	>
		<br>
		<form id="myForm" method="POST" action="">
                    <center> <h4 class = "form-signin-heading"><!--message!--></h4></center>
                    <label  class="form_cols" for="nom">Nom </label>
                    <div class="form-group">
                    <input class="form-control" name="nom" id="lastName" type="text" />
                    </div>
                    <label  class="form_cols" for="nom">Prenom </label>
                    <div class="form-group">
                    <input class="form-control" name="nom" id="lastName" type="text" />
                    </div>
                    <label  class="form_cols" for="email">Email  </label>
                    <div class="form-group">
                    <input class="form-control" type="email" name="email" id="email" placeholder="Ex:ahmed123@gmail.com" >
                    </div>
                    <label  class="form_cols" for="telephone">Telephone  </label>
                    <div class="form-group">
                    <input class="form-control" type="email" name="telephone" id="email" placeholder="0645454545" >
                    </div>
                    <br>
                    <center><button class="btn btn-primary" type="submit"  > Créer le Compte</button></center>
                    <!--et aprés un email va etre envoyé au etuddiant pour saisir le mot de passe vouli !-->
                </form>
            </div>
        </div>
    </body>
</html>
