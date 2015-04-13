package fr.noixcoop.nuceus;

import java.sql.* ;

public class ConnexionBD {
	// Déclarer les attributs nécessaires à la connexion
	
	private static Connection connexion = null ;
	private static String dbURL = "jdbc:mysql://localhost:3306/noixcoop?useUnicode=true&characterEncoding=UTF-8";
	private static String dbUSER = "noixcoop";
	private static String dbPSW = "noixcoop";
	
	private ConnexionBD() {
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance() ;
			connexion = (Connection) DriverManager.getConnection(dbURL, dbUSER, dbPSW);
			// Créer une connexion (initialisation de l'attribut connexion)
		}
		catch(Exception e){
			System.out.println("Erreur BD") ;
		}
	}
	
	public static Connection getConnexion(){
		if(connexion==null){
			new ConnexionBD();
		}
		// Si connexion n'est pas définie :
		// 		Créer une connexion
		// retourner la connexion
		return connexion;
	}
}
