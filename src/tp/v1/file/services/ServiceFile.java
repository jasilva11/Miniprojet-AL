package tp.v1.file.services;

/**
 * Interface qui sert à definir les services qu'une file devrait pouvoir répondre
 * Le type R correspond au type des données qui seront stockées dans la file
 * 
 * Cette implementation est basée sur le modèle étudié en cours d'Architecture Logicielle à l'IMT Atlantique
 * et qui peut être consulté sur http://www.grall.name/teaching/softwareArchitecture/2018/implementationClass-method.html
 * 
 * @author  D'LUYZ Daniel
 * @author  SAENZ Henry
 * @author  SILVA Jose
 */
public interface ServiceFile<R> {
	
	/**
	* M�thode qui ajoute un �l�ment a la liste 
	* Cette m�thode est n�cessaire pour d�clarer la m�thode qui va nous permettre de
	* ajouter un �l�ment a la liste  dans un moment donne  
	*
	* @param 
	* @return R Un �l�ment de la file 
	* @exception 
	*
	*/
	boolean push(R element);
	
	/**
	* M�thode qui retire la t�te de la liste 
	* Cette m�thode est n�cessaire pour d�clarer la m�thode qui va nous permettre de
	* retirer la t�te de la liste  dans un moment donne  
	*
	* @param 
	* @return true si le premier élément de la file a bien été enlevé ou false au cas contraire
	* @exception 
	*
	*/
	boolean pull();
	
	/**
	* M�thode qui retourne la liste comme un String 
	* Cette m�thode est n�cessaire pour d�clarer la m�thode qui va nous permettre de
	* retourner la liste comme un String dans un moment donne  
	*
	* @param 
	* @return true si le premier élément de la file a bien été ajouté ou false au cas contraire
	* @exception 
	*
	*/
	String toStringD();
}
