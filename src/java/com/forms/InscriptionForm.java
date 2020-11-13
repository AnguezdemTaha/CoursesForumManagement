/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.forms;

/**
 *
 * @author lm
 */
public class InscriptionForm {
/*    private UtilisateurDao      utilisateurDao;

public InscriptionForm( UtilisateurDao utilisateurDao ) {
    this.utilisateurDao = utilisateurDao;
}
    
public Utilisateur inscrireUtilisateur( HttpServletRequest request ) {
    String email = getValeurChamp( request, CHAMP_EMAIL );
    String motDePasse = getValeurChamp( request, CHAMP_PASS );
    String confirmation = getValeurChamp( request, CHAMP_CONF );
    String nom = getValeurChamp( request, CHAMP_NOM );

    Utilisateur utilisateur = new Utilisateur();
    try {
        traiterEmail( email, utilisateur );
        traiterMotsDePasse( motDePasse, confirmation, utilisateur );
        traiterNom( nom, utilisateur );

        if ( erreurs.isEmpty() ) {
            utilisateurDao.creer( utilisateur );
            resultat = "Succès de l'inscription.";
        } else {
            resultat = "Échec de l'inscription.";
        }
    } catch ( DAOException e ) {
        resultat = "Échec de l'inscription : une erreur imprévue est survenue, merci de réessayer dans quelques instants.";
        e.printStackTrace();
    }

    return utilisateur;
}

private static final String ALGO_CHIFFREMENT = "SHA-256";

...*/

/*
 * Appel à la validation de l'adresse email reçue et initialisation de la
 * propriété email du bean
 */
/*private void traiterEmail( String email, Utilisateur utilisateur ) {
    try {
        validationEmail( email );
    } catch ( FormValidationException e ) {
        setErreur( CHAMP_EMAIL, e.getMessage() );
    }
    utilisateur.setEmail( email );
}*/

/*
 * Appel à la validation des mots de passe reçus, chiffrement du mot de
 * passe et initialisation de la propriété motDePasse du bean
 */
/*private void traiterMotsDePasse( String motDePasse, String confirmation, Utilisateur utilisateur ) {
    try {
        validationMotsDePasse( motDePasse, confirmation );
    } catch ( FormValidationException e ) {
        setErreur( CHAMP_PASS, e.getMessage() );
        setErreur( CHAMP_CONF, null );
    }*/

    /*
     * Utilisation de la bibliothèque Jasypt pour chiffrer le mot de passe
     * efficacement.
     * 
     * L'algorithme SHA-256 est ici utilisé, avec par défaut un salage
     * aléatoire et un grand nombre d'itérations de la fonction de hashage.
     * 
     * La String retournée est de longueur 56 et contient le hash en Base64.
     */
 /*   ConfigurablePasswordEncryptor passwordEncryptor = new ConfigurablePasswordEncryptor();
    passwordEncryptor.setAlgorithm( ALGO_CHIFFREMENT );
    passwordEncryptor.setPlainDigest( false );
    String motDePasseChiffre = passwordEncryptor.encryptPassword( motDePasse );

    utilisateur.setMotDePasse( motDePasseChiffre );
}*/

/* Validation de l'adresse email */
/*private void validationEmail( String email ) throws FormValidationException {
    if ( email != null ) {
        if ( !email.matches( "([^.@]+)(\\.[^.@]+)*@([^.@]+\\.)+([^.@]+)" ) ) {
            throw new FormValidationException( "Merci de saisir une adresse mail valide." );
        } else if ( utilisateurDao.trouver( email ) != null ) {
            throw new FormValidationException( "Cette adresse email est déjà utilisée, merci d'en choisir une autre." );
        }
    } else {
        throw new FormValidationException( "Merci de saisir une adresse mail." );
    }
}
    */
    
    
}
