package File.fabriques;

import java.util.LinkedList;

import File.FileGen;
import File.FileMutable;

/**
 * Fabrique des FilesGen.
 * Pour l'instant cette fabrique sert seulement à fabriquer des files mutables
 * Le type R correspond au type des données qui seront stockées dans la file
 * 
 * Cette implementation est basée sur le modèle étudié en cours d'Architecture Logicielle à l'IMT Atlantique
 * et qui peut être consulté sur http://www.grall.name/teaching/softwareArchitecture/2018/implementationClass-method.html
 * 
 * @author  D'LUYZ Daniel
 * @author  SAENZ Henry
 * @author  SILVA Jose
 */
public interface FabriqueFileGen<R> extends FabriqueFile<FileGen<R>, R> {
	
	/**
	* M�thode qui retourne une nouvelle FileMutable 
	* Cette m�thode est n�cessaire pour impl�menter le constructeur d�une File  
	*
	* @param LinkedList<R> La liste des données de type R qui sert à créer la file mutable 
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
	* @param R L'élément de type R avec lequel la file mutable est créée    
	* @return FileMutable une nouvelle FileMutable avec le �l�ment element
	* @exception 
	*
	*/
	@Override
	default FileGen<R> creerFileMutable(R element) {
		return new FileMutable<R>(element); 
	}
}
