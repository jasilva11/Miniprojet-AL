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
		return new IterateurListe<E>(this); // Compléter puis utiliser IterateurListe.
	}
	
	default String toStringListe() {
		if(estVide()) {
			return "";
		} else {
			StringBuilder s = new StringBuilder();
			
			s.append(tete().toString()+" - ");
			s.append(reste().toStringListe());
			
			return s.toString();
		}
	}
	
	// renvoie la liste dans l'ordre inverse.
	default Liste<E> miroir(){
		if(casCons()) {
			if(!estVide()) {
				Iterator<E> iterator = iterator();
				E current = this.tete();
				Liste<E> liste = Liste.cons(current, Liste.vide());
				while(iterator.hasNext()) {
					current = iterator.next();
					Liste<E> newReste = Liste.cons(liste.tete(), liste.reste());
					liste = Liste.cons(current, newReste);
				}
				return liste;
			}	
		} 
		 
		Liste<E> liste = Liste.vide();
		return liste;
	}
	/*
	 * Fabriques (statiques)
	 */
	
	public static <E> Liste<E> vide() {
		return new Liste<E>() {
			
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
		};
	}
}
