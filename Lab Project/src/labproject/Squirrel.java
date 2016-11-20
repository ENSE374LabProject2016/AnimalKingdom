package labproject;

public class Squirrel extends Mammals{
    Squirrel()
    {
         name= 'S';
        this.setPos(20,5,'S');
        this.setLifeLimit(20);
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
