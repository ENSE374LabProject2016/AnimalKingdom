package labproject;

public class Fox extends Mammals{
    public Fox()
        {
        name= 'F';
        this.setPost(10,30);
        this.setLifeLimit(20);
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
