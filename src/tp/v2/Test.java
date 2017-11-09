package tp.v2;

public class Test {
	
	/**
	* Methode qui teste l'implementation des listes mutable pas vides
	* @param une liste mutable qui n'est pas vide
	* @throws UnsupportedOperationException au cas ou une operation qui n'est pas supportée est executee
	*/
	private static<T extends ListeMutable<Integer>> void testListeMutablePasVide(ListeMutable<Integer> listeMutable) {
		System.out.println("******");
		System.out.println("Une liste mutable pas vide initiale");
		System.out.println("La taille : "+listeMutable.taille());
		System.out.println("Elle est vide ? : "+listeMutable.estVide());
		System.out.println("La liste mutable : "+listeMutable.toStringListe());
		System.out.println("");
		
		System.out.println("On ajoute le 3");
		listeMutable.changerTete(3);
		System.out.println("Elle est vide ? : "+listeMutable.estVide());
		System.out.println("La taille : "+listeMutable.taille());
		System.out.println("La liste mutable : "+listeMutable.toStringListe());
		System.out.println("");
		
		System.out.println("On ajoute le 4");
		listeMutable.changerTete(4);
		System.out.println("Elle est vide ? : "+listeMutable.estVide());
		System.out.println("La taille : "+listeMutable.taille());
		System.out.println("La liste mutable : "+listeMutable.toStringListe());
		System.out.println("");
		
		System.out.println("Miroir du liste");
		ListeMutable<Integer> miroir = listeMutable.miroir();
		System.out.println("La liste mutable : "+listeMutable.toStringListe());
		System.out.println("Le miroir de la liste mutable : "+miroir.toStringListe());
	}
	
	/**
	* Methode qui teste l'implementation des listes mutable vides
	* @param une liste mutable qui est vide
	* @throws UnsupportedOperationException au cas ou une operation qui n'est pas supportée est executee
	*/
	private static<T extends ListeMutable<Integer>> void testListeMutableVide(ListeMutable<Integer> listeMutableVide) {
		System.out.println("******");
		System.out.println("Une liste mutable vide initiale");
		System.out.println("La taille : "+listeMutableVide.taille());
		System.out.println("Elle est vide ? : "+listeMutableVide.estVide());
		System.out.println("La liste mutable : "+listeMutableVide.toStringListe());
		System.out.println("");
		
		System.out.println("On essaie d'ajouter le 3");
		try {
			listeMutableVide.changerTete(3);
			System.out.println("Elle est vide ? : "+listeMutableVide.estVide());
			System.out.println("");
		} catch(UnsupportedOperationException e) {
			System.out.println("Elle est vide ? : "+listeMutableVide.estVide());
			System.out.println("Test passé");
			System.out.println("");
		}
		
	}
	
	private static<T extends Liste<Integer>> void testListePasVide(Liste<Integer> liste) {
		System.out.println("******");
		System.out.println("Une liste pas vide initiale");
		System.out.println("La taille : "+liste.taille());
		System.out.println("Elle est vide ? : "+liste.estVide());
		System.out.println("La liste : "+liste.toStringListe());
		System.out.println("");
		
		System.out.println("Miroir du liste");
		Liste<Integer> miroir = liste.miroir();
		System.out.println("La liste : "+liste.toStringListe());
		System.out.println("Le miroir de la liste : "+miroir.toStringListe());
	}
	
	/**
	* Methode qui gère l'éxecution du test
	* @param  les args du système 
	*/
	public static void main(String[] args) {
		ListeMutable<Integer> listeMutableVide = ListeMutable.vide();
		ListeMutable<Integer> listeMutable = ListeMutable.cons(2, listeMutableVide);
		testListeMutablePasVide(listeMutable);
		testListeMutableVide(listeMutableVide);
		
		Liste<Integer> listeVide = Liste.vide();
		Liste<Integer> liste = Liste.cons(1, Liste.cons(2, Liste.cons(3, listeVide)));
		testListePasVide(liste);
	}
}
