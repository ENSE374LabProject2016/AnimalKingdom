package labproject;

public class AnimalKingdom extends Grid{
	
	private char name;
 	private int id;
 	private int age;
 	private int lifeLimit;
 	private int positionX;
 	private int positionY;
 	
        public static void main(String[] arg)
        {
        AnimalKingdom saskForest = new AnimalKingdom();
        saskForest.initalize();
        saskForest.iterate();
               
         }
        AnimalKingdom()
        {
        	this.setLifeLimit(20);
        	this.setPos(1, 1);
        	
        }
        
        public void initalize()
        {
        	this.setPos(10,10);
        	
           // add Tree at position ( x, y)
           // add Caterpillar at postition (x,y)
           // add blue jay at position (x,y)
           // add fox at position at (X,y)
            
        }
        public void iterate()
        {
         for (int i=0; i<20; i++) // 20 is # of iteration
         {
            // get all the child objects of animal kindom
            //loop  ; move other object next iteration
                    // move one object -- canEat and collision called in here
                    
                    // grow all 
                    // check if any object can die
         }          
        }
        public void displayPos()
        {
           System.out.println(this.getPosX()+ " " + this.getPosY() + " " + this.getAge());
        }
        
 	public void setPos(int x ,int y )
 	{
 		this.positionX=x;
 		this.positionY=y;
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

