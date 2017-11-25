package tp.filRouge.v5;

import java.util.ArrayList;
import java.util.Iterator;

public class CasFileMutable<E> implements FileMutable<E> {

	@Override
	public E premier() {
		return this.premier();
	}

	@Override
	public FileMutable<E> creer() {
		while(this.taille()>=1) {
			this.retrait();
		}
		return this;
	}

	@Override
	public Iterator<E> iterator() {
		ArrayList<E> array = new ArrayList<E>();
		array.add(this.premier());
		FileMutable<E> suivantsFileMut = this.suivants();
		while(suivantsFileMut.suivants().taille() >= 1) {
			array.add(suivantsFileMut.premier());
			suivantsFileMut = suivantsFileMut.suivants();
		}
		return array.iterator();
	}

	@Override
	public int taille() {
		if (this.suivants().taille()>0) return this.suivants().taille()+1;
		else return 1;
	}

	@Override
	public void ajouter(E element) {
		this.suivants().ajout(element);
	}

	@Override
	public void retirer() {
		this.retrait();
	}

	@Override
	public FileMutable<E> creerCopie() {
		FileMutable<E> copieFille = this.creer();
		copieFille.ajout(this.premier());
		copieFille.ajout(this.suivants());
		return copieFille;
	}
	
}
