package File.services;

public interface ServiceFile<R> {
	/**
	* M�thode qui ajoute un �l�ment a la liste 
	* Cette m�thode est n�cessaire pour d�clarer la m�thode qui va nous permettre de
	* ajouter un �l�ment a la liste  dans un moment donne  
	*
	* @param 
	* @return R Un �l�ment de la file 
	* @exception 
	*
	*/
	boolean push(R element);
	/**
	* M�thode qui retire la t�te de la liste 
	* Cette m�thode est n�cessaire pour d�clarer la m�thode qui va nous permettre de
	* retirer la t�te de la liste  dans un moment donne  
	*
	* @param 
	* @return 
	* @exception 
	*
	*/
	boolean pull();
	/**
	* M�thode qui retourne la liste comme un String 
	* Cette m�thode est n�cessaire pour d�clarer la m�thode qui va nous permettre de
	* retourner la liste comme un String dans un moment donne  
	*
	* @param 
	* @return 
	* @exception 
	*
	*/
	String toStringD();
}
