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
	* M�thode qui retourne la taille de la file
	* Cette m�thode est n�cessaire pour conna�tre la taille de la file dans un moment donne  
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
	* M�thode qui retourne la t�te de la file
	* Cette m�thode est n�cessaire pour conna�tre la t�te de la file dans un moment donne  
	*
	* @param 
	* @return R La t�te actuelle de la file 
	* @exception 
	*
	*/
	@Override
	public R tete() {
		// TODO Auto-generated method stub
		return this.liste.getFirst();
	}
	/**
	* M�thode qui retourne la queue de la file
	* Cette m�thode est n�cessaire pour conna�tre la queue de la file dans un moment donne  
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
	* M�thode qui retourne la liste qui repr�sente la file
	* Cette m�thode est n�cessaire pour conna�tre la liste qui repr�sente la file dans un moment donne  
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
