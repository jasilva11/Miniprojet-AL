package tp.filRouge.v5;

public interface FileMutable<E> extends File<FileMutable<E>,E>, IdentifiableParIteration<FileMutable<E>,E>, RepresentableParIteration<E> {

	void ajouter(E element);
	void retirer();
	
	default FileMutable<E> suivants(){
		return creerCopie();
	}
	
	FileMutable<E> creerCopie();
	
	default FileMutable<E> retrait() {
		return this.suivants();
	}
	
	default FileMutable<E> ajout(E element) {
		return this.suivants().ajout(element);
	}
	
	default FileMutable<E> ajouter(FileMutable<E> file) {
		return null;
	}
	
}
