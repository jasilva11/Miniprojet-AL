package fabriques;

public interface FabriqueNodeFile<T> {
	T creerNodeFile(T val, T predecesseur,T successeur);
}
