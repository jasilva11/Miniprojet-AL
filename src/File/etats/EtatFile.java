package File.etats;

import java.util.LinkedList;

public interface EtatFile<R> {
	/**
	* M�thode qui retourne la taille de la file
	* Cette m�thode est n�cessaire pour d�clarer la m�thode qui va nous permettre
	* de conna�tre la taille de la file dans un moment donne  
	*
	* @param 
	* @return int La taille actuelle de la file 
	* @exception 
	*
	*/
	public int tailleFile();

	/**
	* M�thode qui retourne la t�te de la file
	* Cette m�thode est n�cessaire pour d�clarer la m�thode qui va nous permettre de
	*  conna�tre la t�te de la file dans un moment donne  
	*
	* @param 
	* @return R La t�te actuelle de la file 
	* @exception 
	*
	*/
	public R tete();
	
	/**
	* M�thode qui retourne la queue de la file
	* Cette m�thode est n�cessaire pour d�clarer la m�thode qui va nous permettre de
	*  conna�tre la queue de la file dans un moment donne  
	*
	* @param 
	* @return R La queue actuelle de la file 
	* @exception 
	*
	*/
	public R queue();
	/**
	* M�thode qui retourne la liste qui repr�sente la file
	* Cette m�thode est n�cessaire pour d�clarer la m�thode qui va nous permettre de
	*  conna�tre la liste qui repr�sente la file dans un moment donne  
	*
	* @param 
	* @return int La liste actuelle de la file 
	* @exception 
	*
	*/
	public LinkedList<R> liste();
	
}
