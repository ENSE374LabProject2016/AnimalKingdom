package labproject;

public class Wolf extends Mammals {
	Wolf() {
		name = 'W';
		this.setPos(10, 10, 'W');
		this.setLifeLimit(40);
	}
	
	  public void move()
	    {
	        this.setPos(1,2, 'W') ;
	    }


	@Override
	public boolean canBeAteBy(Eatable e) {

		if (e.getName() == 'R') {
			return false;
		}

		return false;
	}

	@Override
	public char getName() {
		return name;
	}

}
