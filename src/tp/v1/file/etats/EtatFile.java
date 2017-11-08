package tp.v1.file.etats;

import java.util.LinkedList;

/**
 * Interface qui sert à décrire l'état des files c.a.d ses méthodes principales 
 * Le type R correspond au type des données qui seront stockées dans la file
 * 
 * Cette implementation est basée sur le modèle étudié en cours d'Architecture Logicielle à l'IMT Atlantique
 * et qui peut être consulté sur http://www.grall.name/teaching/softwareArchitecture/2018/implementationClass-method.html
 * 
 * @author  D'LUYZ Daniel
 * @author  SAENZ Henry
 * @author  SILVA Jose
 */
public interface EtatFile<R> {
	
	/**
	* M�thode qui retourne la taille de la file
	* Cette m�thode est n�cessaire pour d�clarer la m�thode qui va nous permettre
	* de conna�tre la taille de la file dans un moment donne  
	*
	* @param 
	* @return int La taille actuelle de la file 
	* @exception 
	*
	*/
	public int tailleFile();

	/**
	* M�thode qui retourne la t�te de la file
	* Cette m�thode est n�cessaire pour d�clarer la m�thode qui va nous permettre de
	*  conna�tre la t�te de la file dans un moment donne  
	*
	* @param 
	* @return R La t�te actuelle de la file 
	* @exception 
	*
	*/
	public R tete();
	
	/**
	* M�thode qui retourne la queue de la file
	* Cette m�thode est n�cessaire pour d�clarer la m�thode qui va nous permettre de
	*  conna�tre la queue de la file dans un moment donne  
	*
	* @param 
	* @return R La queue actuelle de la file 
	* @exception 
	*
	*/
	public R queue();
	
	/**
	* M�thode qui retourne la liste qui repr�sente la file
	* Cette m�thode est n�cessaire pour d�clarer la m�thode qui va nous permettre de
	*  conna�tre la liste qui repr�sente la file dans un moment donne  
	*
	* @param 
	* @return LinkedList<R> La liste qui represente la file mutable 
	* @exception 
	*
	*/
	public LinkedList<R> liste();
	
}
