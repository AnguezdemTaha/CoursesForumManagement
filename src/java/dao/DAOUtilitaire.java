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
import com.beans.Answer;
import com.beans.Branch;
import com.beans.Course;
import com.beans.Feedback;
import com.beans.Module;
import com.beans.Question;
import com.beans.Student;
import com.beans.Teacher;
import com.beans.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import org.omg.CORBA.SystemException;

public final class DAOUtilitaire {

    /*
     * Constructeur cachÃ© par dÃ©faut (car c'est une classe finale utilitaire,
     * contenant uniquement des mÃ©thode appelÃ©es de maniÃ¨re statique)
     */
    private DAOUtilitaire() {
    }
    /*
 * Initialise la requête préparée basée sur la connexion passée en argument,
 * avec la requête SQL et les objets donnés.
 */
   
public static PreparedStatement initialisationRequetePreparee( Connection connexion, String sql, boolean returnGeneratedKeys, Object... objets ) throws SQLException {
  
    PreparedStatement preparedStatement = connexion.prepareStatement( sql, returnGeneratedKeys ? Statement.RETURN_GENERATED_KEYS : Statement.NO_GENERATED_KEYS );
    for ( int i = 0; i < objets.length; i++ ) {
        preparedStatement.setObject( i + 1, objets[i] );
    }

    return preparedStatement;
    
}

/*
 * Simple méthode utilitaire permettant de faire la correspondance (le
 * mapping) entre une ligne issue de la table des utilisateurs (un
 * ResultSet) et un bean Utilisateur.
 */
//when select *
public static User mapUser( ResultSet resultSet ) throws SQLException {
    User user = new User();
    user.setId(resultSet.getInt( "id" ));
    user.setF_name(resultSet.getString("f_name" ));
    user.setL_name(resultSet.getString( "l_name" ));
    user.setMail(resultSet.getString("mail" ));
    user.setPassword(resultSet.getString( "password" ));
    user.setPhone(resultSet.getString( "phone" ));
    user.setType(resultSet.getString( "type" ));
    user.setAccepted(resultSet.getString( "accepted" ));
return user;
}

public static Student mapStudent( ResultSet resultSet ) throws SQLException {
    Student user = new Student();
    user.setId(resultSet.getInt( "id" ));
    user.setF_name(resultSet.getString("f_name" ));
    user.setL_name(resultSet.getString( "l_name" ));
    user.setMail(resultSet.getString("mail" ));
    user.setPassword(resultSet.getString( "password" ));
    user.setPhone(resultSet.getString( "phone" ));
    user.setType(resultSet.getString( "type" ));
    user.setAccepted(resultSet.getString( "accepted" ));
    //----
    user.setStudent_year(resultSet.getString( "student_year" ));
    //obj branch
    Branch branch = new Branch();
    branch.setBranch_id(resultSet.getInt( "student_branch_id" ));
    
    user.setStudent_branch(branch);
return user;
}

public static Teacher mapTeacher( ResultSet resultSet ) throws SQLException {
    Teacher user = new Teacher();
    user.setId(resultSet.getInt( "id" ));
    user.setF_name(resultSet.getString("f_name" ));
    user.setL_name(resultSet.getString( "l_name" ));
    user.setMail(resultSet.getString("mail" ));
    user.setPassword(resultSet.getString( "password" ));
    user.setPhone(resultSet.getString( "phone" ));
    user.setType(resultSet.getString( "type" ));
    user.setAccepted(resultSet.getString( "accepted" ));
    //----teacher modules ? : another table
    
    
return user;
}

public static Module mapModule( ResultSet resultSet ) throws SQLException {
    Module module = new Module();
    module.setModule_id(resultSet.getInt( "module_id" ));
    module.setModule_name(resultSet.getString("module_name" ));
    module.setModule_year(resultSet.getString( "module_year" ));
    
    //branch
    Branch branch = new Branch();
    branch.setBranch_id(resultSet.getInt( "student_branch_id" ));
    
    module.setModule_branch(branch);
  
return module;
}

public static Branch mapBracnh( ResultSet resultSet ) throws SQLException {
    Branch branch = new Branch();
    branch.setBranch_id(resultSet.getInt( "branch_id" ));
    branch.setBranch_name(resultSet.getString("branch_name" ));
  
return branch;
}

public static Course mapCourse( ResultSet resultSet ) throws SQLException {
    Course course = new Course();
    course.setCourse_id(resultSet.getInt( "course_id" ));
    course.setCourse_name(resultSet.getString("course_name" ));
    course.setCourse_file(resultSet.getString("course_file" ));
    course.setCours_content(resultSet.getString("course_content" ));
    course.setCourse_date(resultSet.getDate("course_dade" ));
    
    Teacher teacher = new Teacher();
    teacher.setId(resultSet.getInt("teacher_id" ));
    course.setCourse_teacher(teacher);
  
return course;
}

public static Question mapQuestion( ResultSet resultSet ) throws SQLException {
    Question question = new Question();
    question.setQuestion_id(resultSet.getInt( "question_id" ));
    question.setQuestion_content(resultSet.getString("question_content" ));
    question.setQuestion_date(resultSet.getDate("question_date" ));
    question.setQuestion_accepted(resultSet.getString("question_accepted" ));
    
    
    User user = new User();
    user.setId(resultSet.getInt("user_id" ));
    
    Course course = new Course();
    course.setCourse_id(resultSet.getInt("course_id" ));
    
    question.setQuestion_user(user);
    question.setQuestion_course(course);

  
return question;
}

public static Feedback mapFeedback( ResultSet resultSet ) throws SQLException {
    Feedback feedback = new Feedback();
    feedback.setFeedback_id(resultSet.getInt( "feedback_id" ));
    feedback.setFeedback_note(resultSet.getString("feedback_note" ));
    feedback.setFeedback_date(resultSet.getDate("feedback_date" ));
    
    
    
    User user = new User();
    user.setId(resultSet.getInt("user_id" ));
    
    Course course = new Course();
    course.setCourse_id(resultSet.getInt("course_id" ));
    
    feedback.setFeedback_user(user);
    feedback.setFeedback_course(course);

  
return feedback;
}




public static Answer mapAnswer( ResultSet resultSet ) throws SQLException {
    Answer answer = new Answer();
    answer.setAnswer_id(resultSet.getInt( "answer_id" ));
    answer.setAnswer_content(resultSet.getString("answer_content" ));
    answer.setAnswer_date(resultSet.getDate("answer_date" ));
    answer.setAnswer_accepted(resultSet.getString("accepted_accepted" ));
    
    User user = new User();
    user.setId(resultSet.getInt("user_id" ));
    
    Question question = new Question();
    question.setQuestion_id(resultSet.getInt("question_id" ));
    
    answer.setAnswer__user(user);
    answer.setAnswer__question(question);

  
return answer;
}
    

    /* Fermeture silencieuse du resultset */
    public static void fermetureSilencieuse( ResultSet resultSet ) {
        if ( resultSet != null ) {
            try {
                resultSet.close();
            } catch ( SQLException e ) {
                System.out.println( "Ã‰chec de la fermeture du ResultSet : " + e.getMessage() );
            }
        }
    }

    /* Fermeture silencieuse du statement */
    public static void fermetureSilencieuse( Statement statement ) {
        if ( statement != null ) {
            try {
                statement.close();
            } catch ( SQLException e ) {
                System.out.println( "Ã‰chec de la fermeture du Statement : " + e.getMessage() );
            }
        }
    }

    /* Fermeture silencieuse de la connexion */
    public static void fermetureSilencieuse( Connection connexion ) {
        if ( connexion != null ) {
            try {
                connexion.close();
            } catch ( SQLException e ) {
                System.out.println( "Ã‰chec de la fermeture de la connexion : " + e.getMessage() );
            }
        }
    }

    /* Fermetures silencieuses du statement et de la connexion */
    public static void fermeturesSilencieuses( Statement statement, Connection connexion ) {
        fermetureSilencieuse( statement );
        fermetureSilencieuse( connexion );
    }

    /* Fermetures silencieuses du resultset, du statement et de la connexion */
    public static void fermeturesSilencieuses( ResultSet resultSet, Statement statement, Connection connexion ) {
        fermetureSilencieuse( resultSet );
        fermetureSilencieuse( statement );
        fermetureSilencieuse( connexion );
    }

    
}
