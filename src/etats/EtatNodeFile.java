package etats;

public interface EtatNodeFile <T>{
	default boolean estTete()
	{return false;}
	default boolean estQueue()
	{return false;}
	default T predecesseur()
	{return null;}
	default T successeur()
	{return null;}
}
