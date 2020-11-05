/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beans;

/**
 *
 * @author lm
 */
public class Module {
    private int id;
    private String nom ;
    private String annee ;
    private String filier ;
/*
    public Module(int id, String nom, String annee, String filier, String[] id_Profs) {
        this.id = id;
        this.nom = nom;
        this.annee = annee;
        this.filier = filier;
        this.id_Profs = id_Profs;
    }
*/
    

    public Module() {
    }

    

    /*public String[] getId_Profs() {
        return id_Profs;
    }*/

    public Module(String id, String nom, String annee, String filiere) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

    

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getAnnee() {
        return annee;
    }

    public String getFilier() {
        return filier;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setAnnee(String annee) {
        this.annee = annee;
    }

    public void setFilier(String filier) {
        this.filier = filier;
    }

    public void setId(int id) {
        this.id = id;
    }

    /*public void setId_Profs(String[] id_Profs) {
        this.id_Profs = id_Profs;
    }*/
    
    
    
}
