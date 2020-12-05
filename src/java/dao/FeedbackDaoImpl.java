/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

/**
 *
 * @author lm
 */
public class FeedbackDaoImpl implements FeedbackDao{
    private DAOFactory          daoFactory;

    FeedbackDaoImpl( DAOFactory daoFactory ) {
        this.daoFactory = daoFactory;
    }
    /* Implémentation de la méthode trouver() définie dans l'interface UtilisateurDao */
    private static final String SQL_SELECT_COURSE_FFEDBACKS = "SELECT * FROM feedback where feedback_id = ?";
    //private static final String SQL_SELECT_USER_QUESTION = "SELECT * FROM question where user_id = ?";
    //private static final String SQL_SELECT_TEACHER_MODULES = "SELECT * FROM module where module_id in (SELECT module_id FROM teacher_module WHERE teacher_id = ?)";
    
    private static final String SQL_SELECT_FFEDBACK = "SELECT * FROM feedback where feedback_id = ?";
    
    private static final String SQL_ADD_FFEDBACK = "INSERT INTO feedback(`user_id`, `course_id`, `feedback_content`, `feedback_date`) VALUES (?, ?, ?, ?)";
    

}
