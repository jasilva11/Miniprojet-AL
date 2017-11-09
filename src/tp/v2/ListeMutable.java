package tp.v2;

import java.util.Iterator;

/**
 * Interface qui permet de modeliser une liste mutable. Elle contient les accesseurs, les services et les fabriques des listes.
 * @author  D'LUYZ Daniel
 * @author  SAENZ Henry
 * @author  SILVA Jose
 */
public interface ListeMutable<E> extends Liste<E>{

	/*
	 * Accesseurs.
	 */
	/**
	* Methode qui retourne le reste de la liste mutable
	* @return Le reste de la liste mutable. C'est a dire tout ce que n'est pas la tete
	* @throws UnsupportedOperationException au cas ou une operation qui n'est pas supportée est executee
	*/
	default ListeMutable<E> reste() {
		throw new UnsupportedOperationException();
	}
	
	/**
	* Methode qui sert a changer le reste de la liste mutable
	* @param ListeMutable<E> Le nouveau reste de la liste mutable
	* @throws UnsupportedOperationException au cas ou une operation qui n'est pas supportée est executee
	*/
	default void changerReste(ListeMutable<E> reste) {
		throw new UnsupportedOperationException();
	}
	
	/**
	* Methode qui sert a changer la tete
	* @param E La nouvelle tete de la liste mutable
	* @throws UnsupportedOperationException au cas ou une operation qui n'est pas supportée est executee
	*/
	default void changerTete(E tete) {
		throw new UnsupportedOperationException();
	}

	/*
	 * Services
	 */
	/**
	* Methode qui renvoie l'inverse de la liste mutable
	* @return Une liste mutable qui contient le miroir de la liste mutable
	* @throws UnsupportedOperationException au cas ou une operation qui n'est pas supportée est executee
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
	/**
	* Fabrique d'une liste mutable qui n'est pas vide
	* @param E la tete de la nouvelle liste mutable
	* @param ListeMutable<E> le reste de la nouvelle liste mutable
	* @return Une liste mutable qui n'est pas vide
	* @throws UnsupportedOperationException au cas ou une operation qui n'est pas supportée est executee
	*/
	public static <E> ListeMutable<E> cons(E t, ListeMutable<E> r){
		return new ListeMutable<E>() {
			
			/**
			 * La tete de la liste mutable
			 */
			private E tete = t;
			
			/**
			 *  Le reste de la liste mutable
			 */
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
			
			@Override
			public int taille(){
				int taille = 0;
				if(tete!=null) {
					taille++;
					taille += reste.taille();
				};
				return taille;
			}
			
			@Override
			public boolean estVide(){
				if(tete != null) {
					return false;
				} else {
					return true;
				}
			}
			
			@Override
			public boolean casVide() {
				return false;
			}
			
			@Override
			public boolean casCons() {
				return true;
			}	
		};
	}
	
	/**
	* Fabrique d'une liste mutable vide
	* @return Une liste mutable qui est vide
	* @throws UnsupportedOperationException au cas ou une operation qui n'est pas supportée est executee
	*/
	public static <E> ListeMutable<E> vide() {
		return new ListeMutable<E>() {
			
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
				return true;
			}						
		};
	}	
}