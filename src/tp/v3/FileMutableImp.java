package tp.v3;

import java.util.Iterator;

public class FileMutableImp<E> implements FileMutable<E> {

	/**
	 * La liste mutable qui represente le debut de la file mutable
	 */
	private ListeMutable<E> debut;
	
	/**
	 * La liste mutable qui represente la fin de la file mutable
	 */
	private ListeMutable<E> fin;
	
	@Override
	public FileMutable<E> creer() {
		this.debut = ListeMutable.vide();
		this.fin = ListeMutable.vide();
		return this;
	}

	@Override
	public FileMutable<E> creerCopie() {
		FileMutable<E> copie = creer();
		
		if(taille()>0) {
			Iterator<E> itDebut = debut.iterator();
			while(itDebut.hasNext()) {
				E element = itDebut.next();
				copie.ajout(element);
			}
			
			if(fin.taille()>0) {
				Iterator<E> itFin = fin.iterator();
				while(itDebut.hasNext()) {
					E element = itFin.next();
					copie.ajout(element);
				}
			}
		}
		
		return copie;
	}
	
	@Override
	public E premier() {
		return debut.tete();
	}
	
	@Override
	public FileMutable<E> suivants(){ // spécialisation du type de retour
		FileMutable<E> suivants = creerCopie().retrait();
		
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
	public int taille() {
		return debut.taille()+fin.taille();
	}

	@Override
	public Iterator<E> iterator() {
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
	public void ajouter(E element) {
		this.debut.changerTete(element);
		this.debut = debut.miroir();
	}

	@Override
	public void retirer() {
		if(taille()>0) {
			this.debut = (ListeMutable<E>) debut.reste();
			if(this.debut.taille()==0 && this.fin.taille()>0) {
				this.debut = this.fin.miroir();
			}
		}
	}

	@Override
	public void ajouter(File<E> secondeFile) {
		for(E element: secondeFile) {
			ajouter(element);
		}
	}

}
