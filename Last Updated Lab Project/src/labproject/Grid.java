package labproject;


import java.util.*;

public class Grid {
	
 	public static final  int gCol = 50;
	public static final int gRow = 50;
	public static char[][] the_Grid =new char[gCol][gRow];
	public static List<String> Log = new ArrayList<String>();

	 public static void main(String[] arg)
	 {
		 Grid g = new Grid();
			g.clearGrid();
			g.diplayIntro();

			ArrayList<AnimalKingdom> ani = new ArrayList<AnimalKingdom>(); /// allows
																			/// to
																			/// iterate
																			/// animal
																			/// once
																			/// at a
																			/// time

			// g.iterate();
	////#####################################################################\\\\\\\\
			//Manually create and add animals to the list here here\\
			Wolf mywolf = new Wolf();
			ani.add(mywolf);

			Rabbit myrabbit = new Rabbit();
			Rabbit myrabbit1 = new Rabbit();
			myrabbit1.setPost(2, 2);
			ani.add(myrabbit);
			
			ani.add(myrabbit1);
			Grass mygrass1 = new Grass();
			ani.add(mygrass1);
			Grass mygrass2 = new Grass();
			mygrass2.setPost(2, 3);
			ani.add(mygrass2);
			Trees_Shrubs myTree = new Trees_Shrubs();
			ani.add(myTree);
			Bluejay mybluejay = new Bluejay();
			Caterpiller mycat = new Caterpiller();
			Deer mydeer = new Deer();
			Fox myfox = new Fox();
			Grasshopper myhopper = new Grasshopper();
			Hawk myhawk = new Hawk();
			Mouse mymouse = new Mouse();
			Squirrel mysquirrel = new Squirrel();

			ani.add(mybluejay);
			ani.add(mycat);
			ani.add(mydeer);
			ani.add(myfox);
			ani.add(myhopper);
			ani.add(myhawk);
			ani.add(mymouse);
			ani.add(mysquirrel);
		////#####################################################################\\\\\\\\

			for (int o = 0; o < 100; o++) {

				for (int j = 0; j < ani.size() - 1; j++) {
					for (int k = j + 1; k < ani.size(); k++) {
						AnimalKingdom a = ani.get(j);
						AnimalKingdom b = ani.get(k);
						if (a.checkCollision(b)) {
							if (a.canBeAteBy(b)) {
								Log.add(ani.get(j).getName()+" is consumed");
								ani.get(j).die();
								ani.get(k).noHunger();

								System.out.println("DEATH ##################");
							} else if (b.canBeAteBy(a)) {
								Log.add(ani.get(k).getName()+" is consumed");
								ani.get(k).die();
								ani.get(j).noHunger();
								System.out.println("DEATH ###################");
							}
						}
					}
				}

				for (int i = 0; i < ani.size(); i++) {
					
					g.addAnimal(ani.get(i).getPostX(), ani.get(i).getPostY(), ani.get(i).getName());

					if (ani.get(i).isTimeToMove()) {
						ani.get(i).move();
					}

					ani.get(i).grow();
					
					
					
					for (int l=0;l<ani.size();l++)
					{
					ani.get(l).displayPos();
					}
					
					g.displayGrid();
				}

			
				////remove dead bodies of animals from the grid
			//	g.checkDeadAnimal(ani );	
				 for (int m = 0; m < ani.size(); m++) {
				 int compr = 0;
				compr = ani.get(m).getAge();
				 if (compr == 999) {
				ani.remove(m);
				}
				 }

			
				g.displayGrid();
				
				for(int m=0;m<Log.size();m++)
				{
					System.out.println(Log.get(m));
				}
				////slow down the grid display
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				if (ani.size()==0)
				{
					System.out.println("EVEYTHING IS DEAD");
					System.exit(0);
				}
			}
	 }
			
		
	
	 
	 	
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
	

	
		 public void displayLegend()
		 {
			 System.out.println("-----LEGEND-----");
			 System.out.println("   B=Bluejay");
			 System.out.println("	C=Caterpillar");
			 System.out.println("	H=Hawk");
			 System.out.println("	G=Grass");
			 System.out.println("	P=Grasshopper");
			 System.out.println("	C=Caterpillar");
			 System.out.println("	T=Tree");
			 System.out.println("	F=Fox");
			 System.out.println("	D=Deer");
			 System.out.println("	M=Mouse");
			 System.out.println("	S=Squirel");
			 System.out.println("	W=Wolf");
			 System.out.println("	R=Rabbit");
		
			 System.out.println("------------------");

		 }
		 public void diplayIntro()
		 {
			 String text="--Welcome to Saskatchewan Wildlife Simulator--";
			 String text2="The program will show how animals survive in the wild. Animals are represented by a character."
			 		+"\n" +"When a prey and predator are on the same position, the prey dies and predator's hunger go down."
					 +"\n"+"If an animal does not eat for long it dies due to hunger. Animals also die if the reach thier age limit"+"\n"+
			 		"Animals position and stats are displayed as [ANIMAL_CHAR][XPos][YPos][Age][Hunger]"+"\n"+"**Animals are added manually.";
			 System.out.println(text+"\n"+text2);
			 displayLegend();
			 
			 try {
					Thread.sleep(9000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
		 }
		 
		public void checkDeadAnimal(ArrayList<AnimalKingdom> ani )			/// will be used in iterator() 
		 {
			 for(int j=0; j<ani.size();j++)
		        {
				int compr=0;
				compr=ani.get(j).getAge();
					if (compr==999)
					{
					ani.remove(j);
					the_Grid[ani.get(j).getPostX()][ani.get(j).getPostY()]='.';
					
					}
		        }
		 }
}



