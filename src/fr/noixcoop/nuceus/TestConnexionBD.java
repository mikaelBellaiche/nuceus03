package fr.noixcoop.nuceus;

import java.sql.* ;

import fr.noixcoop.nuceus.technique.ConnexionBD;

public class TestConnexionBD {
	public static void main(String [] args){
		
		Connection connexion = ConnexionBD.getConnexion() ;
		try {
			Statement requete = connexion.createStatement() ;
			ResultSet resultat = requete.executeQuery("select libelle,aoc from VARIETE ;") ;
			while(resultat.next()){
				System.out.println(resultat.getString("libelle") + ":" + resultat.getInt("aoc")) ;	
			}
			resultat.close() ;
			requete.close() ;
		}
		catch(Exception e){
			System.out.println("Erreur dans test...") ;
		}
			
	}
}
