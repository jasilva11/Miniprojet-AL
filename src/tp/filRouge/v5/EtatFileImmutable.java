package tp.filRouge.v5;

public interface EtatFileImmutable<E> extends EtatFile<EtatFileImmutable<E>, E>{
	EtatFileImmutable<E> creer(E dernier); // Fabrique d'une file formée de la file cible et d'un nouveau dernier élément

}
