package File.fabriques;

import java.util.LinkedList;

public interface FabriqueFileMutable<File,R> {
	/**
	* Méthode qui retourne une nouvelle FileMutable 
	* Cette méthode est nécessaire pour déclarer le constructeur d’une File  
	*
	* @param list doit être une liste de type LinkedList  
	* @return FileMutable une nouvelle FileMutable avec les éléments de la liste
	* @exception 
	*
	*/
	public File creerFileMutable(LinkedList<R> list);
	/**
	* Méthode qui retourne une nouvelle FileMutable 
	* Cette méthode est nécessaire pour déclarer le constructeur d’une File  
	*
	* @param element doit être un Object de type R    
	* @return FileMutable une nouvelle FileMutable avec le élément element
	* @exception 
	*
	*/
	public File creerFileMutable(R element);
}
