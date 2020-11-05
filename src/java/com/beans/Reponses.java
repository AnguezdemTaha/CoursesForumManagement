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
public class Reponses {
    private String contenu;
    private int id;
    private String date;
    private int accepte;
    private int id_question;
    private int id_etudaint;
    private int id_reponse;

    public Reponses() {
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

    public int getId_question() {
        return id_question;
    }

    public int getId_etudaint() {
        return id_etudaint;
    }

    public int getId_reponse() {
        return id_reponse;
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

    public void setId_question(int id_cours) {
        this.id_question = id_cours;
    }

    public void setId_etudaint(int id_etudaint) {
        this.id_etudaint = id_etudaint;
    }

    public void setId_reponse(int id_reponse) {
        this.id_reponse = id_reponse;
    }
    
    
}
