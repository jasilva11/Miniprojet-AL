package tp.filRouge.v5;

public interface EtatFile<K, E> {

	//Accesseurs
	E premier();
	K suivants(); 
	boolean estVide();
	
	//Fabrique
	K creer(); 
	@SuppressWarnings("unchecked")
	default K sujet(){ 
	  return (K)this;
	}
	
}
