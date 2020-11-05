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
public class Questions {
    private String contenu;
    private int id;
    private String date;
    private int accepte;
    private int id_cours;
    private int id_etudaint;

    public Questions(String contenu, int id, String date, int accepte) {
        this.contenu = contenu;
        this.id = id;
        this.date = date;
        this.accepte = accepte;
    }

    public Questions() {
    }

    public int getId_cours() {
        return id_cours;
    }

    public int getId_etudaint() {
        return id_etudaint;
    }

    public void setId_cours(int id_cours) {
        this.id_cours = id_cours;
    }

    public void setId_etudaint(int id_etudaint) {
        this.id_etudaint = id_etudaint;
    }
    
    

    
    public String getContenu() {
        return contenu;
    }

    public int getId() {
        return id;
    }

    public String getDate() {
        return date;
    }

    public int getAccepte() {
        return accepte;
    }

    public void setContenu(String contenu) {
        this.contenu = contenu;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setAccepte(int accepte) {
        this.accepte = accepte;
    }
    
    
    
}
