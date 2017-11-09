package tp.v2;

import java.util.Iterator;

public class FileImmutableImp<E> implements FileImmutable<E>{

	private Liste<E> debut;
	
	private Liste<E> fin;
	
	@Override
	public E premier() {
		// TODO Auto-generated method stub
		return debut.tete();
	}

	@Override
	public int taille() {
		// TODO Auto-generated method stub
		return debut.taille() + fin.taille();
	}

	@Override
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		Liste<E> liste = new Liste<E>() {};
		for(E e:debut)
		{
			Liste.cons(e, liste);
		}
		for(E e:fin)
		{
			Liste.cons(e, liste);
		}
		return new IterateurListe<>(liste.miroir());
	}

	@Override
	public FileImmutable<E> suivants() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FileImmutable<E> creer() {
		// TODO Auto-generated method stub
		return new FileImmutableImp<E>();
	}

	@Override
	public FileImmutable<E> creer(E dernier) {
		// TODO Auto-generated method stub
		FileImmutable<E> res = creer();
		return null;
	}

}
