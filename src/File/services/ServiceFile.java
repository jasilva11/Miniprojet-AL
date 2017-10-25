package File.services;

public interface ServiceFile<R> {
	/*
	 * Méthode qui ajoute un élément à la file
	 */
	boolean push(R element);
	
	/*
	 * Méthode qui retire un élément de la file
	 */
	boolean pull();
	
	String toStringD();
}
