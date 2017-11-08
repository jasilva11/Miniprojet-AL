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
<<<<<<< HEAD
		// TODO
		if(casCons()) {
			return null;
		}
		else {
			return this;
		}
		
=======
		
		
		return null;
>>>>>>> branch 'master' of https://github.com/jasilva11/Miniprojet-AL
	}
	/*
	 * Fabriques (statiques)
	 */
	
	public static <E> Liste<E> vide() {
		return new Liste<E>() {
<<<<<<< HEAD
			// TODO Définir les méthodes utiles.
			public boolean casVide() {
				return true;
			}
			public boolean casCons() {
				return false;
			}
			 public int taille(){
				return 0;
			}
			 public boolean estVide(){
				return this.taille() == 0;
			}
=======
			
>>>>>>> branch 'master' of https://github.com/jasilva11/Miniprojet-AL
		};
	}
	
	public static <E> Liste<E> cons(E t, Liste<E> r) {
		return new Liste<E>() {
<<<<<<< HEAD
			// TODO Définir les méthodes utiles.
			
=======
			
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
>>>>>>> branch 'master' of https://github.com/jasilva11/Miniprojet-AL
		};
	}
	
}
