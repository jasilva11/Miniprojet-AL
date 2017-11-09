package tp.v2;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadMXBean;

/**
 * Classe qui sert à tester l'implementation de nos listes et de nos files.
 * @author  D'LUYZ Daniel
 * @author  SAENZ Henry
 * @author  SILVA Jose
 */
public class Test {
	  private static final ThreadMXBean threadBean = ManagementFactory.getThreadMXBean();
	  private static long diviseur = 100000;
	
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
	
	/**
	* Methode qui teste l'implementation des listes pas vides
	* @param une liste qui n'est pas vide
	* @throws UnsupportedOperationException au cas ou une operation qui n'est pas supportée est executee
	*/
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
		System.out.println("");
	}
	
	/**
	* Methode qui teste l'implementation des listes vides
	* @param une liste qui est vide
	* @throws UnsupportedOperationException au cas ou une operation qui n'est pas supportée est executee
	*/
	private static<T extends Liste<Integer>> void testListeVide(Liste<Integer> liste) {
		System.out.println("******");
		System.out.println("Une liste vide initiale");
		System.out.println("La taille : "+liste.taille());
		System.out.println("Elle est vide ? : "+liste.estVide());
		System.out.println("La liste : "+liste.toStringListe());
		System.out.println("");
	}
	/**
	* Methode qui teste l'implementation des Files mutable pas vides
	* @param deux files mutable qui n'est pas vide
	* @throws UnsupportedOperationException au cas ou une operation qui n'est pas supportée est executee
	*/
	private static <T extends File<Integer>> void testFilePasVite (FileMutableImp<Integer> fileMutable,FileMutableImp<Integer> fileMutableajouter) {
		System.out.println("******");
		System.out.println("Une file mutable pas vide initiale");
		System.out.println("La taille : "+fileMutable.taille());
		System.out.println("Elle est vide ? : "+fileMutable.estVide());
		System.out.println("La file mutable : "+fileMutable.representation());
		System.out.println("");
		
		System.out.println("On ajoute le 3");
		fileMutable.ajout(3);
		System.out.println("Elle est vide ? : "+fileMutable.estVide());
		System.out.println("La taille : "+fileMutable.taille());
		System.out.println("La file mutable : "+fileMutable.representation());
		System.out.println("");
		
		System.out.println("On ajoute le 4");
		fileMutable.ajout(4);
		System.out.println("Elle est vide ? : "+fileMutable.estVide());
		System.out.println("La taille : "+fileMutable.taille());
		System.out.println("La file mutable : "+fileMutable.representation());
		System.out.println("");
		
		System.out.println("On retire le 3");
		fileMutable.retrait();
		System.out.println("Elle est vide ? : "+fileMutable.estVide());
		System.out.println("La taille : "+fileMutable.taille());
		System.out.println("La file mutable : "+fileMutable.representation());
		System.out.println("");
		
		System.out.println("On ajoute la deuxieme file");
		fileMutable.ajout(fileMutableajouter);
		System.out.println("La file mutable : "+fileMutable.representation());

	}
	/**
	* Methode qui teste l'implementation des files mutable vides
	* @param une files mutable qui est vide
	* @throws UnsupportedOperationException au cas ou une operation qui n'est pas supportée est executee
	*/
	private static <T extends File<Integer>> void testFileVite (FileMutableImp<Integer> fileMutableVide) {
		System.out.println("******");
		System.out.println("Une file mutable vide initiale");
		System.out.println("La taille : "+fileMutableVide.taille());
		System.out.println("Elle est vide ? : "+fileMutableVide.estVide());
		System.out.println("La file mutable : "+fileMutableVide.representation());
		System.out.println("");
		
		System.out.println("On essaie d'ajouter le 3");
		try {
			fileMutableVide.ajout(3);
			System.out.println("Elle est vide ? : "+fileMutableVide.estVide());
			System.out.println("");
		} catch(UnsupportedOperationException e) {
			System.out.println("Elle est vide ? : "+fileMutableVide.estVide());
			System.out.println("Test passé");
			System.out.println("");
		}
	}

	/**
	* Methode qui teste l'implementation des filesImmutables pas vides
	* @param deux filesImmutable qui n'est pas vide
	* @throws UnsupportedOperationException au cas ou une operation qui n'est pas supportée est executee
	*/
	private static<T extends File<Integer>> void testFileImmutablePasVide(FileImmutableImp<Integer> fileImmutable,FileImmutableImp<Integer> fileImmutableajouter) {
		System.out.println("******");
		System.out.println("Une fileImmutable pas vide initiale");
		System.out.println("La taille : "+fileImmutable.taille());
		System.out.println("Elle est vide ? : "+fileImmutable.estVide());
		System.out.println("La liste : "+fileImmutable.representation());
		System.out.println("");
		
		System.out.println("On ajoute le 3");
		fileImmutable.ajout(3);
		System.out.println("Elle est vide ? : "+fileImmutable.estVide());
		System.out.println("La taille : "+fileImmutable.taille());
		System.out.println("La file mutable : "+fileImmutable.representation());
		System.out.println("");
		
		System.out.println("On ajoute le 4");
		fileImmutable.ajout(4);
		System.out.println("Elle est vide ? : "+fileImmutable.estVide());
		System.out.println("La taille : "+fileImmutable.taille());
		System.out.println("La file mutable : "+fileImmutable.representation());
		System.out.println("");
		
		System.out.println("On retire le 3");
		fileImmutable.retrait();
		System.out.println("Elle est vide ? : "+fileImmutable.estVide());
		System.out.println("La taille : "+fileImmutable.taille());
		System.out.println("La file mutable : "+fileImmutable.representation());
		System.out.println("");
		
		System.out.println("On ajoute la deuxieme file");
		fileImmutable.ajout(fileImmutableajouter);
		System.out.println("La file mutable : "+fileImmutable.representation());
		

	}
	
	/**
	* Methode qui teste l'implementation des filesImmutables vides
	* @param une filesImmutables qui est vide
	* @throws UnsupportedOperationException au cas ou une operation qui n'est pas supportée est executee
	*/
	private static<T extends File<Integer>> void testFileImmutableVide(FileImmutableImp<Integer> fileImmutable) {
		System.out.println("******");
		System.out.println("Une liste vide initiale");
		System.out.println("La taille : "+fileImmutable.taille());
		System.out.println("Elle est vide ? : "+fileImmutable.estVide());
		System.out.println("La liste : "+fileImmutable.representation());
		System.out.println("");
		
		
	}
	
	
	/**
	* Methode qui gère l'éxecution du test
	* @param  les args du système 
	*/
	public static void main(String[] args) {
		System.out.println("Test Listes------");
		ListeMutable<Integer> listeMutableVide = ListeMutable.vide();
		ListeMutable<Integer> listeMutable = ListeMutable.cons(2, listeMutableVide);
		testListeMutablePasVide(listeMutable);
		testListeMutableVide(listeMutableVide);
		
		
		Liste<Integer> listeVide = Liste.vide();
		Liste<Integer> liste = Liste.cons(1, Liste.cons(2, Liste.cons(3, listeVide)));
		testListePasVide(liste);
		testListeVide(listeVide);
		
		System.out.println("-----------------------");
		System.out.println("Test Files");
		FileMutableImp<Integer> fileMutableVide = new FileMutableImp<Integer>();
		FileMutableImp<Integer> fileMutable = new FileMutableImp<Integer>();
		fileMutable.ajout(2);
		FileMutableImp<Integer> fileMutablea = new FileMutableImp<Integer>();
		fileMutablea.ajout(5);
		long temps = threadBean.getCurrentThreadCpuTime();
		testFilePasVite(fileMutable,fileMutablea);
		testFileVite(fileMutableVide);
	    temps = threadBean.getCurrentThreadCpuTime() - temps;
	    System.out.println(fileMutableVide.getClass() + " - ajout/retrait: " + (temps / diviseur));
		
		FileImmutableImp<Integer> fileImmutableVide = new FileImmutableImp<Integer>();
		FileImmutableImp<Integer> fileImmutable = new FileImmutableImp<Integer>();
		fileImmutable.ajout(2);
		FileImmutableImp<Integer> fileImmutablea = new FileImmutableImp<Integer>();
		fileImmutablea.ajout(5);
		temps = threadBean.getCurrentThreadCpuTime();
		testFileImmutablePasVide(fileImmutable,fileImmutablea);
		testFileImmutableVide(fileImmutableVide);
	    temps = threadBean.getCurrentThreadCpuTime() - temps;
	    System.out.println(fileMutableVide.getClass() + " - ajout/retrait: " + (temps / diviseur));

	}
}
