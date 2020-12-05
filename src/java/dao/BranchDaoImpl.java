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
public class BranchDaoImpl implements BranchDao{
    private DAOFactory          daoFactory;

    BranchDaoImpl( DAOFactory daoFactory ) {
        this.daoFactory = daoFactory;
    }
    /* Implémentation de la méthode trouver() définie dans l'interface UtilisateurDao */
    //private static final String SQL_SELECT_BRANCH_MODULES = "SELECT * FROM module where module_id in (SELECT module_id FROM module_branch WHERE branch_id = ?)";
    //private static final String SQL_SELECT_TEACHER_MODULES = "SELECT * FROM module where module_id in (SELECT module_id FROM teacher_module WHERE teacher_id = ?)";
    
    private static final String SQL_SELECT_BRANCH = "SELECT * FROM branch where branch_id = ?";
    
    private static final String SQL_ADD_BRANCH = "INSERT INTO branch(`branch_name`) VALUES (?, ?, ?)";
    
    private static final String SQL_DELETE_BRANCH = "DELETE FROM branch WHERE branch_id = ?";

    private static final String SQL_UPDATE_BRANCH = "UPDATE branch set branch_name = ? WHERE branch_id = ?";
   
}
