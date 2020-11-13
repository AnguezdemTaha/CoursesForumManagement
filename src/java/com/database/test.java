/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.database;

import javax.servlet.http.HttpServletRequest;
import org.jboss.weld.module.web.HttpServletRequestBean;

/**
 *
 * @author lm
 */
public class test {
    private String res;
    //methode verifiacation connection
    public void virifier(HttpServletRequest request){
        String nom=request.getParameter("nom");
        String prenom=request.getParameter("prenom");
        if(nom.equals("test")){
           res="connecte" ;
        }
        else{
            res="no";
        }
    }
    

    public String getRes() {
        return res;
    }

    public void setRes(String res) {
        this.res = res;
    }
    
}
