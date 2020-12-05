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
public class AnswerDaoImpl implements AnswerDao{
    private DAOFactory          daoFactory;

    AnswerDaoImpl( DAOFactory daoFactory ) {
        this.daoFactory = daoFactory;
    }
    /* Implémentation de la méthode trouver() définie dans l'interface UtilisateurDao */
    private static final String SQL_SELECT_QUESTION_ANSWERS = "SELECT * FROM answer where answer_id = ?";
    //private static final String SQL_SELECT_User_QUESTION = "SELECT * FROM question where user_id = ?";
    //private static final String SQL_SELECT_TEACHER_MODULES = "SELECT * FROM module where module_id in (SELECT module_id FROM teacher_module WHERE teacher_id = ?)";
    
    private static final String SQL_SELECT_QUESTION = "SELECT * FROM answer where answer_id = ?";
    
    private static final String SQL_ADD_QUESTION = "INSERT INTO answer(`user_id`, `question_id`, `answer_content`, `answer_date`, `accepted`) VALUES (?, ?, ?, ?, ?)";
    
    private static final String SQL_DELETE_QUESTION = "DELETE FROM answer WHERE answer_id = ?";

    private static final String SQL_UPDATE_QUESTION = "UPDATE answer set user_id = ? and question_id = ? and answer_content = ? and answer_date = ? and accepted = ? WHERE answer_id = ?";
}
