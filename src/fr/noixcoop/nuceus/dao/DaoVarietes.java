package fr.noixcoop.nuceus.dao;

import java.util.* ;
import java.sql.* ;

import fr.noixcoop.nuceus.metier.Variete;
import fr.noixcoop.nuceus.technique.ConnexionBD;

public class DaoVarietes implements IDaoVarietes {
	
	public List<Variete> consulter(){
		// Votre code ici
		return null ;
	}
	
	public Variete consulter(String libelle){
		Variete variete = null ;
		Connection connexion = ConnexionBD.getConnexion() ;
		try {
			Statement requete = connexion.createStatement() ;
			ResultSet resultat = requete.executeQuery("select aoc from VARIETE where libelle='" + libelle + "';") ;
			if(resultat.next()){
				boolean aoc = false ;
				if(resultat.getInt("aoc") == 1){
					aoc = true ;
				}
				variete =  new Variete(libelle,aoc) ;
			}
			resultat.close() ;
			requete.close() ;
		}
		catch(Exception e){
			System.out.println("Erreur dans DaoVarietes::consulter(String)...") ;
		}
		return variete ;
	}
	
	public boolean ajouter(Variete variete){
		Connection connexion = ConnexionBD.getConnexion() ;
		try {
			// Votre code ici
			return true ;
		}
		catch(Exception e){
			System.out.println("Erreur dans DaoVarietes::ajouter(Commune)...") ;
			return false ;
		}
	}
	
	public boolean modifier(Variete variete){
		Connection connexion = ConnexionBD.getConnexion() ;
		try {
			// Votre code ici
			return true ;
		}
		catch(Exception e){
			System.out.println("Erreur dans DaoVarietes::modifier(Commune)...") ;
			return false ;
		}
	}
	
	public boolean supprimer(String libelle){
		Connection connexion = ConnexionBD.getConnexion() ;
		try {
			// Votre code ici
			return true ;
		}
		catch(Exception e){
			System.out.println("Erreur dans DaoVarietes::supprimer(String)...") ;
			return false ;
		}
	}
	
	public boolean supprimer(Variete variete){
		// Votre code ici
		return false ;
	}
	
}
