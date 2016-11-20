package labproject;

public class Hawk extends Birds {
    public Hawk()
        {
        name= 'H';
        this.setPos(5,10,'H');
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
