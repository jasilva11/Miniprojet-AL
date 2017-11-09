package tp.v3;

import java.util.Iterator;

public interface Liste<E> extends Iterable<E>{
	
	/*
	 * Accesseurs
	 */
	/**
	 * Methode qui teste l'implementation des listes mutable pas vides
	 * @param une liste mutable qui n'est pas vide
	 * @throws UnsupportedOperationException au cas ou une operation qui n'est pas supportée est executee
	 */
	default boolean casVide() {
		return false;
	}

	default boolean casCons() {
		return false;
	}
	
	/**
	 * Methode qui retorne la tete de la liste
	 * @return la tete de la liste
	 */
	default E tete() {
		throw new UnsupportedOperationException();
	}

	/**
	 * Methode qui retorne la deuxieme partie de la liste (elements apart la tete)
	 * @return liste contenant le reste de la liste
	 * @throws UnsupportedOperationException au cas ou une operation qui n'est pas supportée est executee
	 */
	default Liste<E> reste() {
		throw new UnsupportedOperationException();
	}
	

	
	/**
	 * Methode qui retorne la taille de la liste
	 * @return la taille de la liste
	 */
	default public int taille(){
		return 0;
	}
	
	/**
	 * Methode qui determine si la liste est vide ou pas
	 * @return true si la liste est vide, false au cas contraire
	 */
	default public boolean estVide(){
		return this.taille() == 0;
	}

	/*
	 * Services
	 */
	
	/**
	 * Methode qui retorne l'iterateur de la liste
	 * @return l'iterateur de la liste
	 */
	default Iterator<E> iterator() {
		return new IterateurListe<E>(this); // Compléter puis utiliser IterateurListe.
	}

	/**
	 * Methode qui retorne une chaine de characteres representant la liste
	 * @return chaine de characteurs contenant les elements de la liste
	 */
	default String toStringListe() {
		if(estVide()) {
			return "";
		} else {
			StringBuilder s = new StringBuilder();

			s.append(tete().toString()+" ");
			s.append(reste().toStringListe());

			return s.toString();
		}
	}
}
