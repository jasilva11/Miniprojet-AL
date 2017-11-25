package tp.filRouge.v5;

public interface FileImmutable<E> extends File<FileImmutable<E>, E>, IdentifiableParIteration<FileImmutable<E>, E>, RepresentableParIteration<E>{
	
	FileImmutable<E> creer(E dernier); // Fabrique d'une file form�e de la file cible et d'un nouveau dernier �l�ment
	
	@Override
	default FileImmutable<E> ajout(E element){
		return creer(element);		
	}
	
	@Override
	default FileImmutable<E> retrait(){
		return this.suivants();
	}
}
