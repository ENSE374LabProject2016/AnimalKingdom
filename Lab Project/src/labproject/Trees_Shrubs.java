package labproject;

public class Trees_Shrubs extends Plants {

    Trees_Shrubs()
    {
     name= 'T';
        this.setPos(10,10,'T');
        this.setLifeLimit(10);
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
 