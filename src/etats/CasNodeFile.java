package etats;

public class CasNodeFile<T> implements EtatNodeFile<T> {
	T predecesseur;
	T successeur;
	T n;
	public CasNodeFile(T val, T p,T s) {
		// TODO Auto-generated constructor stub
		this.n=val;
		this.predecesseur=p;
		this.successeur=s;
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
	public T val(){
		return this.n;
	}
	
}
