package tp.filRouge.v5;

public interface EtatFileImmutable<E> extends EtatFile<EtatFileImmutable<E>, E> {
	
	FileImmutable<E> creer(E dernier);
	
}
