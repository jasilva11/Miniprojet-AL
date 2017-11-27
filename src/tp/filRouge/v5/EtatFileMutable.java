package tp.filRouge.v5;

public interface EtatFileMutable<E> extends EtatFile<EtatFileMutable<E>, E>{
	void ajouter(E element);
	void retirer();
	EtatFileMutable<E> creerCopie();
}
