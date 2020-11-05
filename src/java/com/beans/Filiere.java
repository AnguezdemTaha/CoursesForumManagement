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
public class Filiere {
    private int id;
    private String nom ;
    

    public Filiere( String nom) {
        
        this.nom = nom;
        
    }

    public Filiere() {
    }

    

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    

    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    
    
    
    
}
