package labproject;

public class Fox extends Mammals{
    public Fox()
        {
        name= 'F';
        this.setPos(10,30,'F');
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
