package File.fabriques;

import java.util.LinkedList;

public interface FabriqueFileMutable<File,R> {
	public File creerFileMutable(LinkedList<R> list);
	public File creerFileMutable(R element);
}
