package tp.v3;

import java.util.Iterator;

public class IterateurListe<E> implements Iterator<E> {
	private Liste<E> liste;
	private E actuel;
	
	public IterateurListe(Liste<E> liste2) {
		// TODO Auto-generated constructor stub
		this.liste = liste2;
		this.actuel = liste2.tete();
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		boolean res = false;
		if(!liste.reste().estVide())
		{
			res = true;
		}
		return res;
	}

	@Override
	public E next() {
		// TODO Auto-generated method stub
		E res = null;
		if(hasNext())
		{
			this.liste = liste.reste();
			actuel = liste.tete();
			res = actuel;
		}
		return res;
	}

}
