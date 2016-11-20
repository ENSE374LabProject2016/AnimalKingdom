package labproject;

public class Main {

	public static void main(String[] args) {
		
		Grid g = new Grid();
		g.clearGrid();
		Wolf mywolf = new Wolf();
	

		g.addAnimal(mywolf.getPostX(),mywolf.getPostY(),'W');
	
		System.out.println(mywolf.getPostX() + " "+mywolf.getPostY());

		mywolf.move();
		g.addAnimal(mywolf.getPostX(),mywolf.getPostY(),'W');
		g.displayGrid();
		System.out.println(mywolf.getPostX() + " "+mywolf.getPostY());
		mywolf.move();
		g.displayGrid();
	
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
