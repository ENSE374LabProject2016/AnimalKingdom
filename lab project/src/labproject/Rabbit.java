package labproject;

public class Rabbit extends Mammals {

    public Rabbit()
        {
        name= 'R';
        this.setPost(15,10);
        this.setLifeLimit(10);
        
        }

	@Override
	public boolean canBeAteBy(Eatable e) {
		
		if (e.getName() == 'W') {
			return true;
		}
		
		
		return false;
	}

	@Override
	public char getName() {
		return name;
	}

	
} 
