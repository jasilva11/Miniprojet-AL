package File.services;

import File.etats.EtatFile;

public interface ServiceFileMutable<T extends ServiceFile<R> ,R> extends ServiceFile<R>, EtatFile<R>{
	/**
	* M�thode qui ajoute un �l�ment a la liste 
	* Cette m�thode est n�cessaire pour implementer la m�thode qui ajoute 
	* un �l�ment a la liste.  
	*
	* @param 
	* @return true si la liste ajoute l'�l�ment   
	* @exception 
	*
	*/
	@Override
	default boolean push(R node) {
		this.liste().addLast(node);
		return true;
	}
	/**
	* M�thode qui retire la t�te de la liste 
	* Cette m�thode est n�cessaire pour implementer la m�thode qui retire 
	* la t�te de la liste  
	*
	* @param 
	* @return true si la liste retire la t�te 
	* @exception 
	*
	*/
	@Override
	default boolean pull() {
		this.liste().removeFirst();
		return true;
	}
	/**
	* M�thode qui retourne la liste comme un String 
	* Cette m�thode est n�cessaire pour implementer la m�thode qui retourne 
	* la liste comme un String 
	*
	* @param 
	* @return 
	* @exception 
	*
	*/
	@Override
	default String toStringD() { 
		return this.liste().toString();
	}
}
