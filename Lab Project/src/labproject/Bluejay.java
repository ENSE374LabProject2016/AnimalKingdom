package labproject;

public class Bluejay extends Birds{
    
    Bluejay()
    {
        name= 'B';
        this.setPost(5,5);
        this.setLifeLimit(30);
        
    }

	@Override
	public char getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public boolean canBeAteBy(Eatable e) {
		// TODO Auto-generated method stub
		return false;
	}

	
}
