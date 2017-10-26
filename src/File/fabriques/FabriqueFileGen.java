package File.fabriques;

import java.util.LinkedList;

import File.FileGen;
import File.FileMutable;

public interface FabriqueFileGen<R> extends FabriqueFile<FileGen<R>, R> {
	/**
	* Méthode qui retourne une nouvelle FileMutable 
	* Cette méthode est nécessaire pour implémenter le constructeur d’une File  
	*
	* @param list doit être une liste de type LinkedList  
	* @return FileMutable une nouvelle FileMutable avec les éléments de la liste
	* @exception 
	*
	*/
	@Override
	default FileGen<R> creerFileMutable(LinkedList<R> list) {
		return new FileMutable<R>(list); 
	}
	/**
	* Méthode qui retourne une nouvelle FileMutable 
	* Cette méthode est nécessaire pour implémenter le constructeur d’une File  
	*
	* @param element doit être un Object de type R    
	* @return FileMutable une nouvelle FileMutable avec le élément element
	* @exception 
	*
	*/
	@Override
	default FileGen<R> creerFileMutable(R element) {
		return new FileMutable<R>(element); 
	}
}
