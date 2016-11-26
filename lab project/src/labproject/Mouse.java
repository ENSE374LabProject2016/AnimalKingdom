package labproject;

public class Mouse extends Mammals {
    Mouse()
    {
        name= 'M';
        this.setPost(20,20);
        this.setLifeLimit(10);
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
