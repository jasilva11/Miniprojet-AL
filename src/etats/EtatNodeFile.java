package etats;

public interface EtatNodeFile<T> {
	default boolean estTete()
	{return false;}
	default boolean estQueue()
	{return false;}
	default T setPredecesseur()
	{return null;}
	default T getPredecesseur()
	{return null;}
	default T setSuccesseur()
	{return null;}
	default T getSuccesseur()
	{return null;}
	default int val()
	{throw new UnsupportedOperationException();}
}
