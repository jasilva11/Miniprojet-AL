package tp.v2;

import java.util.Iterator;

/*
 * - Liste définie inductivement
 * l ::= Vide (cf. casVide)
 *     | Cons(e, l) (cf. casCons, tete, reste)
 * - accesseurs supplémentaires : taille, estVide
 * - services : iterator, miroir    
 */
/**
 * Interface qui sert � mod�liser une liste immutable.
 * @author  D'LUYZ Daniel
 * @author  SAENZ Henry
 * @author  SILVA Jose
 */
public interface Liste<E> extends Iterable<E> {
	
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


	default boolean casCons() {
		return false;
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

	// renvoie la liste dans l'ordre inverse.
	/**
	 * Methode qui renvoie la liste � l'inverse
	 * @return la liste � l'inverse
	 */
	default Liste<E> miroir(){
		if(casCons()) {
			if(!estVide() && taille()>1) {
				Iterator<E> iterator = iterator();
				E current = this.tete();
				Liste<E> liste = Liste.cons(current, Liste.vide());
				while(iterator.hasNext()) {
					current = iterator.next();
					Liste<E> newReste = Liste.cons(liste.tete(), liste.reste());
					liste = Liste.cons(current, newReste);
				}
				return liste;
			} else {
				Liste<E> liste = Liste.cons(tete(), Liste.vide());
				return liste;
			}
		} 
		Liste<E> liste = Liste.vide();
		return liste;
	}
	/*
	 * Fabriques (statiques)
	 */
	/**
	* Fabrique d'une liste immutable vide
	* @return Une liste immutable qui est vide
	* @throws UnsupportedOperationException au cas ou une operation qui n'est pas support�e est execut�e
	*/
	public static <E> Liste<E> vide() {
		return new Liste<E>() {
			
			@Override
			public boolean casVide() {
				return true;
			}

			@Override
			public boolean casCons() {
				return false;
			}

			@Override
			public int taille(){
				return 0;
			}

			@Override
			public boolean estVide(){
				return this.taille() == 0;
			}	
		};
	}

	public static <E> Liste<E> cons(E t, Liste<E> r) {
		return new Liste<E>() {

			private E tete = t;
			private Liste<E> reste = r;

			@Override
			public boolean casVide() {
				return false;
			}

			@Override
			public E tete() {
				return tete;
			}

			@Override
			public Liste<E> reste() {
				return reste;
			}

			@Override
			public boolean casCons() {
				return true;
			}

			@Override
			public int taille(){
				return reste.taille()+1;
			}
		};
	}
}
