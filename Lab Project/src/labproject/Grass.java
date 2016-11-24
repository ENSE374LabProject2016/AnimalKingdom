package labproject;

public class Grass extends Plants {

    public Grass()
        {
        name= 'G';
        this.setPost(1,15);
        this.setLifeLimit(40);
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
	public void grow()
	{
		
	}
}
