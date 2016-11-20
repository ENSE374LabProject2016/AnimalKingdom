package labproject;

public abstract class AnimalKingdom extends Grid implements Eatable {
	
	protected char name;
 	protected int id;
 	protected int age;
 	protected int lifeLimit;
 	protected int x;
 	protected int y;
 	
 	
 	
//        public static void main(String[] arg)
//        {
////        AnimalKingdom saskForest = new AnimalKingdom();
////        saskForest.initalize();
////        saskForest.iterate();
////               
//         }
        AnimalKingdom()
        {
        	this.setLifeLimit(20);
        	this.setPos(1, 1,'a');
        	
        }
        
        public void initalize()
        {
        	this.setPos(10,10,'a');
        	
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
	public void setName(char a)
	{
		this.name= a;
	}
	public int getPosX()
	{
		return x ;
		
	}
	public int getPosY()
	{
		return y;
	}
	
}

