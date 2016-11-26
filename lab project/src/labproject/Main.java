package labproject;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		
		Grid g = new Grid();
		g.clearGrid();
		
		ArrayList <AnimalKingdom> ani= new ArrayList<AnimalKingdom>();			/// allows to iterate animal once at a time
		
		
		//g.iterate();
		
		
		//create instance of object of animal here
		Wolf mywolf = new Wolf();
		ani.add(mywolf);
		
		Rabbit myrabbit = new Rabbit();
		ani.add(myrabbit);
		Grass mygrass1= new Grass();
		ani.add(mygrass1);
		Trees_Shrubs myTree = new Trees_Shrubs();
		ani.add(myTree);
	
		

        
		for(int i=0; i<ani.size();i++)
        {
			ani.get(i).grow();
			ani.get(i).displayPos();
			g.addAnimal(ani.get(i).getPostX(), ani.get(i).getPostY(), ani.get(i).getName());
			ani.get(i).move();
			ani.get(2).die();
			g.displayGrid();		 
			
        }
		for(int i=0; i<4;i++)
		{
			ani.get(0).displayPos();
			ani.get(0).move();
			g.displayGrid();
			
		}
		ani.get(0).die();
		for(int j=0; j<ani.size();j++)
        {
		int compr=0;
		compr=ani.get(j).getAge();
			if (compr==999)
			{
			ani.remove(j);
			}
        }
		
		System.out.println("Wolf will die now");
		ani.get(0).displayPos();
		g.displayGrid();
		
		
/*		//add the animal to the grid here
		g.addAnimal(mywolf.getPostX(),mywolf.getPostY(),mywolf.getName());
		g.addAnimal(myrabbit.getPostX(),myrabbit.getPostY(),myrabbit.getName());
		g.addAnimal(mygrass1.getPostX(),mygrass1.getPostY(),mygrass1.getName());
		g.addAnimal(myTree.getPostX(),myTree.getPostY(),myTree.getName());
		
	
		// add code here to see animals position and age
		mywolf.displayPos();
		mygrass1.displayPos();
		myrabbit.displayPos();
		myTree.displayPos();
*/			
		
		// displays the grid
//	g.displayGrid();

	
//	g.clearGrid();
/*	mywolf.move();
	mygrass1.move();
	myrabbit.move();
	myTree.move();
	
	g.addAnimal(mywolf.getPostX(),mywolf.getPostY(),mywolf.getName());
	g.addAnimal(myrabbit.getPostX(),myrabbit.getPostY(),myrabbit.getName());
	g.addAnimal(mygrass1.getPostX(),mygrass1.getPostY(),mygrass1.getName());
	g.addAnimal(myTree.getPostX(),myTree.getPostY(),myTree.getName());
	
	mywolf.displayPos();
	mygrass1.displayPos();
	myrabbit.displayPos();
	myTree.displayPos();
	
	g.displayGrid();   */

/*		
		if (r.canBeAteBy(w)) {
			System.out.println("rabbit can be ate by a wolf");
		} 
		
		if (!w.canBeAteBy(r)) {
			System.out.println("wold cannot be ate by a rabbit");
		}
*/		
	}

}
