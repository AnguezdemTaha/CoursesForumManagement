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
public class QuestionDaoImpl {
    private DAOFactory          daoFactory;

    QuestionDaoImpl( DAOFactory daoFactory ) {
        this.daoFactory = daoFactory;
    }
    /* Implémentation de la méthode trouver() définie dans l'interface UtilisateurDao */
    private static final String SQL_SELECT_COURSE_QUESTIONS = "SELECT * FROM question where course_id = ?";
    //private static final String SQL_SELECT_USER_QUESTION = "SELECT * FROM question where user_id = ?";
    //private static final String SQL_SELECT_TEACHER_MODULES = "SELECT * FROM module where module_id in (SELECT module_id FROM teacher_module WHERE teacher_id = ?)";
    
    private static final String SQL_SELECT_QUESTION = "SELECT * FROM question where question_id = ?";
    
    private static final String SQL_ADD_QUESTION = "INSERT INTO question(`user_id`, `course_id`, `question_content`, `question_date`, `accepted`) VALUES (?, ?, ?, ?, ?)";
    
    private static final String SQL_DELETE_QUESTION = "DELETE FROM question WHERE question_id = ?";

    private static final String SQL_UPDATE_QUESTION = "UPDATE question set user_id = ? and course_id = ? and question_content = ? and question_date = ? and accepted = ? WHERE question_id = ?";
}
