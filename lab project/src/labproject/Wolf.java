package labproject;

public class Wolf extends Mammals {
	Wolf() {
		name = 'W';
		this.setPost(10, 10);
		this.setLifeLimit(40);
		
	}
	
	  public void move()
	    {
		  the_Grid[getPostX()][getPostY()] = '.';
		  
		  this.setPost(getPostX()+1,getPostY()+2) ;
		  the_Grid[getPostX()][getPostY()] = getName();
		  
	        grow();
	    }


	@Override
	public boolean canBeAteBy(Eatable e) {

		if (e.getName() == 'R'||e.getName() == 'D'||e.getName() == 'B'||e.getName() == 'G'||e.getName() == 'H'
		    ||e.getName() == 'M'||e.getName() == 'S'||e.getName() == 'T'||e.getName() == 'C'
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
