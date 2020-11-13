/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import com.beans.User;

/**
 *
 * @author lm
 */
public interface UserDao {

    void creer( User utilisateur ) throws DAOException;

    User trouver( String email ) throws DAOException;

}
