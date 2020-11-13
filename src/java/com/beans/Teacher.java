/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beans;

import java.util.ArrayList;

/**
 *
 * @author lm
 */
public class Teacher extends User{
    
    private ArrayList<Module> teacher_modules;

    public Teacher() {
    }

    public Teacher(ArrayList<Module> teacher_modules, String nom, String prenom, String telephone, String email, String password, String type, String accepted) {
        super(nom, prenom, telephone, email, password, type, accepted);
        this.teacher_modules = teacher_modules;
    }

    public Teacher(ArrayList<Module> teacher_modules) {
        this.teacher_modules = teacher_modules;
    }

    public ArrayList<Module> getTeacher_modules() {
        return teacher_modules;
    }

    public void setTeacher_modules(ArrayList<Module> teacher_modules) {
        this.teacher_modules = teacher_modules;
    }
    
    
    
    
    
}
