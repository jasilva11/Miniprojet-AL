package File.fabriques;

import java.util.LinkedList;

public interface FabriqueFileMutable<File,R> {
	/**
	* M�thode qui retourne une nouvelle FileMutable 
	* Cette m�thode est n�cessaire pour d�clarer le constructeur d�une File  
	*
	* @param list doit �tre une liste de type LinkedList  
	* @return FileMutable une nouvelle FileMutable avec les �l�ments de la liste
	* @exception 
	*
	*/
	public File creerFileMutable(LinkedList<R> list);
	/**
	* M�thode qui retourne une nouvelle FileMutable 
	* Cette m�thode est n�cessaire pour d�clarer le constructeur d�une File  
	*
	* @param element doit �tre un Object de type R    
	* @return FileMutable une nouvelle FileMutable avec le �l�ment element
	* @exception 
	*
	*/
	public File creerFileMutable(R element);
}
