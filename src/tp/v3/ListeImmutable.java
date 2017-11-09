package tp.v3;

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
public interface ListeImmutable<E> extends Liste<E> {
	
	/*
	 * Services
	 */

	// renvoie la liste dans l'ordre inverse.
	/**
	 * Methode qui renvoie la liste � l'inverse
	 * @return la liste � l'inverse
	 */
	default ListeImmutable<E> miroir(){
		if(casCons()) {
			if(!estVide()) {
				Iterator<E> iterator = iterator();
				E current = this.tete();
				ListeImmutable<E> liste = ListeImmutable.cons(current, ListeImmutable.vide());
				while(iterator.hasNext()) {
					current = iterator.next();
					ListeImmutable<E> newReste = ListeImmutable.cons(liste.tete(), liste.reste());
					liste = ListeImmutable.cons(current, newReste);
				}
				return liste;
			}	
		} 
		ListeImmutable<E> liste = ListeImmutable.vide();
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
	public static <E> ListeImmutable<E> vide() {
		return new ListeImmutable<E>() {
			
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

	public static <E> ListeImmutable<E> cons(E e, Liste<E> liste) {
		return new ListeImmutable<E>() {

			private E tete = e;
			private Liste<E> reste = liste;

			@Override
			public boolean casVide() {
				return false;
			}

			@Override
			public E tete() {
				return tete;
			}

			@Override
			public ListeImmutable<E> reste() {
				return (ListeImmutable<E>) reste;
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
