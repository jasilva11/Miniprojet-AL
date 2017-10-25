package fabriques;

import java.util.LinkedList;

import etats.EtatNodeFile;

public interface FabriqueFile<T extends EtatNodeFile<T>> {
	
	public T creerFile(LinkedList<T> list);

}
