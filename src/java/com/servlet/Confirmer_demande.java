/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servlet;

import com.beans.Utilisateur;
import dao.Module_filiere_anneeDao;
import dao.UtilisateurDao;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author lm
 */
@WebServlet(name = "Confirmer_demande", urlPatterns = {"/Confirmer_demande"})
public class Confirmer_demande extends HttpServlet {

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
            out.println("<title>Servlet Confirmer_demande</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Confirmer_demande at " + request.getContextPath() + "</h1>");
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
        processRequest(request, response);
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
       /*String nom =request.getParameter("nom");
       String prenom=request.getParameter("prenom");
       String email=request.getParameter("email");
       String telephone =request.getParameter("telephone");
       String password =request.getParameter("password");
       int id=Integer.parseInt(request.getParameter("id"));
       
       String type=request.getParameter("type");*/
       
       //Utilisateur utilisateur =new Utilisateur(id,nom,prenom,telephone,email,password,type);
       
       
        String[] names = request.getParameterValues("choix");
        List id_demandes = Arrays.asList(names);
        
        UtilisateurDao utilisateurdao= new UtilisateurDao();
       
        if(utilisateurdao.Confirmerdemande(id_demandes)){
           String message="Vous aves confirmer des demandes avec succée";
           //request.setAttribute("module",list );
           request.setAttribute("message1",message );
              UtilisateurDao utilisateur = new UtilisateurDao();
            request.setAttribute("etudiants", utilisateur.recupererEtudiantsdemande());
            this.getServletContext().getRequestDispatcher("/Adm_etudiant_envoye.jsp").forward(request, response);
                
       }else{
           //this.getServletContext().getRequestDispatcher("/demande_adm.jsp").forward(request, response);
       }
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
