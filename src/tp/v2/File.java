package tp.v2;

/**
 * Interface qui permet de modeliser une file. Elle defini les accesseurs, les services et les fabriques.
 * @author  D'LUYZ Daniel
 * @author  SAENZ Henry
 * @author  SILVA Jose
 */
public interface File<E> extends Iterable<E> {

	/*
	 * Accesseurs
	 * - File décomposable en un premier élément suivi des suivants formant une file.
	 * - File mesurable : taille, estVide 
	 */
	/**
	* Methode qui retourne le premier element de la file
	* @param E le premier element de la file
	*/
	E premier();
	
	/**
	* Methode qui retourne les elements qui suivent le premier element de la file
	* @param File<E> les elements qui suivent le premier element de la file
	*/
	File<E> suivants();

	/**
	* Methode qui informe si la file est vide ou pas
	* @return true si la file est vide, false au cas contraire
	*/
	default boolean estVide() {
		return this.taille() == 0;
	}
	
	/**
	* Methode qui informe la taille de la file
	* @return la taille de la file
	*/
	int taille();

	/*
	 * Fabriques
	 * - fabrique d'une file vide
	 */
	/**
	* Fabrique de la file
	* @return une nouvelle file vide
	*/
	File<E> creer();

	/*
	 * Services
	 * - méthodes spécifiques aux files : ajout en queue, retrait en tête
	 * - services supplémentaires :
	 *   - ajout d'une seconde file en queue
	 *   - iterator par héritage
	 *   - represenatation et estEgal pour factoriser les définitions de toString et equals
	 */
	/**
	* Methode qui ajoute un element en fin de la file
	* @param E l'element a ajouter en fin de la file
	* @return la file avec le nouveau element ajoute en fin
	*/
	File<E> ajout(E dernierDansFile);
	
	/**
	* Methode qui retire le premier element de la file
	* @return la file apres avoir retire le premier element
	*/
	File<E> retrait();
	
	/**
	* Methode qui ajoute une file en fin de la file
	* @param File<E> la file a ajouter en fin
	* @return la file avec les elements de la deuxieme file ajoutes en fin
	*/
	File<E> ajout(File<E> secondeFile);

	/**
	* Methode qui renvoie la representation en String de la file
	* @return la representation en String de la file
	*/
	default String representation() {
		if(premier() == null) return "";
		else return premier().toString() + " " + suivants().representation();
	}

	/**
	* Methode qui informe si deux files sont egales
	* @param File<E> la file a comparer
	* @return true si les deux files sont egales, false au cas contraire
	*/
	default boolean estEgal(File<E> file){
		if(taille() != file.taille()) return false;
		else
		{
			if(premier()!=null)
			{
				if(premier()!=file.premier()) return false;
				else return true && suivants().estEgal(file.suivants());
			}
			else
			{
				if(file.premier()==null) return true;
			}
		}
		return false;
	}
}