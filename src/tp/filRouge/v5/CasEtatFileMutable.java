package tp.filRouge.v5;

public class CasEtatFileMutable<E> implements EtatFileMutable<E>{
	
	E premier;
	CasEtatFileMutable<E> suivants;
	
	public CasEtatFileMutable() {
		// TODO Auto-generated constructor stub
		this.premier = null;
		this.suivants = null;
	}

	@Override
	public E premier() {
		// TODO Auto-generated method stub
		return this.premier;
	}

	@Override
	public CasEtatFileMutable<E> suivants() {
		// TODO Auto-generated method stub
		return this.suivants;
	}

	@Override
	public CasEtatFileMutable<E> creer() {
		// TODO Auto-generated method stub
		CasEtatFileMutable<E> actuel=this;
		actuel.premier = null;
		actuel.suivants = null;
		return actuel;
	}

	@Override
	public void ajouter(E element) {
		// TODO Auto-generated method stub
		if(this.premier == null) {
			this.premier = element;
			this.suivants = new CasEtatFileMutable<E>();
		}
		else {
			this.suivants.ajouter(element);
		}
	}

	@Override
	public void retirer() {
		// TODO Auto-generated method stub
		this.premier=this.suivants.premier();
		this.suivants=this.suivants.suivants();
	}

	@Override
	public CasEtatFileMutable<E> creerCopie() {
		// TODO Auto-generated method stub
		return this;
	}

	@Override
	public String representation() {
		// TODO Auto-generated method stub
		String rep = "";
		if(premier != null) {
			rep += premier.toString() + " ";
			if(!suivants.estVide()) rep += suivants.representation();
		}
		return rep;
	}
	
}
