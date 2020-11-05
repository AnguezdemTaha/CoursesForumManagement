/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servlet;

import com.beans.Filiere;
import com.beans.Module;
import com.beans.Utilisateur;
import dao.Module_filiere_anneeDao;
import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet(name = "coursprof", urlPatterns = {"/coursprof"})
public class coursprof extends HttpServlet {

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
            out.println("<title>Servlet coursprof</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet coursprof at " + request.getContextPath() + "</h1>");
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
        //de meem il fout post mybe 
       /* int prof_id=Integer.parseInt(request.getParameter("utilisateur7")); //avec la session a voir apres
        String modul=request.getParameter("module");     
        Utilisateur utilisateur =new Utilisateur();
        Module module=new Module();
        
        utilisateur.setId(prof_id);
        module.setNom(modul);
        
        Module_filiere_anneeDao cours = new Module_filiere_anneeDao();
        request.setAttribute("courss", cours.recupererCoursmoduleprof(module ,utilisateur));
        this.getServletContext().getRequestDispatcher("/cours.jsp").forward(request, response);*/
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
        
        //String nom="PFA";
        
         String nom_m=request.getParameter("module");
         
      
         //String nom="PFA";
        Utilisateur utilisateur =new Utilisateur();
        Module module=new Module();
        
        HttpSession session = request.getSession();
        session.setAttribute("nom", nom_m);
        
        utilisateur =(Utilisateur)session.getAttribute("utilisateur7");
        
        module.setNom(nom_m);
        //utilisateur.setId(2);
        
        Module_filiere_anneeDao module_filiere = new Module_filiere_anneeDao();
        request.setAttribute("modules", module_filiere.recupererModulesprof(utilisateur));
        Module_filiere_anneeDao cours = new Module_filiere_anneeDao();
        request.setAttribute("courss", cours.recupererCoursmoduleprof(module ,utilisateur));
        this.getServletContext().getRequestDispatcher("/coursp.jsp").forward(request, response);
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
