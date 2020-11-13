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
public class User {
    
    protected int id;
    protected String f_name ;
    protected String l_name ;
    protected String phone ;
    protected String mail ;
    protected String password;
    protected String type;
    protected String accepted;

    public User(String nom, String prenom, String telephone, String email, String password, String type, String accepted) {
        this.f_name = nom;
        this.l_name = prenom;
        this.phone = telephone;
        this.mail = email;
        this.password = password;
        this.type = type;
        this.accepted = accepted;
    }
    
    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getF_name() {
        return f_name;
    }

    public void setF_name(String f_name) {
        this.f_name = f_name;
    }

    public String getL_name() {
        return l_name;
    }

    public void setL_name(String l_name) {
        this.l_name = l_name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAccepted() {
        return accepted;
    }

    public void setAccepted(String accepted) {
        this.accepted = accepted;
    }

    
    
    
    
    
    
}
