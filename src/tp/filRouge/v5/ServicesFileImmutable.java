package tp.filRouge.v5;

public interface ServicesFileImmutable<E> extends ServiceFile<ServicesFileImmutable<E>, E>, IdentifiableParIteration<ServicesFileImmutable<E>, E>, RepresentableParIteration<E>{
	
	ServicesFileImmutable<E> ajout(E element);
	
	ServicesFileImmutable<E> retrait();
	
	ServicesFileImmutable<E> creer(E dernier);
}
