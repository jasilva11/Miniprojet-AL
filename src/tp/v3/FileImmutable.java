package tp.v3;

/**
 * Interface qui permet de modeliser une file inmutable. Elle defini les accesseurs, les services et les fabriques.
 * @author  D'LUYZ Daniel
 * @author  SAENZ Henry
 * @author  SILVA Jose
 */
public interface FileImmutable<E> extends File<E> {

	/* 
	 * Accesseurs
	 */
	/**
	* Methode qui retourne  les elements de la pile qui vont apr�s le premier
	* @return Une liste immutable contenant les elements
	*/
	FileImmutable<E> suivants(); // spécialisation du type de retour
	
	/*
	 * Fabriques
	 * - Nouvelle fabrique : nouvelle file à partir de la file cible et d'un élément ajouté en queue.
	 */
	/**
	* Fabrique d'une liste immutable vide
	* @return Une liste immutable qui est vide
	*/
	FileImmutable<E> creer(); // spécialisation du type de retour
	
	/**
	* Fabrique d'une liste immutable, a partir dde la file cible et d'un �l�ment ajout� en queue  
	* @param E �l�ment a ajouter
	* @return Une liste immutable contenant le nouvel �l�ment
	*/
	FileImmutable<E> creer(E dernier); 
	
	/*
	 * Services
	 */
	@Override
	default FileImmutable<E> ajout(E dernierDansFile) {
		return creer(dernierDansFile);
	}
	
	@Override
	default FileImmutable<E> retrait() {
		return this.suivants();
	}
	
	// Complexité O(|secondeFile|)
	@Override
	default FileImmutable<E> ajout(File<E> secondeFile){
		FileImmutable<E> r = this;
		for(E e : secondeFile){
			r = r.ajout(e);
		}
		return r;
	}

}
