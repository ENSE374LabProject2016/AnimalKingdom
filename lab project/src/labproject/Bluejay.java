package labproject;

public class Bluejay extends Birds{
    
    Bluejay()
    {
        name= 'B';
        this.setPos(5,5,name);
        this.setLifeLimit(30);
        
    }

	@Override
	public char getName() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean canBeAteBy(Eatable e) {
		// TODO Auto-generated method stub
		return false;
	}

	
}
