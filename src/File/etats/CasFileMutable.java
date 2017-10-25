package File.etats;

import java.util.LinkedList;

public class CasFileMutable<R> implements EtatFile<R> {
	
	private LinkedList <R> liste;
	
	public CasFileMutable(LinkedList<R> list) {
		// TODO Auto-generated constructor stub
		this.liste=list;
	}
	
	public CasFileMutable(R element) {
		// TODO Auto-generated constructor stub
		this.liste= new LinkedList<R>();
		this.liste.add(element);
	}
	
	@Override
	public int tailleFile() {
		// TODO Auto-generated method stub
		return this.liste.size();
	}

	@Override
	public R tete() {
		// TODO Auto-generated method stub
		return this.liste.getFirst();
	}

	@Override
	public R queue() {
		// TODO Auto-generated method stub
		return this.liste.getLast();
	}
	
	@Override
	public LinkedList<R> liste() {
		// TODO Auto-generated method stub
		return this.liste;
	}

}
