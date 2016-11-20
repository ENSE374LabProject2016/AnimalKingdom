package labproject;

public class Trees_Shrubs extends Plants {

    Trees_Shrubs()
    {
     name= 'T';
        this.setPost(10,1);
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
 