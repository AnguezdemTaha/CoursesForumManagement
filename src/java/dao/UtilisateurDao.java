/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import com.beans.Etudiant;
import com.beans.Utilisateur;
import com.database.DBconect;
import java.sql.Connection;
import java.sql.DriverManager;
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
public class UtilisateurDao {
    private Connection connexion;
    
    private static final String ID_UTILISATEUR="Id_utilisateur";
    private static final String NOM_UTILISATEUR="Nom_utilisateur";
    private static final String PRENOM_UTILISATEUR="Prenom_utilisateur";
    private static final String EMAIL_UTILISATEUR="Email_utilisateur";
    private static final String TELEPHONE_UTILISATEUR="Telephone_utilisateur";
    private static final String TYPE_UTILISATEUR="Type_utilisateur";
    //chercher base donne
    public static Utilisateur chercher(Utilisateur utilisateur) {
    
        DBconect db=new DBconect();
        Connection con=null;
        try{
        con=db.connecte();
        PreparedStatement statement=con.prepareStatement("select * from utilisateur where Nom_utilisateur = ? and Mot_de_passe_utilisateur =? ;");
        statement.setString(1, utilisateur.getNom());
        statement.setString(2, utilisateur.getPassword());
        
        ResultSet resultat=statement.executeQuery();
        
        if(resultat.next()){
            int id = resultat.getInt(ID_UTILISATEUR);
            String nom = resultat.getString(NOM_UTILISATEUR);
            String prenom = resultat.getString(PRENOM_UTILISATEUR);
            String email = resultat.getString(EMAIL_UTILISATEUR);
            String telephone = resultat.getString(TELEPHONE_UTILISATEUR);
            String type = resultat.getString(TYPE_UTILISATEUR);
               
            utilisateur.setId(id);
            utilisateur.setNom(nom);
            utilisateur.setPrenom(prenom);
            utilisateur.setEmail(email);
            utilisateur.setTelephone(telephone);
            utilisateur.setType(type);
            
            return utilisateur;
        }} catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(UtilisateurDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    //add etudiant
    public static boolean AjouterUtilisateur(Utilisateur utilisateur){
        DBconect db=new DBconect();
        Connection con=null;
        try {
            con=db.connecte();
            PreparedStatement stmt=con.prepareStatement("insert into Utilisateur(Nom_utilisateur,Prenom_utilisateur,Email_utilisateur,Telephone_utilisateur,Type_utilisateur,Mot_de_passe_utilisateur) values(?,?,?,?,?,?)");
            String Etudiant="Etudiant";
            stmt.setString(1, utilisateur.getNom());
            stmt.setString(2,utilisateur.getPrenom());
            stmt.setString(3, utilisateur.getEmail());
            stmt.setString(4,utilisateur.getTelephone());
            stmt.setString(5,Etudiant);
            stmt.setString(6,utilisateur.getPassword());
            
            
            stmt.executeUpdate();
            return true;
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(UtilisateurDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
       
    }
    
    public static boolean DemandeUtilisateur(Utilisateur utilisateur){
        DBconect db=new DBconect();
        Connection con=null;
        try {
            con=db.connecte();
            PreparedStatement stmt=con.prepareStatement("insert into Demande(D_nom_etudiant,D_Prenom_etudiant,D_Email_etudiant,D_Telephone_etudiant) values(?,?,?,?)");
           // String Etudiant="Etudiant";
            stmt.setString(1, utilisateur.getNom());
            stmt.setString(2,utilisateur.getPrenom());
            stmt.setString(3, utilisateur.getEmail());
            stmt.setString(4,utilisateur.getTelephone());
            
            
            
            
            stmt.executeUpdate();
            return true;
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(UtilisateurDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
       
    }
    
    public static boolean AjouterUtilisateurprof(Utilisateur utilisateur){
        DBconect db=new DBconect();
        Connection con=null;
        
        try {
            con=db.connecte();
            PreparedStatement stmt=con.prepareStatement("insert into Utilisateur(Nom_utilisateur,Prenom_utilisateur,Email_utilisateur,Telephone_utilisateur,Type_utilisateur,Mot_de_passe_utilisateur) values(?,?,?,?,?,?)");
            String Etudiant="Professeur";
            stmt.setString(1, utilisateur.getNom());
            stmt.setString(2,utilisateur.getPrenom());
            stmt.setString(3, utilisateur.getEmail());
            stmt.setString(4,utilisateur.getTelephone());
            stmt.setString(5,Etudiant);
            stmt.setString(6,utilisateur.getPassword());
            
            
            stmt.executeUpdate();
            return true;
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(UtilisateurDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
       
    }
    //ajouter unn etudiant au base de donnée
    public void AjouterEtudiant (String nom, String prenom, String email) throws SQLException, ClassNotFoundException {//!!! a refaire avec l'objet etuiand et resoudre prob de static
     
        DBconect db=new DBconect();
        Connection con=null;
        con=db.connecte();
       
        
        PreparedStatement statement=con.prepareStatement("INSERT INTO etudiant(Nom_etudiant,Prenom_etudiant,Email) VALUES ('t1','t2','t3')");
        
         //statement.setString(1, Etudiant.getNom()); //nom est private
        //statement.setString(2, Etudiant.getPrenom());
        //statement.setString(3, Etudiant.getEmail());
//        statement.setString(1, nom);
//        statement.setString(2, prenom);
//        statement.setString(3, email);
        //statement.setInt(4, telephone);
        //statement.setString(4, telephone);
        
        statement.executeUpdate();
       
        
        
    }
    
    
    public static List<Utilisateur> recupererEtudiants() {
        List<Utilisateur> etudiants = new ArrayList<Utilisateur>();
        Statement statement = null;
        ResultSet resultat = null;

        DBconect db=new DBconect();
        Connection con=null;
        
        
        try {
            con=db.connecte();
            statement = con.createStatement();

            // Exécution de la requête
            resultat = statement.executeQuery("SELECT * FROM Utilisateur where Type_utilisateur='Etudiant';");

            // Récupération des données
            while (resultat.next()) {
                String nom = resultat.getString(NOM_UTILISATEUR);
                String prenom = resultat.getString(PRENOM_UTILISATEUR);
                String email = resultat.getString(EMAIL_UTILISATEUR);
                String telephone = resultat.getString(TELEPHONE_UTILISATEUR);
                int id = resultat.getInt(ID_UTILISATEUR);
               
                
                
                
                Utilisateur utilisateur = new Utilisateur();
                utilisateur.setNom(nom);
                utilisateur.setPrenom(prenom);
                utilisateur.setEmail(email);
                utilisateur.setTelephone(telephone);
                utilisateur.setId(id);
                
                
                etudiants.add(utilisateur);
            }
        } catch (SQLException e) {
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UtilisateurDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return etudiants;
    }
    
    
    public static List<Utilisateur> recupererEtudiantsdemande() {
        List<Utilisateur> etudiants = new ArrayList<Utilisateur>();
        Statement statement = null;
        ResultSet resultat = null;

        DBconect db=new DBconect();
        Connection con=null;
        
        
        try {
            con=db.connecte();
            statement = con.createStatement();

            // Exécution de la requête
            resultat = statement.executeQuery("SELECT * FROM Demande;");

            // Récupération des données
            while (resultat.next()) {
                String nom = resultat.getString("D_nom_etudiant");
                String prenom = resultat.getString("D_prenom_etudiant");
                String email = resultat.getString("D_email_etudiant");
                String telephone = resultat.getString("D_telephone_etudiant");
                int id =resultat.getInt("Id_demande");
                
                
                
                Utilisateur utilisateur = new Utilisateur();
                utilisateur.setNom(nom);
                utilisateur.setPrenom(prenom);
                utilisateur.setEmail(email);
                utilisateur.setTelephone(telephone);
                utilisateur.setId(id);
                
                
                etudiants.add(utilisateur);
            }
        } catch (SQLException e) {
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UtilisateurDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return etudiants;
    }
    
    
    public static List<Utilisateur> recupererProfesseurs() {
        List<Utilisateur> professeurs = new ArrayList<Utilisateur>();
        Statement statement = null;
        ResultSet resultat = null;

        DBconect db=new DBconect();
        Connection con=null;
        
        
        try {
            con=db.connecte();
            statement = con.createStatement();

            // Exécution de la requête
            resultat = statement.executeQuery("SELECT * FROM Utilisateur where Type_utilisateur='Professeur';");

            // Récupération des données
            while (resultat.next()) {
                int id = resultat.getInt("Id_utilisateur");
                String nom = resultat.getString("Nom_utilisateur");
                String prenom = resultat.getString("Prenom_utilisateur");
                String email = resultat.getString("Email_utilisateur");
                String telephone = resultat.getString("Telephone_utilisateur");
               
                
                
                
                Utilisateur utilisateur = new Utilisateur();
                utilisateur.setId(id);
                utilisateur.setNom(nom);
                utilisateur.setPrenom(prenom);
                utilisateur.setEmail(email);
                utilisateur.setTelephone(telephone);
                
                
                professeurs.add(utilisateur);
            }
        } catch (SQLException e) {
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UtilisateurDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return professeurs; 
    }
    
    
    public static boolean Supprimeretudiant(List list_id){
        DBconect db=new DBconect();
        Connection con=null;
        try {
            con=db.connecte();
            int i=0;
            while(i< list_id.size()){
            PreparedStatement stmt=con.prepareStatement("delete from Utilisateur where Id_utilisateur=?;");
            
            
            stmt.setInt(1, (Integer.parseInt((String) list_id.get(i))));
            
            
            
            stmt.executeUpdate();
            
            i++;
            }
            
            //il faut d'abord enregestre le id de module pour etre lememe c'est pour ca : on va debuter par l'exemple de donne seulement le nom module
            

            // Récupération des données
          return true;
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(UtilisateurDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
       
    }
    
    public static boolean Supprimerprofs(List list_id){
        DBconect db=new DBconect();
        Connection con=null;
        try {
            con=db.connecte();
            int i=0;
            while(i< list_id.size()){
            PreparedStatement stmt=con.prepareStatement("delete from Utilisateur where Id_utilisateur=?;");
            PreparedStatement stmt2=con.prepareStatement("delete from Prof_module where Id_prof=?;");
            
            
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
            Logger.getLogger(UtilisateurDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
       
    }
    
    public static boolean Supprimerdemande(List list_id){
        DBconect db=new DBconect();
        Connection con=null;
        try {
            con=db.connecte();
            int i=0;
            while(i< list_id.size()){
            PreparedStatement stmt=con.prepareStatement("delete from Demande where Id_demande=?;");
            
            
            stmt.setInt(1, (Integer.parseInt((String) list_id.get(i))));
            
            
            
            stmt.executeUpdate();
            
            i++;
            }
            
            //il faut d'abord enregestre le id de module pour etre lememe c'est pour ca : on va debuter par l'exemple de donne seulement le nom module
            

            // Récupération des données
          return true;
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(UtilisateurDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
       
    }
    
    public static boolean Confirmerdemande(List list_id){
        DBconect db=new DBconect();
        Connection con=null;
        
        

        
        
        try {
            con=db.connecte();
            //statement = con.createStatement();
            
             
            int i=0;
            while(i< list_id.size()){
              PreparedStatement statement=con.prepareStatement("SELECT * FROM Demande where Id_demande=?;");
                
                statement.setInt(1, (Integer.parseInt((String) list_id.get(i))));
        
                ResultSet resultat=statement.executeQuery();
               
              
                if (resultat.next()) {
                //int id = resultat.getInt("Id_utilisateur");
                String nom = resultat.getString("D_nom_etudiant");
                String prenom = resultat.getString("D_prenom_etudiant");
                String email = resultat.getString("D_email_etudiant");
                String telephone = resultat.getString("D_telephone_etudiant");
               
                //Utilisateur utilisateur = new Utilisateur();
//                utilisateur.setId(id);
               // utilisateur.setNom(nom);
                //utilisateur.setPrenom(prenom);
                //utilisateur.setEmail(email);
                //utilisateur.setTelephone(telephone);
           // Récupération des données
           
            PreparedStatement stmt=con.prepareStatement("insert into Utilisateur(Nom_utilisateur,Prenom_utilisateur,Email_utilisateur,Telephone_utilisateur) values(?,?,?,?)");
            stmt.setString(1, nom);
            stmt.setString(2, prenom);
            stmt.setString(3, email);
            stmt.setString(4, telephone);
            stmt.executeUpdate();
            
            PreparedStatement stmt2=con.prepareStatement("delete from Demande where Id_demande=?;");
            stmt2.setInt(1, (Integer.parseInt((String) list_id.get(i))));
            
            stmt2.executeUpdate();
            
            
            
                }
            i++;
            
            }
            //il faut d'abord enregestre le id de module pour etre lememe c'est pour ca : on va debuter par l'exemple de donne seulement le nom module
            

            // Récupération des données
          return true;
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(UtilisateurDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
       
    }
    
    
    
     public static void loadDatabase() {
        // Chargement du driver
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
        }

        try {
            Connection connexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/gestion_de_cours", "root", "");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

       /* public static void main(String[] args) {
        List<Utilisateur> ls=new ArrayList<Utilisateur>();
        ls=UtilisateurDao.recupererProfesseurs();
        
        for(Utilisateur e : ls){
            System.out.println("nom :"+e.getNom());
        }
    }*/
}


