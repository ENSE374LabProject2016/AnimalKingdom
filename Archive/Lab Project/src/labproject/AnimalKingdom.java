package labproject;

import java.util.*;

public abstract class AnimalKingdom extends Grid implements Eatable, Movable {

	protected char name;
	protected int id;
	protected int age;
	protected int lifeLimit;
	protected int x;
	protected int y;
	protected int hunger;
<<<<<<< HEAD
	private static int hungerLimit = 100;
	protected int moveStep = 3;
	private int moveCounter = 5;

	
=======
	private static int hungerLimit = 30;

	protected int moveStep = 3;
	private int moveCounter = 5;

	// public static void main(String[] arg)
	// {
	//// AnimalKingdom saskForest = new AnimalKingdom();
	//// saskForest.initalize();
	//// saskForest.iterate();
	////
	// }
>>>>>>> c616e37c658e7c9ab3b00e2dcc118c1766649285
	AnimalKingdom() {
		this.setLifeLimit(20);
		this.setPost(1, 1);

	}

<<<<<<< HEAD
	/*public void initalize() /// this is useless at this point
=======
	public void initalize() /// this is useless at this point
>>>>>>> c616e37c658e7c9ab3b00e2dcc118c1766649285
	{
		this.setPost(10, 10);

		// add Tree at position ( x, y)
		// add Caterpillar at postition (x,y)
		// add blue jay at position (x,y)
		// add fox at position at (X,y)

<<<<<<< HEAD
	}*/
=======
	}
>>>>>>> c616e37c658e7c9ab3b00e2dcc118c1766649285

	public void displayPos() {
		System.out.println(
				this.name + " " + this.getPostX() + " " + this.getPostY() + " " + this.getAge() + " " + getHunger());
	}

	public void die() {

		the_Grid[getPostX()][getPostY()] = '.';
		this.setAge(999);
<<<<<<< HEAD
		Log.add(getName() + " is Dead");
		// this.name= '.';
=======
		 this.name= '.';
>>>>>>> c616e37c658e7c9ab3b00e2dcc118c1766649285

	}

	private void setAge(int i) {
		age = i;
	}

	public void grow() {

		if (age > getLifeLimit() || this.getHunger() > hungerLimit) {
<<<<<<< HEAD
			
			if (age > getLifeLimit())
				//Log.add(getName()+" coz it aged");
			if (this.getHunger() > hungerLimit)
				//Log.add(getName()+" coz it got too hungry");
				this.die();
=======
			System.out.println(getName() + " is Dead");
			System.out.println("^^^^^^^^");
			if (age > getLifeLimit())
				System.out.print(" coz it aged");
			if (this.getHunger() > hungerLimit)
				System.out.print(" coz it got too hungry");
			this.die();
>>>>>>> c616e37c658e7c9ab3b00e2dcc118c1766649285

		} else
			age();

	}

	public boolean checkCollision(AnimalKingdom b) {
		// boolean results =
		return this.getPostX() == b.getPostX() && this.getPostY() == b.getPostY();

	}

	public int getLifeLimit() {
		return lifeLimit;
	}

	public void setLifeLimit(int lifeLimit) {
		this.lifeLimit = lifeLimit;
	}

	public void age() {
		age = getAge() + 1;

	}

	public int getAge() {
		return this.age;
	}

	public void setName(char a) {
		this.name = a;
	}

	// use diplayPos to get both x and y
	public int getPostX() {
		return x;

	}

	public int getPostY() {
		return y;
	}

	public void setPost(int xt, int yt) {
		x = xt;
		y = yt;
	}

	public void setHunger() {
		hunger = hunger + 2;
	}

	public int getHunger() {
		return hunger;
	}
<<<<<<< HEAD
	public void noHunger() {
		hunger = 0;
	}
=======
>>>>>>> c616e37c658e7c9ab3b00e2dcc118c1766649285

	@Override
	public boolean isTimeToMove() {
		moveCounter++;
		return (moveCounter % moveStep) == 0;
	}

	public void move() {
		boolean willMoveRight, willMoveLeft, willMoveUp, willMoveDown;

		willMoveDown = willMoveLeft = willMoveUp = willMoveRight = false;

		the_Grid[getPostX()][getPostY()] = '.';

		Random r1 = new Random();

		willMoveRight = r1.nextInt(10) % 2 == 0;
		if (!willMoveRight) {
			willMoveLeft = r1.nextInt(10) % 2 == 0;
		}

		willMoveUp = r1.nextInt(10) % 2 == 0;
		if (!willMoveUp) {
			willMoveDown = r1.nextInt(10) % 2 == 0;
		}

		if (willMoveRight) {
			if (!isValidPositionForGrid(getPostX() + 1, getPostY())) {
				willMoveRight = false;
				willMoveLeft = true;
			} else {
				this.setPost(getPostX() + 1, getPostY());
			}
		}

		if (willMoveLeft) {
			if (!isValidPositionForGrid(getPostX() - 1, getPostY())) {
				willMoveRight = true;
				willMoveLeft = false;
			} else {
				this.setPost(getPostX() - 1, getPostY());
			}
		}

		if (willMoveUp) {
			if (!isValidPositionForGrid(getPostX(), getPostY() - 1)) {
				willMoveUp = false;
				willMoveDown = true;
			} else {
				this.setPost(getPostX(), getPostY() - 1);
			}
		}

		if (willMoveDown) {
			if (!isValidPositionForGrid(getPostX(), getPostY() + 1)) {
				willMoveUp = true;
				willMoveDown = false;
			} else {
				this.setPost(getPostX(), getPostY() + 1);
			}
		}

		the_Grid[getPostX()][getPostY()] = getName();

	}
}
