package tp.v1.file;

import tp.v1.file.etats.EtatFile;
import tp.v1.file.fabriques.FabriqueFileGen;
import tp.v1.file.services.ServiceFile;

/**
 * Interface des FilesGen qui pour l'instant sont seulement files mutables
 * Le type R correspond au type des données qui seront stockées dans la file
 * 
 * Cette implementation est basée sur le modèle étudié en cours d'Architecture Logicielle à l'IMT Atlantique
 * et qui peut être consulté sur http://www.grall.name/teaching/softwareArchitecture/2018/implementationClass-method.html
 * 
 * @author  D'LUYZ Daniel
 * @author  SAENZ Henry
 * @author  SILVA Jose
 */
public interface FileGen<R> extends EtatFile<R>, FabriqueFileGen<R>, ServiceFile<R> {
	
}
