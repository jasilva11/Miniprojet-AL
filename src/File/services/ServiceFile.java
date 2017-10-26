package File.services;

public interface ServiceFile<R> {
	/**
	* Méthode qui ajoute un élément a la liste 
	* Cette méthode est nécessaire pour déclarer la méthode qui va nous permettre de
	* ajouter un élément a la liste  dans un moment donne  
	*
	* @param 
	* @return R Un élément de la file 
	* @exception 
	*
	*/
	boolean push(R element);
	/**
	* Méthode qui retire la téte de la liste 
	* Cette méthode est nécessaire pour déclarer la méthode qui va nous permettre de
	* retirer la téte de la liste  dans un moment donne  
	*
	* @param 
	* @return 
	* @exception 
	*
	*/
	boolean pull();
	/**
	* Méthode qui retourne la liste comme un String 
	* Cette méthode est nécessaire pour déclarer la méthode qui va nous permettre de
	* retourner la liste comme un String dans un moment donne  
	*
	* @param 
	* @return 
	* @exception 
	*
	*/
	String toStringD();
}
