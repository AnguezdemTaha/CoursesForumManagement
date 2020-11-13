/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servlet;

import com.beans.User;
import com.forms.InscriptionForm;
import dao.DAOFactory;
import dao.UserDaoImpl;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import dao.UserDao;

/**
 *
 * @author lm
 */
public class DaoServlet extends HttpServlet {

    public static final String CONF_DAO_FACTORY = "daofactory";
    public static final String ATT_USER         = "utilisateur";
    public static final String ATT_FORM         = "form";
    public static final String VUE              = "/daotest.jsp";

    private UserDao     utilisateurDao;
    private DAOFactory          daoFactory;
    
    

    public void init() throws ServletException {
        this.daoFactory = DAOFactory.getInstance();
        /* Récupération d'une instance de notre DAO Utilisateur (impl)*/ //normaly its shoul be initialized but not worked for me
        this.utilisateurDao = (UserDao) ( daoFactory ).getUtilisateurDao();
    }

    public void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException {
        /* Affichage de la page d'inscription */
        User u1 =new User();
        u1=utilisateurDao.trouver("ahmed");
        
        

        /* Stockage du formulaire et du bean dans l'objet request */
        /*request.setAttribute( ATT_FORM, form );
        request.setAttribute( ATT_USER, utilisateur );*/
        int test=u1.getId();
        request.setAttribute( "msg", test );
        this.getServletContext().getRequestDispatcher( VUE ).forward( request, response );
    }

    public void doPost( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException {
        /* Préparation de l'objet formulaire */
        //InscriptionForm form = new InscriptionForm( utilisateurDao );

        /* Traitement de la requête et récupération du bean en résultant */
        User u1 =new User();
        u1=utilisateurDao.trouver("sara" );
        
        

        /* Stockage du formulaire et du bean dans l'objet request */
        /*request.setAttribute( ATT_FORM, form );
        request.setAttribute( ATT_USER, utilisateur );*/
        String test=u1.getMail();
        request.setAttribute( "msg", test );
        
        this.getServletContext().getRequestDispatcher( VUE ).forward( request, response );
    }

}
