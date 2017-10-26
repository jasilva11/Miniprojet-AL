package File.services;

import File.etats.EtatFile;

public interface ServiceFileMutable<T extends ServiceFile<R> ,R> extends ServiceFile<R>, EtatFile<R>{
	/**
	* Méthode qui ajoute un élément a la liste 
	* Cette méthode est nécessaire pour implementer la méthode qui ajoute 
	* un élément a la liste.  
	*
	* @param 
	* @return true si la liste ajoute l'élément   
	* @exception 
	*
	*/
	@Override
	default boolean push(R node) {
		this.liste().addLast(node);
		return true;
	}
	/**
	* Méthode qui retire la téte de la liste 
	* Cette méthode est nécessaire pour implementer la méthode qui retire 
	* la téte de la liste  
	*
	* @param 
	* @return true si la liste retire la téte 
	* @exception 
	*
	*/
	@Override
	default boolean pull() {
		this.liste().removeFirst();
		return true;
	}
	/**
	* Méthode qui retourne la liste comme un String 
	* Cette méthode est nécessaire pour implementer la méthode qui retourne 
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
