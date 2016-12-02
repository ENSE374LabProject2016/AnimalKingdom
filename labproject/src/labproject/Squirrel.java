package labproject;

public class Squirrel extends Mammals{
    Squirrel()
    {
         name= 'S';
        this.setPost(20,5);
        this.setLifeLimit(60);
        
        super.moveStep = 3;
    }

	@Override
	public char getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public boolean canBeAteBy(Eatable e) {
		if (e.getName() == 'F'||e.getName() == 'H'){
			
			return true;
		} else {
		return false;
		}
	}


} 
