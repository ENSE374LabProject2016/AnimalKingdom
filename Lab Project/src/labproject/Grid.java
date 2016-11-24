package labproject;


import java.util.*;

public class Grid {
	public static  int positionX;
 	public static int positionY;
 	public static final  int gCol = 30;
	public static final int gRow = 30;
	public  char[][] the_Grid =new char[gCol][gRow];
	//protected static ArrayList<AnimalKingdom> a = new ArrayList<AnimalKingdom>();				/// added to help in iteratiion
 	
public void clearGrid()
	   {
    	    char d = '.';
			for ( int i = 0; i < gRow; i++)
			{
				for (int j = 0; j < gCol; j++)
				{
					
					the_Grid[i][j] = d;
				}
			}
			
		}
		
		public void displayGrid(){
			
	        for ( int j = 0; j < gCol; j++)
		{
			System.out.print('-');
		}
			
		System.out.println();

		for ( int i = 0; i < gRow; i++)
		{
			for ( int j = 0; j < gCol; j++)
			{
				System.out.print(the_Grid[i][j]);
			}
			System.out.println();
		}

		for (int j = 0; j < gCol; j++)
		{
			System.out.print('-');
		}
		System.out.println();
		
		}
		
		
		public void addAnimal(int animal_row_pos, int animal_col_pos, char animal_letter){
			assert(animal_row_pos >= 0);
			assert(animal_row_pos < gRow);
			assert(animal_col_pos >= 0);
			assert(animal_col_pos < gCol);
			the_Grid[animal_row_pos][animal_col_pos] = animal_letter;
		}
		
		
		
		
		static boolean isValidPositionForGrid(int row_pos1, int col_pos1)
		{
			
			return (row_pos1 >= 0) && (col_pos1 >= 0) &&
			       (row_pos1 < gRow) && (col_pos1 < gCol);
			
		}
	

		public void setPos(int a , int b, char w)
		{
			
			
			
		}
		/* public void move()
		    {
		       // this.setPost(getPos()+4,getPos()+2) ;
		    }
		*/
		
		 public void iterate( )					//moved this from animalKingdom class 
	        {
			 diplayIntro();
	         for (int i=0; i<20; i++) // 20 is # of iteration
	         {
	        	  /// add animals here 
	        		Wolf mywolf = new Wolf();
	        		Rabbit myrabbit = new Rabbit();
	        		Grass mygrass1= new Grass();
	        		Trees_Shrubs myTree = new Trees_Shrubs();
	        		
	        	addAnimal(mywolf.getPostX(),mywolf.getPostY(),mywolf.getName());
	     		addAnimal(myrabbit.getPostX(),myrabbit.getPostY(),myrabbit.getName());
	     		addAnimal(mygrass1.getPostX(),mygrass1.getPostY(),mygrass1.getName());
	     		addAnimal(myTree.getPostX(),myTree.getPostY(),myTree.getName());
	     		
	     		
	     		// add code here to see animals position and age
	     		mywolf.displayPos();
	     		mygrass1.displayPos();
	     		myrabbit.displayPos();
	     		myTree.displayPos();
	     		
	     		
	     		// displays the grid
	     	displayGrid();

	     	
	     	clearGrid();
	     	mywolf.move();
	     	mygrass1.move();
	     	myrabbit.move();
	     	myTree.move();
	     	
	     	
	     	mywolf.move();
	     	mygrass1.move();
	     	myrabbit.move();
	     	myTree.move();
	     	
	     	addAnimal(mywolf.getPostX(),mywolf.getPostY(),mywolf.getName());
	     	addAnimal(myrabbit.getPostX(),myrabbit.getPostY(),myrabbit.getName());
	     	addAnimal(mygrass1.getPostX(),mygrass1.getPostY(),mygrass1.getName());
	     	addAnimal(myTree.getPostX(),myTree.getPostY(),myTree.getName());
	     	
	     	mywolf.displayPos();
	     	mygrass1.displayPos();
	     	myrabbit.displayPos();
	     	myTree.displayPos();
	     	
	     	displayGrid();
	        	 
	        	 
	        	 // get all the child objects of animal kindom
	            //loop  ; move other object next iteration
	                    // move one object -- canEat and collision called in here
	                    
	                    // grow all 
	                    // check if any object can die
	         }          
	        }
		 public void displayLegend()
		 {
			 System.out.println("-----LEGEND-----");
			 System.out.println("B=Bluejay");
			 System.out.println("H=Hawk");
			 System.out.println("G=Grass");
			 System.out.println("H=Grasshopper");
			 System.out.println("C=Caterpillar");
			 System.out.println("T=Tree");
			 System.out.println("F=Fox");
			 System.out.println("D=Deer");
			 System.out.println("M=Mouse");
			 System.out.println("S=Squirel");
			 System.out.println("W=Wolf");
			 System.out.println("R=Rabbit");
			 System.out.println("I=Insects");
			 System.out.println("------------------");

		 }
		 public void diplayIntro()
		 {
			 String text="Welcome to Saskatchewan Simulation";
			 String text2="The program will show how animals survive in the wild. Animals are represented by character."
			 		+"\n" +"When a prey is on the same position as its predator, the prey dies and predator's hunger go down."
					 +"\n"+"If an animal does eat for long it dies due to hunger";
			 System.out.println(text+"\n"+text2);
			 displayLegend();
			
			 	
		 }

}
