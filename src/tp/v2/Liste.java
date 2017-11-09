package tp.v2;

import java.util.ArrayList;
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
		return new IterateurListe<>(this); // Compléter puis utiliser IterateurListe.
	}
	
	public default String toStringListe() {
		
		if(estVide()) {
			return "[]";
		} else {
			StringBuilder s = new StringBuilder();
			
			s.append(reste().toString()+"-");
			s.append(tete().toString());
			
			return s.toString();
		}
	}
	
	// renvoie la liste dans l'ordre inverse.
	default Liste<E> miroir(){
		if(casCons()) {
			Iterator<E> iterator = iterator();
			E current = iterator.next();
			ArrayList<E> elements=new ArrayList<>();
			while(iterator.hasNext()) {
				elements.add(current);
				current = iterator.next();
			}
			Liste<E> t=vide();
			for(int i=0;i<elements.size();i++) {
				
				if(i==0) {
					t=cons(elements.get(i), vide());
				}
				else {
					t=cons(elements.get(i), t);
				}
			}
			return t;
		}
		else {
			return this;
		}
		
	}
	/*
	 * Fabriques (statiques)
	 */
	
	public static <E> Liste<E> vide() {
		return new Liste<E>() {
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
