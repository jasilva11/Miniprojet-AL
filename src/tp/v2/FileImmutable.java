package tp.v2;

public interface FileImmutable<E> extends File<E> {

	/* 
	 * Accesseurs
	 */
	/**
	* Methode qui retourne  les elements de la pile qui vont après le premier
	* @return Une liste immutable contenant les elements
	*/
	FileImmutable<E> suivants(); // spÃ©cialisation du type de retour
	
	/*
	 * Fabriques
	 * - Nouvelle fabrique : nouvelle file Ã  partir de la file cible et d'un Ã©lÃ©ment ajoutÃ© en queue.
	 */
	/**
	* Fabrique d'une liste immutable vide
	* @return Une liste immutable qui est vide
	*/
	FileImmutable<E> creer(); // spÃ©cialisation du type de retour
	
	/**
	* Fabrique d'une liste immutable, a partir dde la file cible et d'un élément ajouté en queue  
	* @param E élément a ajouter
	* @return Une liste immutable contenant le nouvel élément
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
	
	// ComplexitÃ© O(|secondeFile|)
	@Override
	default FileImmutable<E> ajout(File<E> secondeFile){
		FileImmutable<E> r = this;
		for(E e : secondeFile){
			r = r.ajout(e);
		}
		return r;
	}

}
