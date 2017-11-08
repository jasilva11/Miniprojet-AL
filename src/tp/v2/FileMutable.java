package tp.v2;

public interface FileMutable<E> extends File<E> {

	/*
	 * Accesseurs
	 * - nouveaux accesseurs permettant une modification en place : ajouter, retirer
	 */
	@Override
	default FileMutable<E> suivants(){ // spécialisation du type de retour
		// TODO
		return null;
	}

	void ajouter(E element);
	void retirer();
	
	/*
	 * Fabriques
	 * - nouvelle fabrique renvoyant une copie
	 */
	FileMutable<E> creer();
	FileMutable<E> creerCopie();
	
	/*
	 * Services
	 * - nouveau service : ajout en place exploitant la mutabilité pour 
	 *   une complexité en O(1) (temps constant) (cf. ajouter)
	 */
	@Override
	default FileMutable<E> ajout(E dernierDansFile) {
		// TODO 
		return this;
	}
	@Override
	default FileMutable<E> retrait() {
		// TODO
		return this;
	}
	// Complexité O(|secondeFile|)
	@Override
	default FileMutable<E> ajout(File<E> secondeFile) {
		// TODO (même code que FileImmutable.ajout)
		return null;
	}
	
	// Complexité en O(1).
	void ajouter(File<E> secondeFile);

}
