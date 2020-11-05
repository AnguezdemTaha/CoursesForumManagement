/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servlet;


import com.beans.Utilisateur;
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
public class AjouterUtilisateurServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
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
       String prenom=request.getParameter("prenom");
       String email=request.getParameter("email");
       String telephone =request.getParameter("telephone");
       String password =request.getParameter("password");
       
       String type=request.getParameter("type");
       
       Utilisateur utilisateur =new Utilisateur(nom,prenom,telephone,email,password,type);
       
       if(UtilisateurDao.AjouterUtilisateur(utilisateur)){
           String message="Un neuveux utilisateur a été ajouter avec succée";
           request.setAttribute("message1",message );
                this.getServletContext().getRequestDispatcher("/demande_adm.jsp").forward(request, response);
                
       }else{
           this.getServletContext().getRequestDispatcher("/demande_adm.jsp").forward(request, response);
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
 ///// deja fait mais ne fonction pas:
/*

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author lm
 */

//public class Demande_admin extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
   

//    protected void doGet(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
        
        //String message = "Transmission de variables : OK !";
	//request.setAttribute( "test", message );
        
        // request.setAttribute("heure", "jour");
        
        
 //       this.getServletContext().getRequestDispatcher("demande_adm.jsp").forward(request, response);
        
	//this.getServletContext().getRequestDispatcher("/WEB-INF/demande_adm.jsp").forward( request, response );
       // this.getServletContext().getRequestDispatcher("/WEB-INF/demande_adm.jsp").forward(request, response);
        
//    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
//    protected void doPost(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
        /*
        Etudiant etudiant = new Etudiant();
        etudiant.setNom(request.getParameter("nom"));
        etudiant.setPrenom(request.getParameter("prenom"));
        etudiant.setEmail(request.getParameter("email"));
        try {
            //etudiant.setTelephone(request.getParameter("telephone"));
            EtudiantDao.AjouterEtudiant(etudiant);
        } catch (SQLException ex) {
            Logger.getLogger(Demande_admin.class.getName()).log(Level.SEVERE, null, ex);
        }
        
         this.getServletContext().getRequestDispatcher("/WEB-INF/demande_adm.jsp").forward(request, response);
    */
        //String nom=request.getParameter("nom");
        //request.setAttribute("nom", nom);
      //  test test1 = new test();
      // test1.virifier(request);
      //  request.setAttribute("test1", test1);
       // response.setContentType("text/html");
        //PrintWriter printWriter=response.getWriter();
        
        //String telephone = request.getParameter("telephone");
        
        
        
        
       
  
            // Initialize the database 
            
  
            // Create a SQL query to insert data into demo table 
            // demo table consists of two columns, so two '?' is used 
            
        
        
            
            
            
            
            //Etudiant etudiant = new Etudiant();
            //etudiant.setPrenom(nom);
            /*try {
            etudiant.setTelephone(request.getParameter("nom"));
            EtudiantDao.AjouterEtudiant(etudiant);
            
            } catch (Exception ex) {
            Logger.getLogger(Demande_admin.class.getName()).log(Level.SEVERE, null, ex);
            }*/
            
            //request.getRequestDispatcher("demande_adm.jsp");
            //request.setAttribute("etudiant1", etudiant);
        
	
        
        //PrintWriter out = response.getWriter(); 
          //  out.println("<html><body><b>Successfully Inserted"
            //            + "</b></body></html>");
        
       // this.getServletContext().getRequestDispatcher( "/demande_adm.jsp" ).forward( request, response );
//}
    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
   
 //   public String getServletInfo() {
 //       return "Short description";
 //   }// </editor-fold>

//}


