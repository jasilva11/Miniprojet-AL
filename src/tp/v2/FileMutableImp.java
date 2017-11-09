package tp.v2;

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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FileMutable<E> creerCopie() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public E premier() {
		return debut.tete();
	}
	
	@Override
	public FileMutable<E> suivants(){ // spécialisation du type de retour
		FileMutable<E> suivants = creer();
		
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
		return null;
	}

	@Override
	public void ajouter(E element) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void retirer() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ajouter(File<E> secondeFile) {
		
	}

}
