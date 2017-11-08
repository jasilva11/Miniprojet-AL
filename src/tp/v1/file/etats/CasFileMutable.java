package tp.v1.file.etats;

import java.util.LinkedList;

/**
 * Classe qui determine une file mutable 
 * Le type R correspond au type des données qui seront stockées dans la file
 * 
 * Cette implementation est basée sur le modèle étudié en cours d'Architecture Logicielle à l'IMT Atlantique
 * et qui peut être consulté sur http://www.grall.name/teaching/softwareArchitecture/2018/implementationClass-method.html
 * 
 * @author  D'LUYZ Daniel
 * @author  SAENZ Henry
 * @author  SILVA Jose
 */
public class CasFileMutable<R> implements EtatFile<R> {
	
	/**
	* Attribut qui correspond à la liste qui representera la file mutable des données de type R
	*/
	private LinkedList <R> liste;
	
	/**
	* Constructeur de la File Mutable qui reçoit une liste par paramètre
	* @param LinkedList<R> la liste qui sert à initialiser la file des données de type R
	*/
	public CasFileMutable(LinkedList<R> list) {
		// TODO Auto-generated constructor stub
		this.liste=list;
	}
	
	/**
	* Constructeur de la File Mutable qui reçoit une liste par paramètre
	* @param LinkedList<R> la liste qui sert à initialiser la file
	*/
	public CasFileMutable(R element) {
		// TODO Auto-generated constructor stub
		this.liste= new LinkedList<R>();
		this.liste.add(element);
	}
	
	/**
	* M�thode qui retourne la taille de la file
	* Cette m�thode est n�cessaire pour conna�tre la taille de la file dans un moment donne  
	*
	* @param 
	* @return int La taille actuelle de la file 
	* @exception 
	*
	*/
	@Override
	public int tailleFile() {
		// TODO Auto-generated method stub
		return this.liste.size();
	}
	
	/**
	* M�thode qui retourne la t�te de la file
	* Cette m�thode est n�cessaire pour conna�tre la t�te de la file dans un moment donne  
	*
	* @param 
	* @return R La t�te actuelle de la file 
	* @exception 
	*
	*/
	@Override
	public R tete() {
		// TODO Auto-generated method stub
		return this.liste.getFirst();
	}
	
	/**
	* M�thode qui retourne la queue de la file
	* Cette m�thode est n�cessaire pour conna�tre la queue de la file dans un moment donne  
	*
	* @param 
	* @return R La queue actuelle de la file 
	* @exception 
	*
	*/
	@Override
	public R queue() {
		// TODO Auto-generated method stub
		return this.liste.getLast();
	}
	
	/**
	* M�thode qui retourne la liste qui repr�sente la file
	* Cette m�thode est n�cessaire pour conna�tre la liste qui repr�sente la file dans un moment donne  
	*
	* @param 
	* @return LinkedList<R> La liste qui represente la file mutable 
	* @exception 
	*
	*/
	@Override
	public LinkedList<R> liste() {
		// TODO Auto-generated method stub
		return this.liste;
	}

}
