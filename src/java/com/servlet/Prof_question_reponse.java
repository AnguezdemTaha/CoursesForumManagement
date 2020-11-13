/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servlet;

import com.beans.User;
import com.database.Module_filiere_anneeDao;
import com.database.UtilisateurDaoo;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
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
@WebServlet(name = "Prof_question_reponse", urlPatterns = {"/Prof_question_reponse"})
public class Prof_question_reponse extends HttpServlet {

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
            out.println("<title>Servlet Prof_question_reponse</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Prof_question_reponse at " + request.getContextPath() + "</h1>");
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
        String[] names = request.getParameterValues("choix");
        List id_questions = Arrays.asList(names);
        
         Module_filiere_anneeDao utilisateurdao = new Module_filiere_anneeDao();
       HttpSession session = request.getSession();
       if(request.getParameter("supprimer") != null){
        if(utilisateurdao.Supprimerquestion(id_questions)){
           String message="Vous aves supprimer des questions avec succée";
           //request.setAttribute("module",list );
           request.setAttribute("message1",message );
           
         User u =(User) session.getAttribute("utilisateur7");
              Module_filiere_anneeDao m = new Module_filiere_anneeDao();
        
            session.setAttribute("Questionsvn", m.recupererquestionprof(u));
            this.getServletContext().getRequestDispatcher("/prof_question_reponse.jsp").forward(request, response);
                
       }else{
           //this.getServletContext().getRequestDispatcher("/demande_adm.jsp").forward(request, response);
       }
       }
       else{
           if(request.getParameter("valider") != null){
               if(utilisateurdao.Confirmerquestion(id_questions)){
           String message="Vous aves confirmer des questions avec succée";
           //request.setAttribute("module",list );
           request.setAttribute("message1",message );
           
         User u =(User) session.getAttribute("utilisateur7");
             Module_filiere_anneeDao m = new Module_filiere_anneeDao();       
            session.setAttribute("Questionsvn", m.recupererquestionprof(u));
            this.getServletContext().getRequestDispatcher("/prof_question_reponse.jsp").forward(request, response);
                
            }else{
           //this.getServletContext().getRequestDispatcher("/demande_adm.jsp").forward(request, response);
             }
           }
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
