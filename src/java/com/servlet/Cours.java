/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servlet;

import com.beans.Module;
import com.database.Module_filiere_anneeDao;
import com.database.UtilisateurDaoo;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author lm
 */
@WebServlet(name = "Cours", urlPatterns = {"/Cours"})
public class Cours extends HttpServlet {

   

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
            out.println("<title>Servlet Cours</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Cours at " + request.getContextPath() + "</h1>");
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
        
        String nom =request.getParameter("nom_module");
        String annee =request.getParameter("annee");
        //String nom="PFA";
        Module module =new Module();
        module.setNom(nom);
        HttpSession session = request.getSession();
        session.setAttribute("nom", nom);
            
        Module_filiere_anneeDao cours = new Module_filiere_anneeDao();
        
        Module_filiere_anneeDao module_filiere = new Module_filiere_anneeDao();
        //request.setAttribute("filieres", module_filiere.recupererfilieres());
        //String annee="1er annee";
        //request.setAttribute("modules", module_filiere.recupererModulesannee(annee));
                    
        
        List<com.beans.Course> courss= cours.recupererCoursmodule(module, annee);
        request.setAttribute("courss", cours.recupererCoursmodule(module, annee));
        
        
        this.getServletContext().getRequestDispatcher("/cours.jsp").forward(request, response);
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
