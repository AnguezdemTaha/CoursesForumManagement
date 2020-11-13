/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servlet;

import com.beans.Course;
import com.beans.Filiere;
import com.beans.Module;
import com.beans.Question;
import com.beans.Answer;
import com.database.Module_filiere_anneeDao;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
@WebServlet(name = "Coursquestion", urlPatterns = {"/Coursquestion"})
public class Coursquestion extends HttpServlet {

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
            out.println("<title>Servlet Coursquestion</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Coursquestion at " + request.getContextPath() + "</h1>");
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
        int id=Integer.parseInt(request.getParameter("idcours"));
        String nom=request.getParameter("nomcours");
        Course cours=new Course();
        cours.setId_cours(id);
        cours.setNom_cours(nom);
        
        if(request.getParameter("qs") != null){
        Map<Question, List<Answer>> map4 = new HashMap<>();
        
        
        HttpSession session = request.getSession();
        session.setAttribute("cours7", cours);
        
        Module_filiere_anneeDao cours1 = new Module_filiere_anneeDao();
        List<Question> questioncourss=new ArrayList<Question>();
        questioncourss=cours1.recupererCoursmodulequestion(cours);
        
        request.setAttribute("questioncourss", cours1.recupererCoursmodulequestion(cours));
        
        
         
        for(Question q :questioncourss){                   
            List<Answer> repons= cours1.recupererreponsequestion(q);
            map4.put(q, repons);
        }
        session.setAttribute("maps4", map4);
        //int idcours=Integer.parseInt(request.getParameter("idcours"));
        
       // Cours cour = new Cours(idcours);
        
        //request.setAttribute("questions", cours.recupererquestionCours(cour));
        this.getServletContext().getRequestDispatcher("/question_cours.jsp").forward(request, response);}
        else{
            if(request.getParameter("supprimer") != null){
                if(Module_filiere_anneeDao.Supprimercours(id)){this.getServletContext().getRequestDispatcher("/coursp.jsp").forward(request, response);}
                else{}
                
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
