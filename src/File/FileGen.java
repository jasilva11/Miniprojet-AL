package File;

import File.etats.EtatFile;
import File.fabriques.FabriqueFileGen;
import File.services.ServiceFile;

public interface FileGen<R> extends EtatFile<R>, FabriqueFileGen<R>, ServiceFile<R> {
	
}
