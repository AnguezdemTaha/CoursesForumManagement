<%-- 
    Document   : menu_etudiant
    Created on : 11 déc. 2019, 19:53:17
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
                                <li><a href="etud_accueil.jsp">Home</a></li>
                                <li><a href="#">1ère année</a>
                                   <ul class="dropdown">
                                    <li>
                                    <form action="Cours" method="POST">
                                        <input type="hidden" id="custId" name="annee" value="1er annee">
                                        <select class="input-sm form-control" name="nom_module" id="type" onchange="this.form.submit()">
                                        <option value="#" /> Tous </option>
                                        <c:forEach var="module" items="${ modules }">
                                            
                                        <option value="<c:out value="${ module.nom }" />"> <c:out value="${ module.nom }" /> </option>
                                
                                        </c:forEach>
                                
                                        </select>
                                    </form>
                                    </li>
                                   </ul>
                                     
                                </li>
                                <li><a href="#">2ème année</a>
                                   <ul class="dropdown">
                                    <c:forEach var="map" items="${ maps }">
                                    <li>
                                    <form action="Cours" method="POST">
                                        <input type="hidden" id="custId" name="annee" value="2eme annee">
                                        <select class="input-sm form-control" name="nom_module" id="type" onchange="this.form.submit()">
                                        
                                        
                                            
                                        <option value="<c:out value="${map.key.nom}"/>"><c:out value="${map.key.nom}"/> </option>
                                        <c:forEach var="value" items="${ map.value }">
                                        <option value="<c:out value="${value.nom}"/>"><c:out value="${value.nom}"/> </option>
                                        </c:forEach>
                                        
                                
                                        </select>
                                    </form> 
                                    </li>
                                    </c:forEach>
                                   </ul>
                                </li>
                               
                                
                                
                                <li><a href="#">3ème année</a>
                                   <ul class="dropdown">
                                    <c:forEach var="map" items="${ maps3 }">
                                    <li>
                                    <form action="Cours" method="POST">
                                        <input type="hidden" id="custId" name="annee" value="3eme annee">
                                        <select class="input-sm form-control" name="nom_module" id="type" onchange="this.form.submit()">
                                         <option value="<c:out value="${map.key.nom}"/>"><c:out value="${map.key.nom}"/> </option>
                                        <c:forEach var="value" items="${ map.value }">
                                        <option value="<c:out value="${value.nom}"/>"><c:out value="${value.nom}"/> </option>
                                        </c:forEach>
                                
                                        </select>
                                    </form> 
                                    </li>
                                    </c:forEach>
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

