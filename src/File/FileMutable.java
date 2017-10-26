package File;

import java.util.LinkedList;

import File.etats.CasFileMutable;
import File.fabriques.FabriqueFileGen;
import File.services.ServiceFileMutable;

/**
 * Representation d'une file mutable
 * Le type R correspond au type des données qui seront stockées dans la file
 * 
 * Cette implementation est basée sur le modèle étudié en cours d'Architecture Logicielle à l'IMT Atlantique
 * et qui peut être consulté sur http://www.grall.name/teaching/softwareArchitecture/2018/implementationClass-method.html
 * 
 * @author  D'LUYZ Daniel
 * @author  SAENZ Henry
 * @author  SILVA Jose
 */
public class FileMutable<R> extends CasFileMutable<R> implements FileGen<R>, ServiceFileMutable<FileGen<R>,R>, FabriqueFileGen<R> {

	/**
	* Premier constructeur d'une FileMutable qui reçoit par paramétre une liste qui sera 
	* initialement la file mutable
	*
	* @param LinkedList<R> La liste de données de type R qui sera la base de la file mutable
	*
	*/
	public FileMutable(LinkedList<R> list) {
		super(list);
	}
	
	/**
	* Deuxième constructeur d'une FileMutable qui reçoit par paramétre son premier élément,
	* créé la file et ajoute directement ce premier élément
	*
	* @param R Le premier élément à ajouter dans la file mutable
	*
	*/
	public FileMutable(R element) {
		super(element);
	}

}
