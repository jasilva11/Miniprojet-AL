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
	public static <E> ListeMutable<E> cons(E t, ListeMutable<E> r){
		return new ListeMutable<E>() {
			private E tete = t;
			private ListeMutable<E> reste = r;
			
			public E tete() {
				return tete;
			}
			
			public ListeMutable<E> reste() {
				return reste;
			}
			
			public void changerReste(ListeMutable<E> reste) {
				this.reste = reste;
			}
			
			public void changerTete(E tete) {
				this.tete = tete;
			}
			
		};
	}
	public static <E> ListeMutable<E> vide() {
		return new ListeMutable<E>() {
			
								
		};
	}
	
}
