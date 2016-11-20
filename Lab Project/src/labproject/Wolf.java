package labproject;

public class Wolf extends Mammals {
	Wolf() {
		name = 'W';
		this.setPost(10, 10);
		this.setLifeLimit(40);
		
	}
	
	  public void move()
	    {
	        this.setPost(getPostX()+4,getPostY()+2) ;
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
