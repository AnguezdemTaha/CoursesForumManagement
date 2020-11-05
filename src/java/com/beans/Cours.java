/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beans;

import java.sql.Blob;

/**
 *
 * @author lm
 */
public class Cours {
    int id_cours ;
    int id_prof ;
    int id_module ;
    String nom_cours ;
    int contenu_cours ;//fichier
    String date_cours ;
    Blob file_cours;

    public Cours(int id_cours, int id_prof, int id_module, String nom_cours, int contenu_cours, String date_cours) {
        this.id_cours = id_cours;
        this.id_prof = id_prof;
        this.id_module = id_module;
        this.nom_cours = nom_cours;
        this.contenu_cours = contenu_cours;
        this.date_cours = date_cours;
    }

    public Blob getFile_cours() {
        return file_cours;
    }

    public void setFile_cours(Blob file_cours) {
        this.file_cours = file_cours;
    }

    
    public Cours(int id_cours) {
        this.id_cours = id_cours;
    }

    
    public Cours() {
    }

    

    public int getId_cours() {
        return id_cours;
    }

    public int getId_prof() {
        return id_prof;
    }

    public int getId_module() {
        return id_module;
    }

    public String getNom_cours() {
        return nom_cours;
    }

    public int getContenu_cours() {
        return contenu_cours;
    }

    public String getDate_cours() {
        return date_cours;
    }

    public void setId_cours(int id_cours) {
        this.id_cours = id_cours;
    }

    public void setId_prof(int id_prof) {
        this.id_prof = id_prof;
    }

    public void setId_module(int id_module) {
        this.id_module = id_module;
    }

    public void setNom_cours(String nom_cours) {
        this.nom_cours = nom_cours;
    }

    public void setContenu_cours(int contenu_cours) {
        this.contenu_cours = contenu_cours;
    }

    public void setDate_cours(String date_cours) {
        this.date_cours = date_cours;
    }
    
    
    
    
}
