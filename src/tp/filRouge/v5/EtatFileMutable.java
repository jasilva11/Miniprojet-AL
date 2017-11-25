package tp.filRouge.v5;

public interface EtatFileMutable<E> {
	
	void ajouter(E element);
	
	void retirer();
	
	FileMutable<E> creerCopie();
}
