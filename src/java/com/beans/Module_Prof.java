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
public class Module_Prof {
    private int id;
    private int id_prof;
    int id_module;
    private int[] id_Profs;
    

    public Module_Prof() {
    }

    public int[] getId_Profs() {
        return id_Profs;
    }
    
    

    public int getId() {
        return id;
    }

    public int getId_prof() {
        return id_prof;
    }

    public int getId_module() {
        return id_module;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setId_prof(int id_prof) {
        this.id_prof = id_prof;
    }

    public void setId_module(int id_module) {
        this.id_module = id_module;
    }

    public void setId_Profs(int[] id_Profs) {
        this.id_Profs = id_Profs;
    }

    

    
    
    
}
