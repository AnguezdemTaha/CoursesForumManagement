/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servlet;

import com.beans.Module;
import com.beans.Course;
import com.beans.User;
import static com.sun.xml.internal.ws.spi.db.BindingContextFactory.LOGGER;
import com.database.Module_filiere_anneeDao;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.logging.Level;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

/**
 *
 * @author lm
 */
@WebServlet(name = "Ajouter_cours", urlPatterns = {"/Ajouter_cours"})
@MultipartConfig(maxFileSize = 16177215)
public class Ajouter_cours extends HttpServlet {

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
            out.println("<title>Servlet Ajouter_cours</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Ajouter_cours at " + request.getContextPath() + "</h1>");
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
        
        int id =Integer.parseInt(request.getParameter("id_m"));
        String nom =request.getParameter("nom");
        
        Part filePart = request.getPart("file");
        
        //String annee=request.getParameter("annee");
        //String filiere=request.getParameter("filiere");
        
        String contenu=request.getParameter("contenu");
       
       Module module =new Module();
       module.setId(id);
       
       Course cours=new Course();
       //cours.setId_cours(id);
       cours.setNom_cours(nom);
       User prof=new User();
       HttpSession session = request.getSession();
       prof=(User) session.getAttribute("utilisateur7");
       InputStream inputStream = null;
       if (filePart != null) {
            // prints out some information for debugging
            System.out.println(filePart.getName());
            System.out.println(filePart.getSize());
            System.out.println(filePart.getContentType());
             
            // obtains input stream of the upload file
            inputStream = filePart.getInputStream();
        }
     
       
       if(Module_filiere_anneeDao.AjouterCours(cours, module ,prof,inputStream )){
           
           //String message="Votre cours a été ajouter avec succée";
           //request.setAttribute("message1",message );
           final String path ="C:\\Users\\lm\\Documents\\NetBeansProjects\\mavenproject2\\ProjetS3\\web\\Les cours";
           final String fileName = nom+".pdf";

            OutputStream out = null;
            InputStream filecontent = null;
            //final PrintWriter writer = response.getWriter();

    try {
        out = new FileOutputStream(new File(path + File.separator
                + fileName));
        filecontent = filePart.getInputStream();

        int read = 0;
        final byte[] bytes = new byte[1024];

        while ((read = filecontent.read(bytes)) != -1) {
            out.write(bytes, 0, read);
        }
        String message="Votre cours a été ajouter avec succée";
        request.setAttribute("message1",message );
        //LOGGER.log(Level.INFO, "File{0}being uploaded to {1}", 
          //      new Object[]{fileName, path});
          
        this.getServletContext().getRequestDispatcher("/prof_ajouter_cours.jsp").forward(request, response);
    } catch (FileNotFoundException fne) {
        String message4="Vous devez choisir un cours";
        //writer.println("<br/> ERROR: " + fne.getMessage());

        //LOGGER.log(Level.SEVERE, "Problems durant le telechargement de fichier. Error: {0}", 
          //      new Object[]{fne.getMessage()});
    } finally {
        if (out != null) {
            out.close();
        }
        if (filecontent != null) {
            filecontent.close();
        }
        //if (writer != null) {
            //writer.close();
        //}
    }
                
                
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
