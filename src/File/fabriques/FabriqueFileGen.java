package File.fabriques;

import java.util.LinkedList;

import File.FileGen;
import File.FileMutable;

public interface FabriqueFileGen<R> extends FabriqueFile<FileGen<R>, R> {
	/**
	* M�thode qui retourne une nouvelle FileMutable 
	* Cette m�thode est n�cessaire pour impl�menter le constructeur d�une File  
	*
	* @param list doit �tre une liste de type LinkedList  
	* @return FileMutable une nouvelle FileMutable avec les �l�ments de la liste
	* @exception 
	*
	*/
	@Override
	default FileGen<R> creerFileMutable(LinkedList<R> list) {
		return new FileMutable<R>(list); 
	}
	/**
	* M�thode qui retourne une nouvelle FileMutable 
	* Cette m�thode est n�cessaire pour impl�menter le constructeur d�une File  
	*
	* @param element doit �tre un Object de type R    
	* @return FileMutable une nouvelle FileMutable avec le �l�ment element
	* @exception 
	*
	*/
	@Override
	default FileGen<R> creerFileMutable(R element) {
		return new FileMutable<R>(element); 
	}
}
