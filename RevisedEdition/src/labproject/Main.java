package labproject;

public class Main {

	public static void main(String[] args) {
		//AnimalKingdom saskForest = new AnimalKingdom();
		Grid g = new Grid();
		
		g.clearGrid();
		g.displayGrid();
		
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
