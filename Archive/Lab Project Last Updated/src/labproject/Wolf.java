package labproject;

public class Wolf extends Mammals {



	Wolf() {
		name = 'W';
		this.setPost(10, 10);
		this.setLifeLimit(40);
		
		super.moveStep = 1;
	}

//	public void move() {
//		the_Grid[getPostX()][getPostY()] = '.';
//
//		this.setPost(getPostX() + 1, getPostY() + 2);
//		the_Grid[getPostX()][getPostY()] = getName();
//
//		grow();
//	}

	@Override
	public boolean canBeAteBy(Eatable e) {

		
		return false;
	}

	@Override
	public char getName() {
		return name;
	}


}
