package tp.v1.file;

import tp.v1.file.fabriques.FabriqueFile;
import tp.v1.file.fabriques.FabriqueFileGen;
import tp.v1.file.services.ServiceFile;

/**
 * Classe qui sert à tester l'implementation de nos files. Pour l'instant le cas des Files Mutables.
 * 
 * @author  D'LUYZ Daniel
 * @author  SAENZ Henry
 * @author  SILVA Jose
 */
public class Test {
	
	/**
	* M�thode qui teste l'implementation factorisée des files mutables
	*
	* @param FabriqueFile<T, Integer> Une fabrique des files des données int
	* @return 
	* @exception 
	*
	*/
	private static<T extends ServiceFile<Integer>> void testFileMutable(FabriqueFile<T, Integer> liste) {
		T fm= liste.creerFileMutable(2);
		System.out.println(fm.toStringD());
		for(int i=0;i<20;i++){	
			fm.push(i);
			System.out.println(fm.toStringD());
		}
		
		fm.pull();
		System.out.println(fm.toStringD());
	}
	
	/**
	* M�thode qui gère l'éxecution du test
	*
	* @param 
	* @return 
	* @exception 
	*
	*/
	public static void main(String[] args) {
		FabriqueFileGen<Integer> lista= new FabriqueFileGen<Integer>(){};
		testFileMutable(lista);
		
	}
}
