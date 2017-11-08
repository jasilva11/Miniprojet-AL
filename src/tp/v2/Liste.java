package tp.v2;

import java.util.Iterator;

/*
 * - Liste définie inductivement
 * l ::= Vide (cf. casVide)
 *     | Cons(e, l) (cf. casCons, tete, reste)
 * - accesseurs supplémentaires : taille, estVide
 * - services : iterator, miroir    
 */
public interface Liste<E> extends Iterable<E> {
	/*
	 * Accesseurs
	 */
	default boolean casVide() {
		return false;
	}
	default E tete() {
		throw new UnsupportedOperationException();
	}
	default Liste<E> reste() {
		throw new UnsupportedOperationException();
	}
	default boolean casCons() {
		return false;
	}
	default public int taille(){
		return 0;
	}
	default public boolean estVide(){
		return this.taille() == 0;
	}
	
	/*
	 * Services
	 */
	default Iterator<E> iterator() {
		// TODO
		return null; // Compléter puis utiliser IterateurListe.
	}
	// renvoie la liste dans l'ordre inverse.
	default Liste<E> miroir(){
		
		
		return null;
	}
	/*
	 * Fabriques (statiques)
	 */
	
	public static <E> Liste<E> vide() {
		return new Liste<E>() {
			
		};
	}
	
	public static <E> Liste<E> cons(E t, Liste<E> r) {
		return new Liste<E>() {
			
			private E tete = t;
			private Liste<E> reste = r;
			
			public boolean casVide() {
				return false;
			}
			public E tete() {
				return tete;
			}
			public Liste<E> reste() {
				return reste;
			}
			public boolean casCons() {
				return true;
			}
			public int taille(){
				return reste.taille()+1;
			}
			public boolean estVide(){
				return this.taille() == 0;
			}
		};
	}
	
}
