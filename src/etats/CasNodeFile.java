package etats;

public class CasNodeFile<T> implements EtatNodeFile<T> {
	T predecesseur;
	T successeur;
	int n;
	public CasNodeFile(int val) {
		// TODO Auto-generated constructor stub
		this.n=val;
	}
	@Override
	public boolean estTete(){
		return this.getPredecesseur()==null;
	}
	@Override
	public boolean estQueue(){
		return this.getSuccesseur()==null;
	}
	@Override
	public int val(){
		return this.n;
	}
	
}
