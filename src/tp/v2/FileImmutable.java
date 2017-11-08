package tp.v2;

public interface FileImmutable<E> extends File<E> {

	/* 
	 * Accesseurs
	 */
	FileImmutable<E> suivants(); // spécialisation du type de retour
	
	/*
	 * Fabriques
	 * - Nouvelle fabrique : nouvelle file à partir de la file cible et d'un élément ajouté en queue.
	 */
	FileImmutable<E> creer(); // spécialisation du type de retour
	FileImmutable<E> creer(E dernier); 
	
	/*
	 * Services
	 */
	@Override
	default FileImmutable<E> ajout(E dernierDansFile) {
		// TODO
		return null;
	}
	@Override
	default FileImmutable<E> retrait() {
		// TODO
		return null;
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
