package tp.filRouge.v5;

public class Test {
	
	public Test() {
		
	}
	
	public void testFileMutable() {
		EtatFileMutable<Integer> etat = new CasEtatFileMutable<Integer>();
		CasFileMutable<Integer> fileMutable = new CasFileMutable<Integer>(etat);
		fileMutable.ajout(1);
		System.out.println(fileMutable.representer());
		fileMutable.ajout(2);
		System.out.println(fileMutable.representer());
		fileMutable.ajout(3);
		System.out.println(fileMutable.representer());
		fileMutable.ajout(4);
		System.out.println(fileMutable.representer());
		fileMutable.retrait();
		System.out.println(fileMutable.representer());
	}
	
	public static void main(String[] args) {
		Test test = new Test();
		test.testFileMutable();
	}

}
