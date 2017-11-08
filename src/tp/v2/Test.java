package tp.v2;

import tp.v1.file.fabriques.FabriqueFile;
import tp.v1.file.fabriques.FabriqueFileGen;
import tp.v1.file.services.ServiceFile;

public class Test {

	/**
	* Methode qui teste l'implementation des listes
	*
	* @param 
	* @return 
	* @exception 
	*
	*/
	private static<T extends Liste<Integer>> void testListe(Liste<Integer> liste) {
		
	}
	
	/**
	* Methode qui teste l'implementation des listes mutable
	*
	* @param 
	* @return 
	* @exception 
	*
	*/
	private static<T extends ListeMutable<Integer>> void testListeMutable(ListeMutable<Integer> listeMutable) {
		System.out.println("Une liste mutable initiale");
		System.out.println(listeMutable.toStringListe());
		System.out.println("Elle est vide ? : "+listeMutable.estVide());
		
		//System.out.println("On ajoute le 3");
		//listeMutable.changerTete(3);
		/*
		System.out.println("La liste : "+listeMutable.toString());
		System.out.println("On ajoute le 4");
		listeMutable.changerTete(4);
		System.out.println("La liste : "+listeMutable.toString());
		*/
	}
	
	/**
	* Methode qui gère l'éxecution du test
	*
	* @param 
	* @return 
	* @exception 
	*
	*/
	public static void main(String[] args) {
		//Liste<Integer> liste = new Liste<Integer>() {};
		final ListeMutable<Integer> listeMutable = new ListeMutable<Integer>() {};
		
		//testListe(liste);
		testListeMutable(listeMutable);
	}
}
