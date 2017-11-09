package tp.v2;

import java.util.Iterator;

public interface ListeMutable<E> extends Liste<E>{

	/*
	 * Accesseurs.
	 */
	default ListeMutable<E> reste() {
		throw new UnsupportedOperationException();
	}
	
	default void changerReste(ListeMutable<E> reste) {
		throw new UnsupportedOperationException();
	}
	
	default void changerTete(E tete) {
		throw new UnsupportedOperationException();
	}

	/*
	 * Services
	 */
	default ListeMutable<E> miroir(){
		if(casCons()) {
			if(!estVide()) {
				Iterator<E> iterator = this.iterator();
				E current = this.tete();
				ListeMutable<E> liste = ListeMutable.cons(current, ListeMutable.vide());
				while(iterator.hasNext()) {
					current = iterator.next();
					ListeMutable<E> newReste = ListeMutable.cons(liste.tete(), liste.reste());
					liste = ListeMutable.cons(current, newReste);
				}
				return liste;
			}	
		} 
		 
		ListeMutable<E> liste = ListeMutable.vide();
		return liste;
	}
	
	/*
	 * Fabriques (statiques)
	 */
	public static <E> ListeMutable<E> cons(E t, ListeMutable<E> r){
		return new ListeMutable<E>() {
			// TODO Définir les méthodes utiles.
			
			private E tete = t;
			private ListeMutable<E> reste = r;
			
			@Override
			public E tete() {
				return tete;
			}
			
			@Override
			public ListeMutable<E> reste() {
				return reste;
			}
			
			@Override
			public void changerReste(ListeMutable<E> reste) {
				this.reste = reste;
			}
			
			@Override
			public void changerTete(E tete) {
				ListeMutable<E> newReste = cons(this.tete, this.reste);
				changerReste(newReste);
				this.tete = tete;
			}
			
			public int taille(){
				int taille = 0;
				if(tete!=null) {
					taille++;
					taille += reste.taille();
				};
				return taille;
			}
			
			 public boolean estVide(){
				if(tete != null) {
					return false;
				} else {
					return true;
				}
			}
			
			public boolean casVide() {
				return false;
			}
			 
			public boolean casCons() {
				return true;
			}
			
		};
	}
	
	public static <E> ListeMutable<E> vide() {
		return new ListeMutable<E>() {
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
				return true;
			}						
		};
	}
	
}
