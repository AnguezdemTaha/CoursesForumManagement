
package com.beans;


public class Etudiant {
    
    /// ces variables et methose il on t ele non static , je les changer parceque on dans ajouter etudiant il foaut static ???
    private String nom ;
    private String prenom ;
    private String telephone ;
    private String email ;
    private String password;

    

    public Etudiant() {
    }

    public Etudiant(String nom, String prenom, String telephone, String email, String password) {
        this.nom = nom;
        this.prenom = prenom;
        this.telephone = telephone;
        this.email = email;
        this.password = password;
    }
    

    

    

    
    public  String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getTelephone() {
        return telephone;
    }

    public  String getEmail() {
        return email;
    }

    public  void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
   
    
}
