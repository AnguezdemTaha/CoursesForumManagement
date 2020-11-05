/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servlet;

import com.beans.Module;
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
@WebServlet(name = "Adm_ajouter_module", urlPatterns = {"/Adm_ajouter_module"})
public class Adm_ajouter_module extends HttpServlet {

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
            out.println("<title>Servlet Adm_ajouter_module</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Adm_ajouter_module at " + request.getContextPath() + "</h1>");
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
       String nom =request.getParameter("nom");
       String annee=request.getParameter("annee");
       String filiere=request.getParameter("filiere");
       //String[] id_profs =request.getParameterValues("profs");
       
               //getParameterValues("profs");
//       int id =Integer.parseInt(request.getParameter("id"));
       
       
       String type=request.getParameter("type");
       
       Module module =new Module();
       String[] names = request.getParameterValues("profs");
       List list = Arrays.asList(names);
       //for(String s : names) list.add(Integer.valueOf(s));
       // List list = Arrays.asList(names);
	//request.setAttribute("profs", list);
       //module.setId_Profs(request.getParameterValues("profs"));
       module.setNom(request.getParameter("nom"));
       module.setAnnee(request.getParameter("annee"));
       module.setFilier(request.getParameter("filiere"));
       //module.setId(Integer.parseInt(request.getParameter("id")));
       
       Module_filiere_anneeDao module2 = new Module_filiere_anneeDao();
       request.setAttribute("filieres", module2.recupererfilieres());
       UtilisateurDao utilisateur = new UtilisateurDao();
       request.setAttribute("professeurs", utilisateur.recupererProfesseurs());
                
       if(module2.AjouterModule(module, list)){
           String message="Un neuveux module a été ajouté avec succée";
           request.setAttribute("module",list );
           request.setAttribute("message1",message );
                this.getServletContext().getRequestDispatcher("/adm_ajouter_module.jsp").forward(request, response);
                
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
