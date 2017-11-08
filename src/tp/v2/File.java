package tp.v2;

public interface File<E> extends Iterable<E> {

	/*
	 * Accesseurs
	 * - File décomposable en un premier élément suivi des suivants formant une file.
	 * - File mesurable : taille, estVide 
	 */
	E premier();
	File<E> suivants();
	
	default boolean estVide() {
		return this.taille() == 0;
	}
	int taille();
	
	/*
	 * Fabriques
	 * - fabrique d'une file vide
	 */
	File<E> creer();
	
	/*
	 * Services
	 * - méthodes spécifiques aux files : ajout en queue, retrait en tête
	 * - services supplémentaires :
	 *   - ajout d'une seconde file en queue
	 *   - iterator par héritage
	 *   - represenatation et estEgal pour factoriser les définitions de toString et equals
	 */
	File<E> ajout(E dernierDansFile);
	File<E> retrait();
	File<E> ajout(File<E> secondeFile);
	
	default String representation() {
		// TODO 
		return "";
	}

	default boolean estEgal(File<E> file){
		// TODO
		return true;
	}
	
	
}