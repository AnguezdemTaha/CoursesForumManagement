/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servlet;

import com.beans.Filiere;
import com.beans.Module;
import com.beans.User;
import com.database.Module_filiere_anneeDao;
import com.database.UtilisateurDaoo;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author lm
 */
public class Login extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
   

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
      
        
        
        
        
        
        
            //       if(etudiantdao.chercher(nom, password)==false){this.getServletContext().getRequestDispatcher("/etud_accueil.jsp").forward(request, response);}
            String nom =request.getParameter("nom");
            String prenom=request.getParameter("prenom");
            String email=request.getParameter("email");
            String telephone =request.getParameter("telephone");
            String password =request.getParameter("pwd");
            String type=request.getParameter("type");
            
            UtilisateurDaoo utilisateurdao= new UtilisateurDaoo();
            User utilisateur =new User(nom,prenom,telephone,email,password,type);
            //test pour les session:
             HttpSession session = request.getSession();

            //session.getAttribute("utilisateur7");
            
            
            //request.setAttribute("utilisateur", utilisateur);
            
            if(utilisateurdao.chercher(utilisateur)!=null){
                String message=utilisateurdao.chercher(utilisateur).getNom();
                String type_utilisateur=utilisateurdao.chercher(utilisateur).getType();
                request.setAttribute("message1",message );
                
                request.setAttribute("utilisateur1",utilisateurdao.chercher(utilisateur) );
                
                session.setAttribute("utilisateur7", utilisateurdao.chercher(utilisateur));
                
                //partie prof
                 if("Professeur".equals(type_utilisateur)){
                Module_filiere_anneeDao module_filiere = new Module_filiere_anneeDao();
                
                
                session.setAttribute("modules", module_filiere.recupererModulesprof(utilisateur));
                this.getServletContext().getRequestDispatcher("/prof_accueil.jsp").forward(request, response);    
                
                }
                 //partie etudiant
                else{
                     if("Etudiant".equals(type_utilisateur)){
                         
                    Map<Filiere, List<Module>> map1 = new HashMap<>();   
                    Map<Filiere, List<Module>> map2 = new HashMap<>();
                         
                    Module_filiere_anneeDao module_filiere = new Module_filiere_anneeDao();
                    request.setAttribute("filieres", module_filiere.recupererfilieres());
                    List<Filiere> filieres = new ArrayList<Filiere>();  
                    filieres = module_filiere.recupererfilieres();
                    
                    
                    String annee="1er annee";
                    //request.setAttribute("modules", module_filiere.recupererModulesannee(annee));
                    session.setAttribute("modules", module_filiere.recupererModulesannee(annee));
                    //remplissage de map
                    String annee2="2eme annee";
                    String annee3="3eme annee";
                    
                    for(Filiere f :filieres){                   
                    List<Module> moduls= module_filiere.recupererModulesdefiliere(f,annee2);
                    
                    map1.put(f, moduls);
                    }
                    
                    for(Filiere f :filieres){                   
                    List<Module> moduls= module_filiere.recupererModulesdefiliere(f,annee3);
                    
                    map2.put(f, moduls);
                    }
                    //Set<Filiere> keys = map.keySet();
                    
                    //Collection<List<Module>> values = map.values();
                    session.setAttribute("maps", map1);
                    //request.setAttribute("maps", map1);
                    //request.setAttribute("maps3", map2);
                    session.setAttribute("maps3", map2);
                    
                    
                    this.getServletContext().getRequestDispatcher("/etud_accueil.jsp").forward(request, response);
                    //response.sendRedirect( "etud_accueil.jsp" );
                     }
                     else{
                         if("Admin".equals(type_utilisateur)){
                    Module_filiere_anneeDao module_filiere = new Module_filiere_anneeDao();
                    
                    this.getServletContext().getRequestDispatcher("/adm_accueil.jsp").forward(request, response);
                         
                         }
                         
                     }
                }
                 //cas d'admin a ajouter
                 
                    
                }
            //if informations incorecte
            else{
                String message2="les informations sont incorrectes";
                request.setAttribute("message2",message2 );
                  this.getServletContext().getRequestDispatcher("/login.jsp").forward(request, response);  
            }
            
            
            
            
            //request.setAttribute("nom",nom);
            
        
        
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
   
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
