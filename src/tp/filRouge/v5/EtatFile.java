package tp.filRouge.v5;

public interface EtatFile<K, E> {

	//Accesseurs
	E premier();
	K suivants(); 
	public default boolean estVide() {
		if(premier()!=null) {
			return false;
		}
		else {
			return true;
		}
	}
	String representation();
	
	//Fabrique
	K creer(); 
	@SuppressWarnings("unchecked")
	default K sujet(){ 
	  return (K)this;
	}
	
}
