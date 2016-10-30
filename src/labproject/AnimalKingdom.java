package labproject;

public class AnimalKingdom {
	
	private String name;
 	private int id;
 	private int age;
 	private int lifeLimit;
 	private int positionX;
 	private int positionY;
 	
 	public void setPos(int x ,int y )
 	{
 	}
 	
 	public int getPosX()
 	{
 		return this.positionX;
 	}
 	public int getPosY()
 	{
 		return this.positionY;

 	}
 	
 	public void die()
 	{
 		
 	}
 	
 	public void grow()
 	{
 		age=age+1;
 		 		
 	}
 	
 	public boolean checkCollision()
 	{
 		boolean results = false;
 		///
 		return results;
 		
 	}

	public int getLifeLimit() {
		return lifeLimit;
	}

	public void setLifeLimit(int lifeLimit) {
		this.lifeLimit = lifeLimit;
	}
	public int getAge()
	{
		return age;
	}
	
}

