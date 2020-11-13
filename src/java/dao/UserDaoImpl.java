/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import com.beans.User;
import static dao.DAOUtilitaire.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author lm
 */
public class UserDaoImpl implements UserDao {
    private DAOFactory          daoFactory;

    UserDaoImpl( DAOFactory daoFactory ) {
        this.daoFactory = daoFactory;
    }
    /* Implémentation de la méthode trouver() définie dans l'interface UtilisateurDao */
    private static final String SQL_SELECT_ALL_STUDENTS = "SELECT * FROM user INNER JOIN student ON user.id = student.user_id where user.accepted = ?";
    private static final String SQL_SELECT_ALL_TEACHERS = "SELECT * FROM user INNER JOIN tacher ON user.id = teacher.user_id where user.accepted = ?";
    private static final String SQL_SELECT_ALL_STUDENTS_DEMANDS = "SELECT * FROM user INNER JOIN student ON user.id = student.user_id where user.accepted = ?";
    private static final String SQL_SELECT_ALL_TEACHERS_USERS = "SELECT * FROM user INNER JOIN tacher ON user.id = teacher.user_id where user.accepted = ?";
    private static final String SQL_SELECT_LOGIN = "SELECT * FROM user where mail = ? and pass = ?";
    private static final String SQL_SELECT_TEAHCER_COURSES = "SELECT * FROM course where teacher_id = ?";
    private static final String SQL_SELECT_STUDENT_BRANCH = "SELECT * FROM branch where branch_id = (SELECT branch_id FROM student WHERE student_id = ? limit 1)";
    private static final String SQL_SELECT_TEAHCER_MODULES = "SELECT * FROM module where modul_id in (SELECT module_id FROM teacher_module WHERE teacher_id = ?)";
    
    private static final String SQL_SEND_USER = "INSERT INTO user(`f_name`, `l_name`, `mail`, `phone`, `password`, `type`, `accepted`) VALUES (?, ?, ?, ?, ?, ?, ?)";
    private static final String SQL_SEND_STUDENT_DEMAND = "INSERT INTO student(`student_id`, `student_year`, `student_branch_id`) VALUES (?, ?, ?)";
    private static final String SQL_ACCEPT_TEACHER_DEMAND = "INSERT INTO teacher(`teacher_id`) VALUES (?)";
    private static final String SQL_ACCEPT_USER = "UPDATE user set accepted = ? WHERE id = ?";
    
    private static final String SQL_DELETE_USER = "DELETE FROM user WHERE id = ?";
    private static final String SQL_DELETE_STUDENT = "DELETE FROM student WHERE student_id = ?";
    private static final String SQL_DELETE_TEACHER = "DELETE FROM teacher WHERE teacher_id = ?";
    
    private static final String SQL_UPDATE_USER = "UPDATE user set f_name = ?, l_name = ?, mail = ?,  = ?, phone = ?, password = ?, type = ?, accepted = ? WHERE id = ?";
    private static final String SQL_UPDATE_STUDENT = "UPDATE student set student_year = ?, student_bracnh_id = ? WHERE student_id = ?";
    //sql_update_teacher after adding attrs to teacher 
    
    private static final String SQL_UPDATE_TEACHER_ADD_MODULES = "INSERT INTO teacher_module(`teacher_id`, `module_id`) VALUES (?, ?)";
    

/* Implémentation de la méthode définie dans l'interface UtilisateurDao */
@Override
public User trouver( String nom ) throws DAOException {
    Connection connexion = null;
    PreparedStatement preparedStatement = null;
    ResultSet resultSet = null;
    User utilisateur = null;

    try {
        /* Récupération d'une connexion depuis la Factory */
        System.out.print("we are on the touver !!!!!!!!!");
        connexion = daoFactory.getConnection();
        System.out.print("connexion from factory is here !!!!!!!!!");
        preparedStatement = initialisationRequetePreparee( connexion, SQL_SELECT_PAR_EMAIL, false, nom );
        resultSet = preparedStatement.executeQuery();
        /* Parcours de la ligne de données de l'éventuel ResulSet retourné */
        
        if ( resultSet.next() ) {
            System.out.println("dao.UtilisateurDaoImpl.trouver()");
            
            utilisateur = dao.DAOUtilitaire.map( resultSet );
        }
    
    }   catch (SQLException ex) {
            Logger.getLogger(UserDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
        fermeturesSilencieuses( resultSet, preparedStatement, connexion );
    }

    return utilisateur;
}

    private static final String SQL_INSERT = "INSERT INTO Utilisateur (email, mot_de_passe, nom, date_inscription) VALUES (?, ?, ?, NOW())";

/* Implémentation de la méthode définie dans l'interface UtilisateurDao */
@Override
public void creer( User utilisateur ) throws DAOException {
    Connection connexion = null;
    PreparedStatement preparedStatement = null;
    ResultSet valeursAutoGenerees = null;

    try {
        /* Récupération d'une connexion depuis la Factory */
        connexion = daoFactory.getConnection();
        preparedStatement = initialisationRequetePreparee( connexion, SQL_INSERT, true, utilisateur.getMail(), utilisateur.getPassword(), utilisateur.getF_name());
        int statut = preparedStatement.executeUpdate();
        /* Analyse du statut retourné par la requête d'insertion */
        if ( statut == 0 ) {
            throw new DAOException( "Échec de la création de l'utilisateur, aucune ligne ajoutée dans la table." );
        }
        /* Récupération de l'id auto-généré par la requête d'insertion */
        valeursAutoGenerees = preparedStatement.getGeneratedKeys();
        if ( valeursAutoGenerees.next() ) {
            /* Puis initialisation de la propriété id du bean Utilisateur avec sa valeur */
            utilisateur.setId((int) valeursAutoGenerees.getLong( 1 ));
        } else {
            throw new DAOException( "Échec de la création de l'utilisateur en base, aucun ID auto-généré retourné." );
        }
    } catch ( SQLException e ) {
        throw new DAOException( e );
    } finally {
        fermeturesSilencieuses( valeursAutoGenerees, preparedStatement, connexion );
    }
}


}
