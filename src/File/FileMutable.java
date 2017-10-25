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

}
