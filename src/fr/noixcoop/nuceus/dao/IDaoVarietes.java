package fr.noixcoop.nuceus.dao;

import java.util.* ;

import fr.noixcoop.nuceus.metier.Variete;

public interface IDaoVarietes {
	List<Variete> consulter() ;
	Variete consulter(String libelle) ;
	boolean ajouter(Variete variete) ;
	boolean modifier(Variete variete) ;
	boolean supprimer(Variete variete) ;
	boolean supprimer(String libelle) ;
}
