package labproject;

abstract public class Herbivores extends AnimalKingdom
{
	
	public void age()
	{
		age= getAge()+1;
		setHunger();
	}
}
