package tp.filRouge.v5;

public class CasEtatFileImmutable<E> implements EtatFileImmutable<E> {
	E premier;
	CasEtatFileImmutable<E> suivants;
	@Override
	public E premier() {
		// TODO Auto-generated method stub
		return this.premier;
	}

	@Override
	public CasEtatFileImmutable<E> suivants() {
		// TODO Auto-generated method stub
		return this.suivants;
	}

	@Override
	public CasEtatFileImmutable<E> creer() {
		// TODO Auto-generated method stub
		CasEtatFileImmutable<E> copie=this.suivants;
		while(!copie.estVide()) {
			copie = copie.suivants();
		}
		return copie;
	}

	@Override
	public CasEtatFileImmutable<E> creer(E dernier) {
		// TODO Auto-generated method stub
		CasEtatFileImmutable<E> copie=this;
		while(!copie.estVide()) {
			copie = copie.suivants();
		}
		copie.premier = dernier;
		return copie;
	}
	
	@Override
	public String representation() {
		// TODO Auto-generated method stub
		String rep = "";
		if(premier != null) {
			rep += premier.toString() + " ";
			rep += suivants.representation();
		}
		return rep;
	}

}
