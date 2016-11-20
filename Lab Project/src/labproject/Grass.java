package labproject;

public class Grass extends Plants {

    public Grass()
        {
        name= 'D';
        this.setPos(1,20,'G');
        this.setLifeLimit(40);
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
