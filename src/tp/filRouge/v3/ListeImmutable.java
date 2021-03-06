package tp.filRouge.v3;

public interface ListeImmutable<E> extends Liste<ListeImmutable<E>, E>{

	/*
	 * Accesseurs.
	 */

	/*
	 * Fabriques
	 */
	
	@Override
	default ListeImmutable<E> creer() {
		return vide();
	}
	@Override
	default ListeImmutable<E> creer(E e) {
		return cons(e, this);
	}

	/*
	 * Services
	 */


	/*
	 * Fabriques statiques.
	 */
	public static <E> ListeImmutable<E> vide() {
		return new ListeImmutable<E>() {
			@Override
			public boolean casVide(){
				return true;
			}
			@Override
			public int taille() {
				return 0;
			}
			
		};
	}
	
	public static <E> ListeImmutable<E> cons(E t, ListeImmutable<E> r) {
		return new ListeImmutable<E>() {
			private ListeImmutable<E> reste = r;
			private int taille = r.taille() + 1;
			@Override
			public boolean casCons(){
				return true;
			}
			public E tete() {
				return t;
			}
			public ListeImmutable<E> reste() {
				return this.reste;
			}
			@Override
			public int taille() {
				return this.taille;
			}
		};
	}


}
