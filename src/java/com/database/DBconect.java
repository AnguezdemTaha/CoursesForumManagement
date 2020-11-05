/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author lm
 */
public class DBconect {
   
    public  static Connection connecte()throws SQLException, ClassNotFoundException {
       
    
		  
        Class.forName("com.mysql.jdbc.Driver");  
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/gestion_de_cours","root","");   
			  
                       
			
		
        return con;
                
   
		
}

   
}
