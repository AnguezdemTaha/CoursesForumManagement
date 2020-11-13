/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.database;

import com.beans.Course;
import com.beans.Filiere;
import com.beans.Module;
import com.beans.Question;
import com.beans.Answer;
import com.beans.User;
import com.database.DBconect;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lm
 */
public class Module_filiere_anneeDao {
    
    
    public static List<Module> recupererModulesprof(User utilisateur) {
        List<Module> modules = new ArrayList<Module>();
        

        DBconect db=new DBconect();
        Connection con=null;
        
        
        try {
            con=db.connecte();
            

            // Exécution de la requête
            PreparedStatement statement=con.prepareStatement("select * from Module where Id_module in (select Id_module from Prof_module where Id_prof=?);");
            statement.setInt(1, utilisateur.getId());
            
            
        
            ResultSet resultat=statement.executeQuery();

            // Récupération des données
            while (resultat.next()) {
                String nom = resultat.getString("Nom_module");
                String annee = resultat.getString("Annee_module");
                String filier = resultat.getString("Filiere_module");
                int id = resultat.getInt("Id_module");
                
               
                
                
                
                Module module = new Module();
                module.setNom(nom);
                module.setAnnee(annee);
                module.setFilier(filier);
                module.setId(id);
                
                
                
                modules.add(module);
            }
        } catch (SQLException e) {
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UtilisateurDaoo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return modules;
    }
    
    public static List<Module> recupererModules() {
        List<Module> modules = new ArrayList<Module>();
        Statement statement = null;
        ResultSet resultat = null;

        DBconect db=new DBconect();
        Connection con=null;
        
        
        try {
            con=db.connecte();
            statement = con.createStatement();

            // Exécution de la requête
            resultat = statement.executeQuery("SELECT * FROM Module ORDER BY Annee_module;");

            // Récupération des données
            while (resultat.next()) {
                String nom = resultat.getString("Nom_module");
                String annee = resultat.getString("Annee_module");
                String filier = resultat.getString("Filiere_module");
                int id = resultat.getInt("Id_module");
                
               
                
                
                
                Module module = new Module();
                module.setNom(nom);
                module.setAnnee(annee);
                module.setFilier(filier);
                module.setId(id);
                
                
                
                modules.add(module);
            }
        } catch (SQLException e) {
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UtilisateurDaoo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return modules;
    }
    
    public static List<Module> recupererModulesannee(String i) {
        List<Module> modules = new ArrayList<Module>();
        

        DBconect db=new DBconect();
        Connection con=null;
        
        
        try {
            con=db.connecte();
            

            // Exécution de la requête
            PreparedStatement statement=con.prepareStatement("select * from Module where Annee_module=?;");
            statement.setString(1, i);
            
            
        
            ResultSet resultat=statement.executeQuery();

            // Récupération des données
            while (resultat.next()) {
                String nom = resultat.getString("Nom_module");
                String annee = resultat.getString("Annee_module");
                String filier = resultat.getString("Filiere_module");
                int id = resultat.getInt("Id_module");
                
               
                
                
                
                Module module = new Module();
                module.setNom(nom);
                module.setAnnee(annee);
                module.setFilier(filier);
                module.setId(id);
                
                
                
                modules.add(module);
            }
        } catch (SQLException e) {
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UtilisateurDaoo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return modules;
    }
    
    public static List<Filiere> recupererfilieres() {
        List<Filiere> filieres = new ArrayList<Filiere>();
        Statement statement = null;
        ResultSet resultat = null;

        DBconect db=new DBconect();
        Connection con=null;
        
        
        try {
            con=db.connecte();
            statement = con.createStatement();

            // Exécution de la requête
            resultat = statement.executeQuery("SELECT * FROM Filiere;");
            

            // Récupération des données
            while (resultat.next()) {
                String nom = resultat.getString("Nom_filiere");
                int id = resultat.getInt("Id_filiere");
                
                
               
                
                
                
                Filiere filiere = new Filiere();
                filiere.setNom(nom);
                filiere.setId(id);
                
                
                
                
                filieres.add(filiere);
            }
        } catch (SQLException e) {
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UtilisateurDaoo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return filieres;
    }
    
    
    
     public static boolean AjouterModule(Module module, List list_id){
        DBconect db=new DBconect();
        Connection con=null;
        try {
            con=db.connecte();
            PreparedStatement stmt=con.prepareStatement("insert into Module(Nom_module,Filiere_module,Annee_module) values(?,?,?);");
            
            stmt.setString(1, module.getNom());
            stmt.setString(2,module.getFilier());
            stmt.setString(3, module.getAnnee());
            
            stmt.executeUpdate();
            
            //il faut d'abord enregestre le id de module pour etre lememe c'est pour ca : on va debuter par l'exemple de donne seulement le nom module
            PreparedStatement stmt3=con.prepareStatement("select * from Module where Nom_module=?;");
            stmt3.setString(1, module.getNom());
            
            ResultSet resultat=stmt3.executeQuery();

            // Récupération des données
            
            if (resultat.next()) {
               int id = resultat.getInt("Id_module");
               int i=0;
                while(i< list_id.size()){
                PreparedStatement stmt2=con.prepareStatement("insert into Prof_module(Id_prof,Id_module) values(?,?);");
                stmt2.setInt(1, (Integer.parseInt((String) list_id.get(i))));
                stmt2.setInt(2, id);
                stmt2.executeUpdate();
                i++;
                }
            }
            
            return true;
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(UtilisateurDaoo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
       
    }
     
     public static boolean AjouterCours(Course c , Module module, User u,InputStream i ){
        DBconect db=new DBconect();
        Connection con=null;
        try {
            con=db.connecte();
            PreparedStatement stmt=con.prepareStatement("insert into Cours(Nom_cours,Id_module,Id_prof,File_cours) values(?,?,?,?);");
            stmt.setString(1, c.getNom_cours());
            stmt.setInt(2, module.getId());
            stmt.setInt(3,u.getId());
            stmt.setBlob(4, i);
            //stmt.setString(3, c.getContenu_cours());
            
            stmt.executeUpdate();
            
            //il faut d'abord enregestre le id de module pour etre lememe c'est pour ca : on va debuter par l'exemple de donne seulement le nom module
            
            
            
            return true;
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(UtilisateurDaoo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
       
    }
     
     
     public static boolean SupprimerModules(List list_id){
        DBconect db=new DBconect();
        Connection con=null;
        try {
            con=db.connecte();
            int i=0;
            while(i< list_id.size()){
            PreparedStatement stmt=con.prepareStatement("delete from Module where Id_module=?;");
            PreparedStatement stmt2=con.prepareStatement("delete from Prof_module where Id_module=?;");
            
            stmt.setInt(1, (Integer.parseInt((String) list_id.get(i))));
            stmt2.setInt(1, (Integer.parseInt((String) list_id.get(i))));
            
            
            stmt.executeUpdate();
            stmt2.executeUpdate();
            i++;
            }
            
            //il faut d'abord enregestre le id de module pour etre lememe c'est pour ca : on va debuter par l'exemple de donne seulement le nom module
            

            // Récupération des données
          return true;
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(UtilisateurDaoo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
       
    }
     
     public static boolean SupprimerFilieres(List list_id){
        DBconect db=new DBconect();
        Connection con=null;
        try {
            con=db.connecte();
            int i=0;
            while(i< list_id.size()){
            PreparedStatement stmt=con.prepareStatement("delete from Filiere where Id_filiere=?;");
            PreparedStatement stmt2=con.prepareStatement("delete from Module where Filiere_module in (select Nom_filiere from Filiere where Id_filiere=?);");
            
            stmt.setInt(1, (Integer.parseInt((String) list_id.get(i))));
            stmt2.setInt(1, (Integer.parseInt((String) list_id.get(i))));
            
            
            stmt.executeUpdate();
            stmt2.executeUpdate();
            i++;
            }
            
            //il faut d'abord enregestre le id de module pour etre lememe c'est pour ca : on va debuter par l'exemple de donne seulement le nom module
            

            // Récupération des données
          return true;
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(UtilisateurDaoo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
       
    }
     
     
     public static boolean AjouterFiliere(Filiere filiere){
        DBconect db=new DBconect();
        Connection con=null;
        try {
            con=db.connecte();
            PreparedStatement stmt=con.prepareStatement("insert into Filiere(Nom_filiere) values(?)");
            stmt.setString(1, filiere.getNom());
            
            
            
            stmt.executeUpdate();
            return true;
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(UtilisateurDaoo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
       
    }
     
      public static boolean Ajouterquestion(Course cours,User utilisateur, Question question){
        DBconect db=new DBconect();
        Connection con=null;
        try {
            con=db.connecte();
            PreparedStatement stmt=con.prepareStatement("insert into Question_cours(Id_etudiant,Id_cours,Contenu_question) values(?,?,?)");
            stmt.setInt(1, utilisateur.getId());
            stmt.setInt(2, cours.getId_cours());
            stmt.setString(3, question.getContenu());
            
            
            
            stmt.executeUpdate();
            return true;
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(UtilisateurDaoo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
       
    }
      
      
       public static boolean Ajouterreponse(Question question,User utilisateur, Answer reponse){
        DBconect db=new DBconect();
        Connection con=null;
        try {
            con=db.connecte();
            int i=1;
            PreparedStatement stmt=con.prepareStatement("insert into Question_reponse(Id_etudiant,Id_question,Contenu_reponse,Accepte) values(?,?,?,?)");
            stmt.setInt(1, utilisateur.getId());
            stmt.setInt(2, question.getId());
            stmt.setString(3, reponse.getContenu());
            stmt.setInt(4, i);
            
            
            stmt.executeUpdate();
            return true;
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(UtilisateurDaoo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
       
    }
      
      
      public static boolean Validerquestion(Question question){
        DBconect db=new DBconect();
        Connection con=null;
        try {
            con=db.connecte();
            PreparedStatement stmt=con.prepareStatement("update Question_cours set Acceptee=1 where Id_question=?");
            
            stmt.setInt(3, question.getId());
            
            
            
            stmt.executeUpdate();
            return true;
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(UtilisateurDaoo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
       
    }
     
      
     public static List<Module> recupererModulesdefiliere(Filiere filiere , String i) {
        List<Module> modules = new ArrayList<Module>();
        

        DBconect db=new DBconect();
        Connection con=null;
        
        
        try {
            con=db.connecte();
            

            // Exécution de la requête
            PreparedStatement statement=con.prepareStatement("select * from Module where Filiere_module=? and Annee_module=?;");
            statement.setString(1, filiere.getNom());
            statement.setString(2,i);
            
            
        
            ResultSet resultat=statement.executeQuery();

            // Récupération des données
            while (resultat.next()) {
                String nom = resultat.getString("Nom_module");
                String annee = resultat.getString("Annee_module");
                String filier = resultat.getString("Filiere_module");
                int id = resultat.getInt("Id_module");
                
               
                
                
                
                Module module = new Module();
                module.setNom(nom);
                module.setAnnee(annee);
                module.setFilier(filier);
                module.setId(id);
                
                
                
                modules.add(module);
            }
        } catch (SQLException e) {
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UtilisateurDaoo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return modules;
    }
     
     
     public static List<Course> recupererCoursmodule(Module module, String annee) throws FileNotFoundException {//de meme que l'autre fct seulement pour tester
        List<Course> courss = new ArrayList<Course>();
        

        DBconect db=new DBconect();
        Connection con=null;
        
        
        try {
            con=db.connecte();
            

            // Exécution de la requête
            PreparedStatement stmt3=con.prepareStatement("select * from Module where Nom_module=?;");
            stmt3.setString(1, module.getNom());
            
            ResultSet resultat1=stmt3.executeQuery();
            
            

            // Récupération des données
            if (resultat1.next()) {
                //String nom = resultat1.getString("Nom_cours");
                
                int id_module = resultat1.getInt("Id_module");
                
                PreparedStatement statement=con.prepareStatement("select * from Cours where Id_module=?;");
                statement.setInt(1, id_module); 
             
            
        
                ResultSet resultat=statement.executeQuery();
               
                while (resultat.next()){
                String nom = resultat.getString("Nom_cours");
                int id_cours =resultat.getInt("Id_cours");
                int id_modulee =resultat.getInt("Id_module");
                int id_prof =resultat.getInt("Id_prof");
                int contenu =resultat.getInt("Contenu_cours");
                //Blob blob =resultat.getBlob("File_cours");
                
        
                
                
                Course cours = new Course();
                cours.setNom_cours(nom);
                cours.setId_cours(id_cours);
                cours.setId_module(id_modulee);
                cours.setId_prof(id_prof);
                cours.setContenu_cours(contenu);
                //cours.setFile_cours(blob);
                
                
                courss.add(cours);}
            }
        } catch (SQLException e) {
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UtilisateurDaoo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return courss;
    }
     
     
     public static List<Question> recupererCoursmodulequestion(Course cours) {//de meme que l'autre fct seulement pour tester
        List<Question> questioncourss = new ArrayList<Question>();
        

        DBconect db=new DBconect();
        Connection con=null;
        
        
        try {
            con=db.connecte();
            

            // Exécution de la requête
            PreparedStatement statement=con.prepareStatement("select * from Question_cours where Id_cours=? and Acceptee=1;");
            statement.setInt(1, cours.getId_cours()); 
             
            
        
            ResultSet resultat=statement.executeQuery();

            // Récupération des données
            while (resultat.next()) {
                
                
                int id_question = resultat.getInt("Id_question");
                int id_etudiant = resultat.getInt("Id_etudiant");
                int id_cours = resultat.getInt("Id_cours");
                
                String contenu = resultat.getString("Contenu_question");
                int accpetee =resultat.getInt("Acceptee");
               
                
                
                
                Question question = new Question();
                question.setId(id_question);
                question.setId_cours(id_cours);
                question.setId_etudaint(id_etudiant);
                question.setAccepte(accpetee);
                question.setContenu(contenu);
                
                
                
                questioncourss.add(question);
            }
        } catch (SQLException e) {
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UtilisateurDaoo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return questioncourss;
    }
     
     
      public static User recupereruser(int id) {//de meme que l'autre fct seulement pour tester
        
        
          User utilisateur = new User();
        DBconect db=new DBconect();
        Connection con=null;
        
        
        try {
            con=db.connecte();
            

            // Exécution de la requête
            PreparedStatement statement=con.prepareStatement("select * from Utilisateur where Id_utilisateur=?;");
            statement.setInt(1, id); 
             
            
        
            ResultSet resultat=statement.executeQuery();

            // Récupération des données
            while (resultat.next()) {
                
                
                String Nom_utilisateur = resultat.getString("Nom_utilisateur");
                
               
                
                
                
                
                utilisateur.setNom(Nom_utilisateur);
                
                
                
                
                
            }
        } catch (SQLException e) {
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UtilisateurDaoo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return utilisateur;
    }
     
     
     
     public static List<Question> recupererquestionCours(Course cour) {//de meme que l'autre fct seulement pour tester
        List<Question> questions = new ArrayList<Question>();
        

        DBconect db=new DBconect();
        Connection con=null;
        
        
        try {
            con=db.connecte();
            

            // Exécution de la requête
            PreparedStatement statement=con.prepareStatement("select * from Question_cours where Id_cours=? and Acceptee=1;");
            statement.setInt(1, cour.getId_cours()); 
             
            
        
            ResultSet resultat=statement.executeQuery();

            // Récupération des données
            while (resultat.next()) {
                String contenu = resultat.getString("Contenu_question");
                //String  = resultat.getString(""); :: a ajouter la date
                
                int id_cours = resultat.getInt("Id_cours");
                int id_etudiant = resultat.getInt("	Id_etudiant");
                int id_question = resultat.getInt("Id_question");
                int acceptee = resultat.getInt("Acceptee");
                
               
                
                
                
                Question question = new Question();
                question.setAccepte(acceptee);
                question.setContenu(contenu);
                question.setId(id_question);
                question.setId_etudaint(id_etudiant);
                question.setId_cours(id_cours);
                
              //  cours.setId_cours(id_cours);
                //cours.setId_module(id_module);
               // cours.setId_prof(id_prof);
                //cours.setContenu_cours(contenu);
                
                
                
                questions.add(question);
            }
        } catch (SQLException e) {
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UtilisateurDaoo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return questions;
    }
     
     
     public static List<Question> recupererquestionprof(User u) {//de meme que l'autre fct seulement pour tester
        List<Question> questions = new ArrayList<Question>();
        

        DBconect db=new DBconect();
        Connection con=null;
        
        
        try {
            con=db.connecte();
            
           
            // Exécution de la requête
            PreparedStatement statement=con.prepareStatement("select * from Question_cours where Acceptee=0 and Id_cours in(select Id_cours from Cours where Id_prof=?)");
            statement.setInt(1, u.getId()); 
             
            
        
            ResultSet resultat=statement.executeQuery();

            // Récupération des données
            while (resultat.next()) {
                String contenu = resultat.getString("Contenu_question");
                //String  = resultat.getString(""); :: a ajouter la date
                
                int id_cours = resultat.getInt("Id_cours");
                int id_etudiant = resultat.getInt("Id_etudiant");
                int id_question = resultat.getInt("Id_question");
                int acceptee = resultat.getInt("Acceptee");
                
                
                
                PreparedStatement statement2=con.prepareStatement("select Nom_cours from Cours where Id_cours =?");
                statement2.setInt(1, id_cours); 
                ResultSet resultat2=statement2.executeQuery();
                Question question = new Question();
                if(resultat2.next()){
                    String dat =resultat2.getString("Nom_cours");
                    question.setContenu(dat);
                }
                
                
                
                
                question.setAccepte(acceptee);
                question.setDate(contenu);
                
                question.setId(id_question);
                question.setId_etudaint(id_etudiant);
                question.setId_cours(id_cours);
                
              //  cours.setId_cours(id_cours);
                //cours.setId_module(id_module);
               // cours.setId_prof(id_prof);
                //cours.setContenu_cours(contenu);
                
                
                
                questions.add(question);
            }
        } catch (SQLException e) {
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UtilisateurDaoo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return questions;
    }
     
      public static int nbrquestion(Course cour) {//de meme que l'autre fct seulement pour tester
        //List<Questions> questions = new ArrayList<Questions>();
        

        DBconect db=new DBconect();
        Connection con=null;
        
        int nbr=0;
        try {
            con=db.connecte();
            

            // Exécution de la requête
            PreparedStatement statement=con.prepareStatement("select * from Question_cours where Id_cours=? and Acceptee=1;");
            statement.setInt(1, cour.getId_cours()); 
             
            
        
            ResultSet resultat=statement.executeQuery();
            int i=0;
            // Récupération des données
            while (resultat.next()) {
                i++;
            }
            nbr=i;
        } catch (SQLException e) {
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UtilisateurDaoo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return nbr;
    }
     
     public static List<Answer> recupererreponsequestion(Question question) {//de meme que l'autre fct seulement pour tester
        List<Answer> reponses = new ArrayList<Answer>();
        

        DBconect db=new DBconect();
        Connection con=null;
        
        
        try {
            con=db.connecte();
            

            // Exécution de la requête
            PreparedStatement statement=con.prepareStatement("select * from Question_reponse where Id_question=? and Accepte=1;");
            statement.setInt(1, question.getId()); 
             
            
        
            ResultSet resultat=statement.executeQuery();

            // Récupération des données
            while (resultat.next()) {
                String contenu = resultat.getString("Contenu_reponse");
                //String  = resultat.getString(""); :: a ajouter la date
                
                int id_question = resultat.getInt("Id_question");
                int id_etudiant = resultat.getInt("Id_etudiant");
                int id_reponse = resultat.getInt("Id_question_reponse");
                int acceptee = resultat.getInt("Accepte");
                
               
                
                
                
                Answer reponse = new Answer();
                reponse.setAccepte(acceptee);
                reponse.setContenu(contenu);
                reponse.setId_reponse(id_reponse);
                reponse.setId_etudaint(id_etudiant);
                reponse.setId_question(id_question);
                
              //  cours.setId_cours(id_cours);
                //cours.setId_module(id_module);
               // cours.setId_prof(id_prof);
                //cours.setContenu_cours(contenu);
                
                
                
                reponses.add(reponse);
            }
        } catch (SQLException e) {
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UtilisateurDaoo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return reponses;
    }
     
     
     public static List<Course> recupererCoursmoduleprof(Module module, User utilisateur) {
         //on va maintenant fixer module ,professeur apres:on va ajouter a la fct  (Module module , Utilisateur professeur)
        List<Course> courss = new ArrayList<Course>();
        

        DBconect db=new DBconect();
        Connection con=null;
        
        
        try {
            con=db.connecte();
            
            PreparedStatement stmt3=con.prepareStatement("select * from Module where Nom_module=?;");
            stmt3.setString(1, module.getNom());
            
            ResultSet resultat1=stmt3.executeQuery();
            if (resultat1.next()) {
                int id = resultat1.getInt("Id_module");
                
                
            // Récupération des données
            
            
               

            // Exécution de la requête
            //PreparedStatement statement=con.prepareStatement("select * from Cours where Id_module=1 and ID_prof=2;");//on va essei apres de mettre comme des variable maintenet seulement test
            
            PreparedStatement statement=con.prepareStatement("select * from Cours where Id_module=? and ID_prof=?;");
            statement.setInt(1, id); //a voir
            statement.setInt(2, utilisateur.getId());// a voir
            
        
            ResultSet resultat=statement.executeQuery();
            
            // Récupération des données
            while (resultat.next()) {
                String nom = resultat.getString("Nom_cours");
                
                int id_cours = resultat.getInt("Id_cours");
                int id_module = resultat.getInt("Id_module");
                int id_prof = resultat.getInt("Id_prof");
                int contenu = resultat.getInt("Contenu_cours");
                
               
                
                
                
                Course cours = new Course();
                cours.setNom_cours(nom);
                cours.setId_cours(id_cours);
                cours.setId_module(id_module);
                cours.setId_prof(id_prof);
                cours.setContenu_cours(contenu);
                
                
                
                courss.add(cours);}}
            
        } catch (SQLException e) {
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UtilisateurDaoo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return courss;
    }
    
     public static boolean Supprimerquestion(List list_id){
        DBconect db=new DBconect();
        Connection con=null;
        try {
            con=db.connecte();
            int i=0;
            while(i< list_id.size()){
            PreparedStatement stmt=con.prepareStatement("delete from Question_cours where Id_question=?;");
            
            
            stmt.setInt(1, (Integer.parseInt((String) list_id.get(i))));
            
            
            
            stmt.executeUpdate();
            
            i++;
            }
            
            //il faut d'abord enregestre le id de module pour etre lememe c'est pour ca : on va debuter par l'exemple de donne seulement le nom module
            

            // Récupération des données
          return true;
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(UtilisateurDaoo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
       
    }
    
     public static boolean Supprimercours(int j){
        DBconect db=new DBconect();
        Connection con=null;
        try {
            con=db.connecte();
            //int i=0;
            
            PreparedStatement stmt=con.prepareStatement("delete from Cours where Id_cours=?;");
            
            
            stmt.setInt(1, j);
            
            
            
            stmt.executeUpdate();
            
            //i++;
            
            
            //il faut d'abord enregestre le id de module pour etre lememe c'est pour ca : on va debuter par l'exemple de donne seulement le nom module
            

            // Récupération des données
          return true;
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(UtilisateurDaoo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
       
    }
     
    public static boolean Confirmerquestion(List list_id){
        DBconect db=new DBconect();
        Connection con=null;
        
        

        
        
        try {
            con=db.connecte();
            //statement = con.createStatement();
            
             
            int i=0;
            while(i< list_id.size()){
              PreparedStatement statement=con.prepareStatement("SELECT * FROM Question_cours where Id_question=?;");
                
                statement.setInt(1, (Integer.parseInt((String) list_id.get(i))));
        
                ResultSet resultat=statement.executeQuery();
               
              
                if (resultat.next()) {
                int id = resultat.getInt("Id_question");
                
               
                //Utilisateur utilisateur = new Utilisateur();
//                utilisateur.setId(id);
               // utilisateur.setNom(nom);
                //utilisateur.setPrenom(prenom);
                //utilisateur.setEmail(email);
                //utilisateur.setTelephone(telephone);
           // Récupération des données
           
            PreparedStatement stmt=con.prepareStatement("update Question_cours set Acceptee=1 where Id_question=? ;");
            stmt.setInt(1,id);
            stmt.executeUpdate();
            
            
            
            
            
                }
            i++;
            
            }
            //il faut d'abord enregestre le id de module pour etre lememe c'est pour ca : on va debuter par l'exemple de donne seulement le nom module
            

            // Récupération des données
          return true;
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(UtilisateurDaoo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
       
    }
   /*  public static void main(String[] args) {
        List<Questions> ls=new ArrayList<>();
        
        ls=Module_filiere_anneeDao.recupererquestionprof();
        
        for(Questions e : ls){
            System.out.println("nom :"+e.getId());
        }
     }
    */
}
