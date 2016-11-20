package labproject;

public class Rabbit extends Mammals {

    public Rabbit()
        {
        name= 'R';
        this.setPos(15,10,'R');
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

	@Override
	public void grow() {
		// TODO Auto-generated method stub
//		super.grow();
		
	}
	
	
	
} 
