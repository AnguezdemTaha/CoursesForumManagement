/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servlet;

import com.beans.Question;
import com.beans.User;
import com.beans.Course;
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
@WebServlet(name = "Ajouter_question", urlPatterns = {"/Ajouter_question"})
public class Ajouter_question extends HttpServlet {

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
            out.println("<title>Servlet Ajouter_question</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Ajouter_question at " + request.getContextPath() + "</h1>");
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
        
        Module_filiere_anneeDao module_filiere = new Module_filiere_anneeDao();
                    //request.setAttribute("filieres", module_filiere.recupererfilieres());
                    //String annee="1er annee";
                    //request.setAttribute("modules", module_filiere.recupererModulesannee(annee));
        String contenu=request.getParameter("question");
        
        HttpSession session = request.getSession(true);
        //Utilisateur utilisateur = (Utilisateur) session.getAttribute("utilisateur7");
        
        User u =new User();
        u.setId(1);
        
        //Cours c=new Cours();
        //c.setId_cours(1);
        
        Course cours = (Course) session.getAttribute("cours7");
        

        Question question=new Question();
        question.setContenu(contenu);
        if(Module_filiere_anneeDao.Ajouterquestion(cours, u, question)){
           String message="Un neuveux question été ajouter avec succée";
           request.setAttribute("message1",message );
          
          

           //HttpSession session = request.getSession(true);
           //Cours cours =(Cours) session.getAttribute("cours7");
        session.setAttribute("cours7", cours);
        Map<Question, List<Answer>> map4 = new HashMap<>();
        //map4=(Map<Questions, List<Reponses>>) session.getAttribute("maps4");
        
        
        Module_filiere_anneeDao cours1 = new Module_filiere_anneeDao();
        List<Question> questioncourss=new ArrayList<Question>();
        questioncourss=cours1.recupererCoursmodulequestion(cours);
        
        request.setAttribute("questioncourss", cours1.recupererCoursmodulequestion(cours));
        
        
         
        for(Question q :questioncourss){                   
            List<Answer> repons= cours1.recupererreponsequestion(q);
            map4.put(q, repons);
        }
        session.setAttribute("maps4", map4);
            
        
        //request.setAttribute("questioncourss", cours1.recupererCoursmodulequestion(cours));
                this.getServletContext().getRequestDispatcher("/question_cours.jsp").forward(request, response);
                //response.sendRedirect("question_cours.jsp");
       }else{
           //this.getServletContext().getRequestDispatcher("/demande_adm.jsp").forward(request, response);
       }
        //Cours cours=new Cours();
        
        //Utilisateur utilisateur=new Utilisateur();
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
