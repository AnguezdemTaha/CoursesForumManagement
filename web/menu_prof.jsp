<%-- 
    Document   : menu_prof
    Created on : 12 déc. 2019, 22:56:07
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
                                <li><a href="prof_accueil.jsp">Home</a></li>
                                <li><a href="#">Mes cours</a>
                                    <ul class="dropdown">
                                    <li>
                                    
                                    <form action="coursprof" method="POST">
                                    <select class="input-sm form-control" name="module" id="type" onchange="this.form.submit()">
                                    <option value="#" selected="selected">Mes cours</option>
                                    <c:forEach var="module" items="${ modules }">
                                    <option value="<c:out value="${ module.nom }" />"><c:out value="${ module.nom }" /> </option>
                                    </c:forEach>
                                
                                    </select>
                                    </form>
                                    </li>
                                    </ul>
                                </li>
                        
                        
                                
                               
                                
                                
                                <li><a href="#">Questions et reponses</a>
                                   <ul class="dropdown">
                                    <li>
                                    <form action="" method="POST">
                                        <a href="Prof_question_reponse0" >Tous</a>
                                        <input type="hidden" id="custId" name="annee" value="3eme annee">
                                        <select class="input-sm form-control" name="nom_module" id="type" onchange="this.form.submit()">
                                            <option value="#" selected="selected">Les question de mes cours</option>
                                            <c:forEach var="module" items="${ modules }">
                                            <option value="coursprof"><c:out value="${ module.nom }" /> </option>
                                            </c:forEach>c
                                
                                        </select>
                                    </form> 
                                    </li>
                                   </ul>
                                </li>
                                
                                
                            </ul>
                        
                        
                            
                        
                        
                              
                        
                            <!-- Search Button -->
                            

                            <!-- Register / Login -->
                            <div class="register-login-area">
                                <a href="Ajouter_cours0" class="btn">Ajouter un cours</a>
                                <a href="Deconnexion" class="btn active">Se deconnecter</a>
                            </div>

                        </div>
                        <!-- Nav End -->
                    </div>
                </nav>
            </div>
        </div>
    </header>
                                        
                                        
 
