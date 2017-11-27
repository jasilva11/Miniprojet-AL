package tp.filRouge.v5;

public interface ServicesFileMutable<E> extends ServiceFile<ServicesFileMutable<E>,E>, IdentifiableParIteration<ServicesFileMutable<E>,E>, RepresentableParIteration<E> {

	ServicesFileMutable<E> retrait();
	
	ServicesFileMutable<E> ajout(E element);
	
	ServicesFileMutable<E> creerCopie();
}
