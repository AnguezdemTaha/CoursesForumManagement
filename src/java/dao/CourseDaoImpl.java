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
public class CourseDaoImpl implements CourseDao{
    private DAOFactory          daoFactory;

    CourseDaoImpl( DAOFactory daoFactory ) {
        this.daoFactory = daoFactory;
    }
    /* Implémentation de la méthode trouver() définie dans l'interface UtilisateurDao */
    private static final String SQL_SELECT_TEACHER_COURSES = "SELECT * FROM course where teacher_id = ?";
    private static final String SQL_SELECT_MODULE_COURSES = "SELECT * FROM course where course_id in (SELECT course_id FROM course_module WHERE module_id = ?)";
    
    private static final String SQL_SELECT_COURSE = "SELECT * FROM course where course_id = ?";
    
    private static final String SQL_ADD_COURSE = "INSERT INTO course(`teacher_id`, `course_name`, `course_date`, `course_content`, `course_file`) VALUES (?, ?, ?, ?, ?)";
    
    private static final String SQL_DELETE_COURSE = "DELETE FROM course WHERE course_id = ?";

    private static final String SQL_UPDATE_COURSE = "UPDATE course set teacher_id = ?, course_name = ?, course_date = ?,  = ?, course_content = ?, course_file = ? WHERE course_id = ?";
   
}
