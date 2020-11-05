/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servlet;


import com.beans.Utilisateur;
import com.sun.xml.rpc.processor.modeler.j2ee.xml.paramValueType;
import dao.UtilisateurDao;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author lm
 */
public class Demande_admin extends HttpServlet {

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
       String nom =request.getParameter("nom");
       String prenom=request.getParameter("prenom");
       String email=request.getParameter("email");
       String telephone =request.getParameter("telephone");
       String password =request.getParameter("password");
      // int id=Integer.parseInt(request.getParameter("id"));
       
       String type=request.getParameter("type");
       
       Utilisateur utilisateur =new Utilisateur(nom,prenom,telephone,email,password,type);
       
       if(UtilisateurDao.AjouterUtilisateur(utilisateur)){
           String message="Un neuveux etudiant a été ajouter avec succée";
           request.setAttribute("message1",message );
                this.getServletContext().getRequestDispatcher("/demande_adm.jsp").forward(request, response);
                
       }else{
           //this.getServletContext().getRequestDispatcher("/demande_adm.jsp").forward(request, response);
       }
       
      
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