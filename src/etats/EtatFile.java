package etats;

public interface EtatFile<T> {

	/*
	 * Méthode qui retourne la taille de la file
	 */
	public int tailleFile();
	
	/*
	 * Méthode qui retourne la tête de la file
	 */
	public T tete();
	
	/*
	 * Méthode qui retourne la queue de la file
	 */
	public T queue();
	
	/*
	 * Méthode qui ajoute un élément à la file
	 */
	public boolean push(T element);
	
	/*
	 * Méthode qui retire un élément de la file
	 */
	public boolean pull(T element);
	
}
