package labproject;

public class Bluejay extends Birds{
    
	
    Bluejay()
    {
        name= 'B';
        this.setPost(5,5);
        this.setLifeLimit(30);
        
        super.moveStep = 2;
    }

	@Override
	public char getName() {
		
		return name;
	}

	@Override
	public boolean canBeAteBy(Eatable e) {
		if (e.getName() == 'F') {
			
			return true;
		} else {
			
		return false;
		
		}
	}

	
}
