package fr.noixcoop.nuceus.logiqueMetier;

import java.util.* ;

import fr.noixcoop.nuceus.metier.Variete;

public interface IMetierVarietes {
	List<Variete> consulter() ;
	Variete consulter(String libelle) ;
	boolean ajouter(Variete variete) ;
	boolean modifier(Variete variete) ;
	boolean supprimer(Variete variete) ;
	boolean supprimer(String libelle) ;
}
