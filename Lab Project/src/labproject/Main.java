package labproject;

public class Main {

	public static void main(String[] args) {
		//AnimalKingdom saskForest = new AnimalKingdom();
		Grid g = new Grid();
	//	g.displayGrid();
		Wolf mywolf = new Wolf();
		g.clearGrid();
		g.addAnimal(mywolf.getPosX(),mywolf.getPosY(),'W');
	
		System.out.println(mywolf.getPosX() + " "+mywolf.getPosY());

		mywolf.move();
		g.displayGrid();
		System.out.println(mywolf.getPosX() + " "+mywolf.getPosY());
	//	mywolf.move();
	//	g.displayGrid();
		
		//saskForest.initalize();
		//saskForest.iterate();
		
		
		Wolf w = new Wolf();
		Rabbit r = new Rabbit();
		
		if (r.canBeAteBy(w)) {
			System.out.println("rabbit can be ate by a wolf");
		} 
		
		if (!w.canBeAteBy(r)) {
			System.out.println("wold cannot be ate by a rabbit");
		}
		
	}

}
