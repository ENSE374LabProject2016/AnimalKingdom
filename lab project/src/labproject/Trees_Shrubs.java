package labproject;

public class Trees_Shrubs extends Plants {

    Trees_Shrubs()
    {
     name= 'T';
        this.setPost(11,32);
        this.setLifeLimit(100);
    }

	@Override
	public char getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public boolean canBeAteBy(Eatable e) {
		if (e.getName() == 'S'||e.getName() == 'M'||e.getName() == 'B'||e.getName() == 'C'){
			
			return true;
		} else {
		return false;
		}
	}

	@Override
	public boolean isTimeToMove() {
		return false;
	}
}
 