package tp.v1.file.fabriques;

public interface FabriqueNodeFile<T> {
	T creerNodeFile(T val, T predecesseur,T successeur);
}
