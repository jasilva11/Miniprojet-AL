package tp.v2;

/**
 * Interface qui permet de modeliser une file mutable. Elle contient les accesseurs, les services et les fabriques.
 * @author  D'LUYZ Daniel
 * @author  SAENZ Henry
 * @author  SILVA Jose
 */
public interface FileMutable<E> extends File<E> {

	/*
	 * Accesseurs
	 * - nouveaux accesseurs permettant une modification en place : ajouter, retirer
	 */
	@Override
	default FileMutable<E> suivants(){ // spécialisation du type de retour
		throw new UnsupportedOperationException();
	}

	/**
	* Methode qui ajoute un element en fin de la file
	* @param E L'element a ajouter en fin de la file
	*/
	void ajouter(E element);
	
	/**
	* Methode qui retire le premier element de la file
	*/
	void retirer();
	
	/*
	 * Fabriques
	 * - nouvelle fabrique renvoyant une copie
	 */
	/**
	* Methode qui cree une nouvelle file mutable vide
	* @return Une nouvelle file mutable qui est vide
	*/
	FileMutable<E> creer();
	
	/**
	* Methode qui cree une copie de la file mutable
	* @return Une copie de la file mutable
	*/
	FileMutable<E> creerCopie();
	
	/*
	 * Services
	 * - nouveau service : ajout en place exploitant la mutabilité pour 
	 *   une complexité en O(1) (temps constant) (cf. ajouter)
	 */
	@Override
	default FileMutable<E> ajout(E dernierDansFile) {
		this.ajouter(dernierDansFile);
		return this;
	}
	@Override
	default FileMutable<E> retrait() {
		this.retirer();
		return this;
	}
	
	// Complexité O(|secondeFile|)
	@Override
	default FileMutable<E> ajout(File<E> secondeFile) {
		FileMutable<E> r = this;
		for(E e : secondeFile){
			r = r.ajout(e);
		}
		return r;
	}
	
	// Complexité en O(1).
	/**
	* Methode qui ajoute une file en fin de la file mutable
	* @param File<E> La file a ajouter en fin de la file mutable
	*/
	void ajouter(File<E> secondeFile);

}
