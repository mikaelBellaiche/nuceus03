package fr.noixcoop.nuceus;

import java.sql.* ;

public class TestBD {
	public static void main(String [] args){
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance() ;
			Connection connexion = DriverManager.getConnection("jdbc:mysql://localhost/noixcoop?useUnicode=true&characterEncoding=UTF-8","root","azerty") ;
			Statement requete = connexion.createStatement() ;
			ResultSet resultat = requete.executeQuery("select libelle,aoc from VARIETE ;") ;
			resultat.last() ;
			System.out.println(resultat.getRow()) ;
			resultat.beforeFirst() ;
			while(resultat.next()){
				System.out.println(resultat.getString("libelle") + ":" + resultat.getInt("aoc") ) ;	
			}
			resultat.close() ;
			requete.close() ;
			connexion.close() ;
		}
		catch(Exception e){
			System.out.println("Erreur...") ;
		}
	}
}
