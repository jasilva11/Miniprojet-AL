package tp.v1.file.services;

import tp.v1.file.etats.EtatFile;

/**
 * Interface des services qu'une file mutable peut répondre
 * Le type R correspond au type des données qui seront stockées dans la file
 * 
 * Cette implementation est basée sur le modèle étudié en cours d'Architecture Logicielle à l'IMT Atlantique
 * et qui peut être consulté sur http://www.grall.name/teaching/softwareArchitecture/2018/implementationClass-method.html
 * 
 * @author  D'LUYZ Daniel
 * @author  SAENZ Henry
 * @author  SILVA Jose
 */
public interface ServiceFileMutable<T extends ServiceFile<R> ,R> extends ServiceFile<R>, EtatFile<R>{
	
	/**
	* M�thode qui ajoute un �l�ment a la liste 
	* Cette m�thode est n�cessaire pour implementer la m�thode qui ajoute 
	* un �l�ment a la file mutable.  
	*
	* @param R l'élément à ajouter dans la file
	* @return true si la file mutable ajoute l'�l�ment, false au cas contraire  
	* @exception 
	*
	*/
	@Override
	default boolean push(R node) {
		this.liste().addLast(node);
		return true;
	}
	
	/**
	* M�thode qui retire la t�te de la file mutable 
	* Cette m�thode est n�cessaire pour implementer la m�thode qui retire 
	* la t�te de la file mutable
	*
	* @param 
	* @return true si la file mutable retire la t�te, false au cas contraire
	* @exception 
	*
	*/
	@Override
	default boolean pull() {
		this.liste().removeFirst();
		return true;
	}
	
	/**
	* M�thode qui retourne la file mutable comme un String 
	* Cette m�thode est n�cessaire pour implementer la m�thode qui retourne 
	* la file mutable comme un String 
	*
	* @param 
	* @return la répresentation String de la file mutable
	* @exception 
	*
	*/
	@Override
	default String toStringD() { 
		return this.liste().toString();
	}
}
