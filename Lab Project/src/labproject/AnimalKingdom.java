package labproject;
import java.util.*;

public abstract class AnimalKingdom extends Grid implements Eatable {
	
	protected char name;
 	protected int id;
 	protected int age;
 	protected int lifeLimit;
 	protected int x;
 	protected int y;
 	protected int hunger;
 	private static int hungerLimit=30;
 	
 	
 	
 	
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
        	this.setPost(1, 1);
        	
        }
        
        public void initalize()			///this is useless at this point 
        {
        	this.setPost(10,10);
        	
           // add Tree at position ( x, y)
           // add Caterpillar at postition (x,y)
           // add blue jay at position (x,y)
           // add fox at position at (X,y)
            
        }
       
        public void displayPos()
        {
           System.out.println(this.name+ " "+this.getPostX()+ " " + this.getPostY() + " " + this.getAge()+ " "+getHunger());
        }
      
 	public void die()
 	{
 		
 		the_Grid[getPostX()][getPostY()] = '.';
 		this.setAge(999);
 		//this.name= '.';
 		
 		
 	}
 	
 	private void setAge(int i) {
		age=i;
	}

	public void grow()
 	{
 		
 		if (age>getLifeLimit() || this.getHunger()>hungerLimit)
 		{
 			System.out.println(getName()+" is Dead");
 			System.out.println("^^^^^^^^");
 			if (age>getLifeLimit() )
 				System.out.print(" coz it aged");
 			if (this.getHunger()>hungerLimit)
 				System.out.print(" coz it got too hungry");
 		this.die();
 			
 		}
 		else
 			age();
 		 
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
	public void age()
	{
		age= getAge()+1;
		
	}
	public int getAge()
	{
		return this.age;
	}
	public void setName(char a)
	{
		this.name= a;
	}
	//use diplayPos to get both x and y
	public int getPostX()
	{
		return x ;
		
	}
	public int getPostY()
	{
		return y;
	}
	public void setPost(int xt, int yt)
	{
		x= xt;
		y=yt;
	}
	public void setHunger()
	{
		hunger=hunger+2;
	}
	public int getHunger()
	{
		return hunger;
	}
	public void move()
	{
		the_Grid[getPostX()][getPostY()] = '.';
		this.setPost(getPostX()+0,getPostY()+0) ;
		the_Grid[getPostX()][getPostY()] = getName();
	    grow();
	}	
}

