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
public class Professeur extends Utilisateur{
    private int[] id_modules;

    public Professeur() {
    }

    public int[] getId_modules() {
        return id_modules;
    }

    public void setId_modules(int[] id_modules) {
        this.id_modules = id_modules;
    }
    
    
}
