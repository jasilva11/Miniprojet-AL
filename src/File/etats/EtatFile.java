package File.etats;

import java.util.LinkedList;

public interface EtatFile<R> {
	/*
	 * Méthode qui retourne la taille de la file
	 */
	public int tailleFile();
	
	/*
	 * Méthode qui retourne la tête de la file
	 */
	public R tete();
	
	/*
	 * Méthode qui retourne la queue de la file
	 */
	public R queue();
	
	public LinkedList<R> liste();
	
}
