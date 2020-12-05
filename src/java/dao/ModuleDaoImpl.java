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
public class ModuleDaoImpl implements ModuleDao{
    private DAOFactory          daoFactory;

    ModuleDaoImpl( DAOFactory daoFactory ) {
        this.daoFactory = daoFactory;
    }
    /* Implémentation de la méthode trouver() définie dans l'interface UtilisateurDao */
    private static final String SQL_SELECT_BRANCH_MODULES = "SELECT * FROM module where module_id in (SELECT module_id FROM module_branch WHERE branch_id = ?)";
    private static final String SQL_SELECT_TEACHER_MODULES = "SELECT * FROM module where module_id in (SELECT module_id FROM teacher_module WHERE teacher_id = ?)";
    
    private static final String SQL_SELECT_MODULE = "SELECT * FROM module where module_id = ?";
    
    private static final String SQL_ADD_MODULE = "INSERT INTO module(`module_name`, `module_year`) VALUES (?, ?, ?)";
    
    private static final String SQL_DELETE_MODULE = "DELETE FROM module WHERE module_id = ?";

    private static final String SQL_UPDATE_MODULE = "UPDATE module set module_name = ?, module_year = ? WHERE module_id = ?";
   
}
