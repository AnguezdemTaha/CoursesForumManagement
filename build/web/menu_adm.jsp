<%-- 
    Document   : menu_adm
    Created on : 29 nov. 2019, 17:31:47
    Author     : lm
--%>


<header class="header-area">

        <!-- Top Header Area -->
       

        <!-- Navbar Area -->
        <div class="clever-main-menu">
            <div class="classy-nav-container breakpoint-off">
                <!-- Menu -->
                <nav class="classy-navbar justify-content-between" id="cleverNav">

                    <!-- Logo -->
                    <a class="nav-brand" href="index.html"><!--<img src="img/core-img/logo.png" alt="">!-->Gestion<span>Cours</span></a>

                    <!-- Navbar Toggler -->
                    <div class="classy-navbar-toggler">
                        <span class="navbarToggler"><span></span><span></span><span></span></span>
                    </div>

                    <!-- Menu -->
                    <div class="classy-menu">

                        <!-- Close Button -->
                        <div class="classycloseIcon">
                            <div class="cross-wrap"><span class="top"></span><span class="bottom"></span></div>
                        </div>

                        <!-- Nav Start -->
                        <div class="classynav">
                            
                            <ul>
                                <li><a href="adm_accueil.jsp">Home</a></li>
                                <li><a href="#">Gestion des étudiants   </a>
                                   <ul class="dropdown">
                                    <li>
                                        <a id="demands" href="Adm_etudiants_envoye">Les demandes</a>
                                    </li>
                                    <li>
                                        <a id="add_student" href="demande_adm.jsp">Ajouter un étudiant</a>
                                    </li>
                                    <li>
                                        <a id="delete_student" href="Supprimer_compte_etudiant">Supprimer étudiant</a>
                                    </li>
                                  
                                   </ul>
                                     
                                </li>
                                <li><a href="#">Gestion des profs</a>
                                   <ul class="dropdown">
                                    <li>
                                        <a id="add_teacher" href="adm_creer_compte_professeur.jsp">Ajouter un prof</a>
                                    </li>
                                    <li>
                                        <a id="delete_teacher" href="Supprimer_compte_professeur">Supprimer un prof</a>
                                    </li>
                                    
                                    
                                   </ul>
                                     
                                </li>
                               
                                
                                
                                <li><a href="#">Gestion des Modules</a>
                                   <ul class="dropdown">
                                    <li>
                                        <a id="add_model" href="Ajouter_module0">Ajouter un module</a>
                                    </li>
                                    <li>
                                        <a id="delete_model" href="Supprimer_module">Supprimer module</a>
                                    </li>
                                  
                                    
                                   </ul>
                                     
                                </li>
                                
                                 <li><a href="#">Gestion des Filières</a>
                                   <ul class="dropdown">
                                    <li>
                                        <a id="add_branch" href="adm_ajouter_filiere.jsp">Ajouter filiere</a>
                                    </li>
                                    <li>
                                        <a id="delete_branch" href="Supprimer_filiere">Supprimer filiere</a>
                                    </li>
                                  
                                    
                                   </ul>
                                     
                                </li>
                            </ul>
                        
                        
                            
                        
                        
                              
                        
                            <!-- Search Button -->
                            

                            <!-- Register / Login -->
                            <div class="register-login-area">
                                
                                <a href="Deconnexion" class="btn active">Se deconnecter</a>
                            </div>

                        </div>
                        <!-- Nav End -->
                    </div>
                </nav>
            </div>
        </div>
    </header>


