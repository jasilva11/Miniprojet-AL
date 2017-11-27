package tp.filRouge.v5;

public interface ServiceFile <K extends ServiceFile<K,E>,E> extends Iterable<E>,Mesurable{

	K ajout(E dernierDansFile); // Ajout en fin
	
	K retrait(); // Retrait de premier élément
	
	// Ajout de la seconde file en fin de file
	public default K ajout(K secondeFile) {
		for(E e : secondeFile){
			this.ajout(e);
		}
		return (K)this;
	}
	//Fabrique
	K creer(); 
	@SuppressWarnings("unchecked")
	default K sujet(){ 
	  return (K)this;
	}
}
