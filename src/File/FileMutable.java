package File;

import java.util.LinkedList;

import File.etats.CasFileMutable;
import File.fabriques.FabriqueFileGen;
import File.services.ServiceFileMutable;

public class FileMutable<R> extends CasFileMutable<R> implements FileGen<R>, ServiceFileMutable<FileGen<R>,R>, FabriqueFileGen<R> {

	public FileMutable(LinkedList<R> list) {
		super(list);
	}
	
	public FileMutable(R element) {
		super(element);
	}

	@Override
	public boolean push(R element) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean pull(R element) {
		// TODO Auto-generated method stub
		return false;
	}

}
