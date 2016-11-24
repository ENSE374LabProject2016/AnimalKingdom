package labproject;

public class Wolf extends Mammals {
	Wolf() {
		name = 'W';
		this.setPost(10, 10);
		this.setLifeLimit(40);
		
	}
	
	  public void move()
	    {
	        this.setPost(getPostX()+6,getPostY()+6) ;
	    }


	@Override
	public boolean canBeAteBy(Eatable e) {

		if (e.getName() == 'R'||e.getName() == 'D'||e.getName() == 'B'||e.getName() == 'G'||e.getName() == 'H'
		    ||e.getName() == 'M'||e.getName() == 'F'||e.getName() == 'S'||e.getName() == 'T'||e.getName() == 'C'
		    ||e.getName() == 'P') {
			return false;
		}

		return false;
	}

	@Override
	public char getName() {
		return name;
	}

}
