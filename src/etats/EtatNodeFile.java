package etats;

public interface EtatNodeFile<T> {
	default boolean estTete()
	{return false;}
	default boolean estQueue()
	{return false;}
	default T Setpredecesseur()
	{return null;}
	default T Getpredecesseur()
	{return null;}
	default T Setsuccesseur()
	{return null;}
	default T Getsuccesseur()
	{return null;}
	default int val()
	{throw new UnsupportedOperationException();}
}
