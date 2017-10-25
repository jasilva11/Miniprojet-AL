package File;

import java.util.LinkedList;

import File.fabriques.FabriqueFile;
import File.fabriques.FabriqueFileGen;
import File.services.ServiceFile;

public class Test {
	
	public static void main(String[] args) {
		FabriqueFileGen<Integer> lista= new FabriqueFileGen<Integer>(){};
		testFileMutable(lista);
		
	}
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
}
