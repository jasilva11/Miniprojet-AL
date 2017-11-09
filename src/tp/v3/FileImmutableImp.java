package tp.v3;

import java.util.Iterator;

public class FileImmutableImp<E> implements FileImmutable<E>{

	ListeImmutable<E> debut;

	ListeImmutable<E> fin;

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
		ListeImmutable<E> liste = new ListeImmutable<E>() {};
		for(E e:debut)
		{
			ListeImmutable.cons(e, liste);
		}
		for(E e:fin.miroir())
		{
			ListeImmutable.cons(e, liste);
		}
		return new IterateurListe<>(liste.miroir());
	}

	@Override
	public FileImmutable<E> suivants() {
		// TODO Auto-generated method stub
		FileImmutable<E> suivants = creer();

		Iterator<E> itDebut = debut.iterator();

		if(taille()>1) {
			E element = itDebut.next();
			while(itDebut.hasNext()) {
				suivants.ajout(element);
				element = itDebut.next();
			}
		} 

		if(fin.taille()>0) {
			Iterator<E> itFin = fin.iterator();
			while(itDebut.hasNext()) {
				E element = itFin.next();
				suivants.ajout(element);
			}
		}

		return suivants;
	}

	@Override
	public FileImmutable<E> creer() {
		// TODO Auto-generated method stub
		this.debut = ListeImmutable.vide();
		this.fin = ListeImmutable.vide();
		return this;
	}

	@Override
	public FileImmutable<E> creer(E dernier) {
		// TODO Auto-generated method stub
		FileImmutableImp<E> res = (FileImmutableImp<E>) creer();
		res.debut = this.debut;
		res.fin = ListeImmutable.cons(dernier, this.fin);
		return res;
	}

}
