/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servlet;

import com.beans.Filiere;
import com.beans.Utilisateur;
import dao.Module_filiere_anneeDao;
import dao.UtilisateurDao;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author lm
 */
@WebServlet(name = "Afiichage_modules_de_filiere", urlPatterns = {"/Afiichage_modules_de_filiere"})
public class Afiichage_modules_de_filiere extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Afiichage_modules_de_filiere</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Afiichage_modules_de_filiere at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        //je ne sait pas if get or post !!!!!!
       
        

    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        // String nom2="IWIM";
        String annee=request.getParameter("annee");
        String nom_filiere=request.getParameter("nom_filiere");
        Filiere filiere =new Filiere();
        filiere.setNom(nom_filiere);
        /*if(annee=="2eme annee"){
            
        }
        else{
            if(annee=="3eme annee"){
                
            }
        }
        */
        
        request.setAttribute("anneev",annee);
        request.setAttribute("filierv",nom_filiere);
        
        Module_filiere_anneeDao module_filiere = new Module_filiere_anneeDao();
        
        request.setAttribute("modules", module_filiere.recupererModulesdefiliere(filiere,annee));
        this.getServletContext().getRequestDispatcher("/affichage_modules_de_fiiliere.jsp").forward(request, response);
        
       /* else{
            if(nom2 != "3eme annee"){
        Filiere filiere =new Filiere(nom3);
        Module_filiere_anneeDao module_filiere = new Module_filiere_anneeDao();
        annee="3eme annee";
        request.setAttribute("modules", module_filiere.recupererModulesdefiliere(filiere,annee));
        this.getServletContext().getRequestDispatcher("/affichage_modules_de_fiiliere.jsp").forward(request, response);}
        }*/
        
        
        /*String nom=request.getParameter("nom_filiere");
        
            
        
        Filiere filiere =new Filiere(nom);
        Module_filiere_anneeDao module_filiere = new Module_filiere_anneeDao();
        
        request.setAttribute("modules", module_filiere.recupererModulesdefiliere(filiere));
        this.getServletContext().getRequestDispatcher("/affichage_modules_de_fiiliere.jsp").forward(request, response);*/
        
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
