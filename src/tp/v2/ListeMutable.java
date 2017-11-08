package tp.v2;

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
	@Override
	default ListeMutable<E> miroir(){
		// TODO
		return null;
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
	
	/*
	 * Fabriques (statiques)
	 */
	public static <E> ListeMutable<E> cons(E t, ListeMutable<E> r){
		return new ListeMutable<E>() {
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
