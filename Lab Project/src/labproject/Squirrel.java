package labproject;

public class Squirrel extends Mammals{
    Squirrel()
    {
         name= 'S';
        this.setPost(20,5);
        this.setLifeLimit(20);
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
