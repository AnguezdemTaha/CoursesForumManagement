<%-- 
    Document   : adm_accueil
    Created on : 15 nov. 2019, 12:26:31
    Author     : lm
--%>

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
        <%
        
            if (session.getAttribute("utilisateur7") == null) {
                response.sendRedirect( "login.jsp" );
            } else {
        %>
        
        
            <%@include file="menu_adm.jsp" %>
	<div class="clever-catagory bg-img d-flex align-items-center justify-content-center p-3" style="background-image: url(img/bg-img/bg2.jpg);">
        <h3>Administration </h3>
        </div>
        
        
        <div id="demands_block" >
            
            <div class="col-md-10 col-lg-push-1"	>
                
            <form  class="" id="myForm" method="POST" action="Supprimer_demande">
            <table class="table table-bordered">
                <caption>
                    <p>Liste des demandes envoyées</p>
                </caption>
                <tr>
                <th>
                    Nom
                </th>
                <th>
                    Prénom
                </th>
                <th>
                    Email
                </th>
                
                <th>
                    Téléphone
                </th>
                </tr>
                
            <ul>
        <c:forEach var="etudiant" items="${ etudiants }">
            
                <tr>
                        <td>
                           <c:out value="${ etudiant.nom }" /> 
                        </td>
                        <td>
                            <c:out value="${ etudiant.prenom }" />
                        </td>
                        <td>
                            <c:out value="${ etudiant.email }" />
                        </td>
                        <td>
                            <c:out value="${ etudiant.telephone }" />
                        </td>
                        <td>
                            <input type="checkbox" name="choix"  value="${ etudiant.id }">
                        </td>
                </tr>
            
        </c:forEach>
    </ul>    
                    
            </table>
                
                <center><br><button class="btn btn-primary" type="submit" name="supprimer"  > Supprimer</button>
                 <button class="btn btn-primary" type="submit" name="valider"  > Valider</button></center>

            </form>
                    
            
            </div>
            
        </div>
        <div id="add_student_block" >
            
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
        <div id="add_teacher_block" >
            
            <form id="myForm" method="POST" action="Demande_admin">
                    <center> <h4 class = "form-signin-heading"><!--message!--></h4></center>
                    <label  class="form_cols" for="nom">Nom </label>
                    <div class="form-group">
                    <input class="form-control" name="nom" id="nom" type="text" />
                    </div>
                    <label  class="form_cols" for="nom">Prenom </label>
                    <div class="form-group">
                    <input class="form-control" name="prenom" id="lastName" type="text" />
                    </div>
                    <label  class="form_cols" for="email">Email  </label>
                    <div class="form-group">
                    <input class="form-control" type="email" name="email" id="email" placeholder="Ex:ahmed123@gmail.com" >
                    </div>
                    <label  class="form_cols" for="telephone">Telephone  </label>
                    <div class="form-group">
                    <input class="form-control" type="text" name="telephone" id="email" placeholder="0645454545" >
                    </div>
                    <div>
                    <div>
                        <div>
                            <label  class="form_cols" for="modules">Modules  </label>
                            <c:forEach var="module" items="${ modules }">
                                
                            
                            <input type="checkbox" id=<c:out value="${ module.nom }" /> name="choix" value=<c:out value="${ module.nom }" /> >
                            <label for=<c:out value="${ module.nom }" />><c:out value="${ module.nom }" /></label>
                            </c:forEach>
                        </div>
                        
                    </div>
                     
                    <br>
                    <p> <% 
                            
                            //out.println( name );
                    %></p>
                    <center><button class="btn btn-primary" type="submit"  > Ajouter L'utilisateur</button></center>
                </form>
            
        </div>
        <div id="add_model_block" >
            
            <h4>Ajout d'un module</h4>
                            <form  class="" id="myForm" method="POST" action="Adm_ajouter_module">
                                <div class="row">
                                    
                                        <div><c:if test="${ !empty message1}">
                                                <p>
                                                    <c:out value="  ${ message1 }"/>
                                                </p>
                                             </c:if>  
                                        </div>
                                    <div class="col-12 col-lg-12">
                                        <div class="form-group">
                                            <input type="text" name="nom" class="form-control" id="text" placeholder="Nom De Module">
                                        </div>
                                    </div>
                                    <label  class="form_cols" for="nom">Année de module </label>
                    <div class="form-group">
                    <input type="radio" name="annee" value="1er_annee" id="1er_annee" /> <label for="1er_annee">1er Année</label>
                    <input type="radio" name="annee" value="2eme_annee" id="1er_annee" /> <label for="2eme_annee">2eme Année</label>
                    <input type="radio" name="annee" value="3eme_annee" id="1er_annee" /> <label for="3eme_annee">3eme Année</label>
                    </div>
                    <label  class="form_cols" for="email">Filiére De Module  </label>
                    <div class="form-group">
                        <ul>
                        <li>
                            
                            
                             <table class="table-bordered">
                            
                                <tr>
                                <th>
                                Nom de filiere
                                </th>
                                </tr>
                                <ul>
                                <c:forEach var="filiere" items="${ filieres }">
                                    
                                        <tr>
                                            <td>
                                                <c:out value="${ filiere.nom }" />
                                            </td>
                                            <td>
                                            <input type="checkbox"  name="filiere" value="<c:out value="${ filiere.nom }" />" >
                                            </td>
                                        </tr>
                                    </li>
                                </c:forEach>
                                </ul>    
                            
                            
                            
                            
                             </table>
                            
                          
                        </ul>
                    </div>
                    
                    <div>
                        <div>
                            <div>
                            <label  class="form_cols" for="modules">Professeurs du module :  </label>
                            
                             <table class="table-bordered">
                            
                                <tr>
                                <th>
                                Nom de prof
                                </th>
                                </tr>
                                <ul>
                                <c:forEach var="prof" items="${ professeurs }">
                                     <tr>
                                            <td>
                                                <c:out value="${ prof.nom }" /> <c:out value="${ prof.prenom }" />
                                            </td>
                                            <td>
                                            <input type="checkbox"  name="profs" value="<c:out value="${ prof.id }" />" >
                                            </td>
                                        </tr>
                                    
                                </c:forEach>
                                </ul>    
                            
                            
                            
                            
                             </table>
                            <br>
                            
                        </div>
                        </div>
                    </div>

                                    
                                    <div class="col-12">
                                        <button class="btn clever-btn w-100">Ajouter le module</button>
                                    </div>
                                    
                                </div>
                            </form>
            
        </div>
        <div id="add_branch_block" >
            
            <h4>Ajout d'une filiere</h4>
                            <form  class="" id="myForm" method="POST" action="Ajouter_filiere">
                                <div class="row">
                                    
                                        <div><c:if test="${ !empty message1}">
                                                <p>
                                                    <c:out value="  ${ message1 }"/>
                                                </p>
                                             </c:if>  
                                        </div>
                                    <div class="col-12 col-lg-12">
                                        <div class="form-group">
                                            <input type="text" name="nom" class="form-control" id="text" placeholder="Nom De Filiere">
                                        </div>
                                    </div>
                                    

                                    
                                    <div class="col-12">
                                        <button class="btn clever-btn w-100">Ajouter la filiere</button>
                                    </div>
                                    
                                </div>
                            </form>
            
        </div>
        <div id="delete_student_block" >
            
            <form id="myForm" method="POST" action="Supprimer_Comptes_Etudiant">
            <table class="table table-bordered">
                <caption>
                    Liste des etudiant
                </caption>
                <tr>
                <th>
                    nom
                </th>
                <th>
                    prenom
                </th>
                <th>
                    email
                </th>
                <th>
                    telephone
                </th>
                </tr>
                
            <ul>
        <c:forEach var="etudiant" items="${ etudiants }">
            
                <tr>
                        <td>
                           <c:out value="${ etudiant.nom }" /> 
                        </td>
                        <td>
                            <c:out value="${ etudiant.prenom }" />
                        </td>
                        <td>
                            <c:out value="${ etudiant.email }" />
                        </td>
                        <td>
                            <c:out value="${ etudiant.telephone }" />
                        </td>
                        <td>
                            <input type="checkbox" name="choix" value="${ etudiant.id }">
                        </td>
                </tr>
            
        </c:forEach>
    </ul>    
                    
            </table>
                <center><button class="btn btn-primary" type="submit"  > supprimer </button></center>
            </form>
            
        </div>
        <div id="delete_teacher_block" >
            
            <form id="myForm" method="POST" action="Supprimer_Comptes_Professeur">
            <table class="table table-bordered">
                <caption>
                    Liste des proffesseur
                </caption>
                <tr>
                <th>
                    nom
                </th>
                <th>
                    prenom
                </th>
                <th>
                    email
                </th>
                <th>
                    telephone
                </th>
                </tr>
                
            <ul>
        <c:forEach var="professeur" items="${ professeurs }">
            
                <tr>
                        <td>
                           <c:out value="${ professeur.nom }" /> 
                        </td>
                        <td>
                            <c:out value="${ professeur.prenom }" />
                        </td>
                        <td>
                            <c:out value="${ professeur.email }" />
                        </td>
                        <td>
                            <c:out value="${ professeur.telephone }" />
                        </td>
                        <td>
                            <input type="checkbox" name="choix" value="${ professeur.id }">
                        </td>
                </tr>
            
        </c:forEach>
    </ul>    
                    
            </table>
            <center><button class="btn btn-primary" type="submit"  > supprimer </button></center>
            </form>
            
        </div>
        <div id="delete_model_block" >
            
            <form id="myForm" method="POST" action="Supprimer_Modules">
            <table class="table table-bordered">
                <caption>
                    Liste des modules
                </caption>
                <tr>
                <th>
                    nom
                </th>
                <th>
                    annee
                </th>
                <th>
                    filier
                </th>
                <th>
                    
                </th>
                </tr>
                
            <ul>
        <c:forEach var="module" items="${ modules }">
            
                <tr>
                        <td>
                           <c:out value="${ module.nom }" /> 
                        </td>
                        <td>
                            <c:out value="${ module.annee }" />
                        </td>
                        <td>
                            <c:out value="${ module.filier }" />
                        </td>
                        
                        <td>
                            <input type="checkbox" name="choix" value="${ module.id }">
                        </td>
                </tr>
            
        </c:forEach>
    </ul>    
                    
            </table>
                        <center><button class="btn btn-primary" type="submit"  > supprimer ces Modules </button></center>
            </form>
            
        </div>
        <div id="delete_branch_block" >
            
            <form id="myForm" method="POST" action="Supprimer_filieres">
            <table class="table table-bordered">
                <caption>
                    Liste des filieres
                </caption>
                <tr>
                <th>
                    nom
                </th>
                
                <th>
                    
                </th>
                </tr>
                
            <ul>
        <c:forEach var="filiere" items="${ filieres }">
            
                <tr>
                        <td>
                           <c:out value="${ filiere.nom }" /> 
                        </td>
                        
                        
                        <td>
                            <input type="checkbox" name="choix" value="${ filiere.id }">
                        </td>
                </tr>
            
        </c:forEach>
    </ul>    
                    
            </table>
                        <center><button class="btn btn-primary" type="submit"  > supprimer ces Filieres </button></center>
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
    <%
            } 
        %>
    </body>
</html>
