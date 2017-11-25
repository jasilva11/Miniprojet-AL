package tp.filRouge.v5;

public interface File <K extends File<K,E>,E> extends Iterable<E>,Mesurable{
	E premier(); // Premier de la file
	K suivants(); // Ses suivants
	public default boolean estVide() {
		return false;
	}
	K creer(); // fabrique d'une file vide
	
	@SuppressWarnings("unchecked")
	default K sujet(){ // Alias de this
	  return (K)this;
	}
	K ajout(E dernierDansFile); // Ajout en fin
	
	K retrait(); // Retrait de premier élément
	
	// Ajout de la seconde file en fin de file
	public default K ajout(K secondeFile) {
		K auxF = this.sujet();
		for(E e : secondeFile){
			auxF = auxF.ajout(e);
		}
		return auxF;
	}
	
}
