package File.etats;

import java.util.LinkedList;

public interface EtatFile<R> {
	/**
	* Méthode qui retourne la taille de la file
	* Cette méthode est nécessaire pour déclarer la méthode qui va nous permettre
	* de connaître la taille de la file dans un moment donne  
	*
	* @param 
	* @return int La taille actuelle de la file 
	* @exception 
	*
	*/
	public int tailleFile();

	/**
	* Méthode qui retourne la téte de la file
	* Cette méthode est nécessaire pour déclarer la méthode qui va nous permettre de
	*  connaître la téte de la file dans un moment donne  
	*
	* @param 
	* @return R La téte actuelle de la file 
	* @exception 
	*
	*/
	public R tete();
	
	/**
	* Méthode qui retourne la queue de la file
	* Cette méthode est nécessaire pour déclarer la méthode qui va nous permettre de
	*  connaître la queue de la file dans un moment donne  
	*
	* @param 
	* @return R La queue actuelle de la file 
	* @exception 
	*
	*/
	public R queue();
	/**
	* Méthode qui retourne la liste qui représente la file
	* Cette méthode est nécessaire pour déclarer la méthode qui va nous permettre de
	*  connaître la liste qui représente la file dans un moment donne  
	*
	* @param 
	* @return int La liste actuelle de la file 
	* @exception 
	*
	*/
	public LinkedList<R> liste();
	
}
