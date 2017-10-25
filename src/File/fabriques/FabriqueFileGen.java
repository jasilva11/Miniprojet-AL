package File.fabriques;

import java.util.LinkedList;

import File.FileGen;
import File.FileMutable;

public interface FabriqueFileGen<R> extends FabriqueFile<FileGen<R>, R> {

	@Override
	default FileGen<R> creerFileMutable(LinkedList<R> list) {
		return new FileMutable<R>(list); 
	}
	
	@Override
	default FileGen<R> creerFileMutable(R element) {
		return new FileMutable<R>(element); 
	}
}
