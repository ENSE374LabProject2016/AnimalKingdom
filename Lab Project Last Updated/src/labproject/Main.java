package labproject;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {

		Grid g = new Grid();
		g.clearGrid();

		ArrayList<AnimalKingdom> ani = new ArrayList<AnimalKingdom>(); /// allows
																		/// to
																		/// iterate
																		/// animal
																		/// once
																		/// at a
																		/// time

		// g.iterate();

		// create instance of object of animal here
		Wolf mywolf = new Wolf();
		ani.add(mywolf);

		Rabbit myrabbit = new Rabbit();
		ani.add(myrabbit);
		Grass mygrass1 = new Grass();
		ani.add(mygrass1);
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

		for (int o = 0; o < 100; o++) {

			for (int j = 0; j < ani.size() - 1; j++) {
				for (int k = j + 1; k < ani.size(); k++) {
					AnimalKingdom a = ani.get(j);
					AnimalKingdom b = ani.get(k);
					if (a.checkCollision(b)) {
						if (a.canBeAteBy(b)) {
							a.die();

							System.out.println("DEATH ##################");
						} else if (b.canBeAteBy(a)) {
							b.die();
							System.out.println("DEATH ###################");
						}
					}
				}
			}

			for (int i = 0; i < ani.size(); i++) {
				// ani.get(i).grow();
				//ani.get(i).displayPos();
				g.addAnimal(ani.get(i).getPostX(), ani.get(i).getPostY(), ani.get(i).getName());

				if (ani.get(i).isTimeToMove()) {
					ani.get(i).move();
				}

				// ani.get(i).grow();

				// ani.get(2).die();
				g.displayGrid();
			}

			/*
			 * for(int i=0; i<4;i++) { ani.get(0).displayPos();
			 * ani.get(0).move(); g.displayGrid();
			 * 
			 * }
			 */
			// ani.get(0).die();
			// for (int j = 0; j < ani.size(); j++) {
			// int compr = 0;
			// compr = ani.get(j).getAge();
			// if (compr == 999) {
			// ani.remove(j);
			// }
			// }

			System.out.println("Wolf will die now");
			ani.get(0).displayPos();
			g.displayGrid();

			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		/*
		 * if (r.canBeAteBy(w)) { System.out.println(
		 * "rabbit can be ate by a wolf"); }
		 * 
		 * if (!w.canBeAteBy(r)) { System.out.println(
		 * "wold cannot be ate by a rabbit"); }
		 */
	}

}
