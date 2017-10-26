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
	/**
	* Méthode qui retourne la taille de la file
	* Cette méthode est nécessaire pour connaître la taille de la file dans un moment donne  
	*
	* @param 
	* @return int La taille actuelle de la file 
	* @exception 
	*
	*/
	@Override
	public int tailleFile() {
		// TODO Auto-generated method stub
		return this.liste.size();
	}
	/**
	* Méthode qui retourne la téte de la file
	* Cette méthode est nécessaire pour connaître la téte de la file dans un moment donne  
	*
	* @param 
	* @return R La téte actuelle de la file 
	* @exception 
	*
	*/
	@Override
	public R tete() {
		// TODO Auto-generated method stub
		return this.liste.getFirst();
	}
	/**
	* Méthode qui retourne la queue de la file
	* Cette méthode est nécessaire pour connaître la queue de la file dans un moment donne  
	*
	* @param 
	* @return R La queue actuelle de la file 
	* @exception 
	*
	*/
	@Override
	public R queue() {
		// TODO Auto-generated method stub
		return this.liste.getLast();
	}
	/**
	* Méthode qui retourne la liste qui représente la file
	* Cette méthode est nécessaire pour connaître la liste qui représente la file dans un moment donne  
	*
	* @param 
	* @return int La liste actuelle de la file 
	* @exception 
	*
	*/
	@Override
	public LinkedList<R> liste() {
		// TODO Auto-generated method stub
		return this.liste;
	}

}
