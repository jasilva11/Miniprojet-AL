package tp.filRouge.v5;

public interface EtatFileMutable<E> extends EtatFile<FileMutable<E>, E> {
	
	void ajouter(E element);
	
	void retirer();
	
	FileMutable<E> creerCopie();
}
