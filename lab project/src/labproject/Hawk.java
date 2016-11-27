package labproject;

public class Hawk extends Birds {
    public Hawk()
        {
        name= 'H';
        this.setPost(5,10);
        this.setLifeLimit(30);
        
        super.moveStep = 1;
        }

	@Override
	public char getName() {
		
		return name;
	}

	@Override
	public boolean canBeAteBy(Eatable e) {
		
		return false;
	}

}
