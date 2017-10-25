package File.services;

import File.etats.EtatFile;

public interface ServiceFileMutable<T extends ServiceFile<R> ,R> extends ServiceFile<R>, EtatFile<R>{
	
	default boolean push(R node) {
		this.liste().addLast(node);
		return true;
	}
	
	default boolean pull() {
		this.liste().removeFirst();
		return true;
	}
}
