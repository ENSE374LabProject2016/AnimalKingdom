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
	private static int hungerLimit = 50;
	protected int moveStep = 3;
	private int moveCounter = 5;

	
	AnimalKingdom() {
		this.setLifeLimit(20);
		this.setPost(1, 1);

	}


	public void displayPos() {
		System.out.println(
				this.name + " " + this.getPostX() + " " + this.getPostY() + " " + this.getAge() + " " + getHunger());
	}

	public void die() {

		the_Grid[getPostX()][getPostY()] = '.';
		this.setAge(999);
		Log.add(getName() + " is Dead");
		// this.name= '.';

	}

	private void setAge(int i) {
		age = i;
	}

	public void grow() {

		if (age > getLifeLimit() || this.getHunger() > hungerLimit) {
			
			if (age > getLifeLimit())
				//Log.add(getName()+" coz it aged");
			if (this.getHunger() > hungerLimit)
				Log.add(getName()+" coz it got too hungry");
				this.die();

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
	public void noHunger() {
		hunger = 0;
	}

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
