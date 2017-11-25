package tp.filRouge.v5;

public class CasEtatFileMutable<E> implements EtatFileMutable<E>{
	
	private CasEtatFileMutable<E> fileM;

	@Override
	public E premier() {
		// TODO Auto-generated method stub
		return fileM.premier();
	}

	@Override
	public FileMutable<E> suivants() {
		// TODO Auto-generated method stub
		return fileM.suivants();
	}

	@Override
	public boolean estVide() {
		// TODO Auto-generated method stub
		return fileM.estVide();
	}

	@Override
	public FileMutable<E> creer() {
		// TODO Auto-generated method stub
		return fileM.creer();
	}

	@Override
	public void ajouter(E element) {
		// TODO Auto-generated method stub
		fileM.ajouter(element);
	}

	@Override
	public void retirer() {
		// TODO Auto-generated method stub
		fileM.retirer();
	}

	@Override
	public FileMutable<E> creerCopie() {
		// TODO Auto-generated method stub
		return fileM.creerCopie();
	}

}
