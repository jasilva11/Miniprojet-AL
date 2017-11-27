package tp.filRouge.v5;
import java.util.ArrayList;
import java.util.Iterator;

public class CasFileMutable<E> implements ServicesFileMutable<E> {
	
	EtatFileMutable<E> etat;

	public CasFileMutable(EtatFileMutable<E> e){
		etat = e;
	}
	
	@Override
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		ArrayList<E> array = new ArrayList<E>();
		array.add(etat.premier());
		EtatFileMutable<E> suivantsFileMut = etat.suivants();
		while(!suivantsFileMut.suivants().estVide()) {
			array.add(suivantsFileMut.premier());
			suivantsFileMut = suivantsFileMut.suivants();
		}
		return array.iterator();
	}

	@Override
	public int taille() {
		// TODO Auto-generated method stub
		int taille= 0;
		EtatFileMutable<E> actuel = etat.suivants();
		if(etat.premier()!=null) {
			taille++;
			while(!actuel.estVide()) {
				taille++;
				actuel = actuel.suivants();
			}
		}
		return taille;
	}

	@Override
	public CasFileMutable<E> retrait() {
		// TODO Auto-generated method stub
		this.etat.retirer();
		return this;
	}

	@Override
	public CasFileMutable<E> ajout(E element) {
		// TODO Auto-generated method stub
		this.etat.ajouter(element);
		return this;
	}

	@Override
	public CasFileMutable<E> creer() {
		return null;
	}

	@Override
	public CasFileMutable<E> creerCopie() {
		return this;
	}
	
	public String representer() {
		return etat.representation();
	}
	
}
