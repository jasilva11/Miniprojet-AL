package etat;

public interface Etat_Node_File <T>{
	default boolean estTete()
	{return false;}
	default boolean estQueue()
	{return false;}
	default T predecesseur()
	{return null;}
	default T successeur()
	{return null;}
}
